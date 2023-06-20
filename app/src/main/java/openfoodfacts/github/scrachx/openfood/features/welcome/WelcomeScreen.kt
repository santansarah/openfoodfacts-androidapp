package openfoodfacts.github.scrachx.openfood.features.welcome

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import openfoodfacts.github.scrachx.openfood.R

internal enum class WelcomeScreen(
    @field:DrawableRes @DrawableRes val welcomeImage: Int,
    @field:ColorRes @ColorRes val color: Int,
    @field:StringRes @StringRes val titleText: Int,
    @field:StringRes @StringRes val msgText: Int,
    @field:ColorRes @ColorRes val textColor: Int,
    val skipText: String = "Skip",
    val nextText: String = "Next"
) {

    INTRO(R.drawable.ic_barcode,
        R.color.bg_welcome_intro,
        R.string.title_welcome_intro,
        R.string.msg_welcome_intro,
        R.color.white),
    SCREEN_1(R.drawable.ic_nutriscore_c,
        R.color.bg_welcome_nutriscore,
        R.string.title_welcome_nutriscore,
        R.string.msg_welcome_nutriscore,
        R.color.white),
    SCREEN_2(R.drawable.ic_nova_group_4,
        R.color.bg_welcome_nova,
        R.string.title_welcome_nova,
        R.string.msg_welcome_nova,
        R.color.white),
    SCREEN_3(R.drawable.ic_ecoscore_b,
        R.color.bg_welcome_ecoscore,
        R.string.title_welcome_ecoscore,
        R.string.msg_welcome_ecoscore,
        R.color.white),
    ANALYTICS(R.drawable.ic_analytics_white_24,
        R.color.bg_welcome_matomo,
        R.string.title_welcome_matomo,
        R.string.msg_welcome_matomo,
        R.color.black,
        "Decline",
        "Grant");

    companion object {
        operator fun get(position: Int) = values()[position]
    }
}