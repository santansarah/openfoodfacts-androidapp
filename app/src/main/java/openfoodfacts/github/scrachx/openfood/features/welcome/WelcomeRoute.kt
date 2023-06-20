package openfoodfacts.github.scrachx.openfood.features.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun WelcomeRoute(
    currentScreen: WelcomeScreen,
    onSkipClick: () -> Unit,
    onNextClick: () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(currentScreen.color)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier
                .weight(1f, true),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            WelcomeContent(currentScreen = currentScreen)
        }

        WelcomeBottomBar(
            currentScreen = currentScreen,
            onSkipClick = onSkipClick,
            onNextClick = onNextClick
        )
    }

}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun PreviewWelcomeRoute() {

    WelcomeRoute(WelcomeScreen.INTRO, {}, {})

}