package openfoodfacts.github.scrachx.openfood.features.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun WelcomeContent(
currentScreen: WelcomeScreen
) {

    Column(
        //modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(.65f)
                .fillMaxHeight(.3f)
        ) {
            Image(
                painter = painterResource(id = currentScreen.welcomeImage),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            modifier = Modifier.padding(20.dp),
            text = stringResource(id = currentScreen.titleText),
            style = TextStyle(fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            color =  colorResource(id = currentScreen.textColor)
        )

        Text(
            modifier = Modifier.padding(20.dp),
            text = stringResource(id = currentScreen.msgText),
            style = TextStyle(fontSize = 16.sp),
            color =  colorResource(id = currentScreen.textColor),
            textAlign = TextAlign.Center
        )

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewWelcomeScreen() {

    val intro = WelcomeScreen[0]

    WelcomeContent(intro)

}