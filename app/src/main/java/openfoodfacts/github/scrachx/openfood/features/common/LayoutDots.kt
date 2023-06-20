package openfoodfacts.github.scrachx.openfood.features.common

import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import openfoodfacts.github.scrachx.openfood.R

data class LayoutDotColors(
    val baseColor: Color,
    val selectedColor: Color
)

@Composable
fun LayoutDots(
    count: Int,
    selectedPosition: Int,
    layoutDotColors: LayoutDotColors
) {
    Row(
        modifier = Modifier.padding(10.dp)
    ) {
        repeat(count) {

            val backgroundColor =
                if (selectedPosition == it)
                    layoutDotColors.selectedColor else layoutDotColors.baseColor

            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(backgroundColor)
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewWelcomeScreen() {

    val params = LayoutDotColors(
        colorResource(id = R.color.bg_welcome_intro),
        colorResource(id = R.color.black)
    )

    LayoutDots(5,3,params )

}