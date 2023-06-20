package openfoodfacts.github.scrachx.openfood.features.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import openfoodfacts.github.scrachx.openfood.features.common.LayoutDotColors
import openfoodfacts.github.scrachx.openfood.features.common.LayoutDots
import openfoodfacts.github.scrachx.openfood.utils.darken
import openfoodfacts.github.scrachx.openfood.utils.lighten

@Composable
internal fun WelcomeBottomBar(
    currentScreen: WelcomeScreen,
    onSkipClick: () -> Unit,
    onNextClick: () -> Unit
) {

    Column() {

        Divider(thickness = 1.dp, color = colorResource(id = currentScreen.textColor))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = colorResource(id = currentScreen.textColor)
                ),
                shape = RectangleShape,
                onClick = { onSkipClick() }) {
                Text(
                    text = currentScreen.skipText.uppercase()
                )
            }

            val color = colorResource(id = currentScreen.color).toArgb()
            val lightColor = Color(color.lighten(0.85f))
            val darkColor = Color(color.darken(0.1f))

            LayoutDots(
                count = WelcomeScreen.values().size,
                selectedPosition = WelcomeScreen.values().indexOf(currentScreen),
                layoutDotColors = LayoutDotColors(lightColor, darkColor)
            )

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = colorResource(id = currentScreen.textColor)
                ),
                shape = RectangleShape,
                onClick = { onNextClick() }) {
                Text(
                    text = currentScreen.nextText.uppercase()
                )
            }
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true,
    backgroundColor = 0xFFf64c73
)
@Composable
fun PreviewWelcomeBottomBar() {

    WelcomeBottomBar(WelcomeScreen.INTRO, {}, {})

}