package giovanka.pokedex.ui.common

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.res.loadImageResource

@Composable
fun LoadImage(imageResId: Int, tint: Color? = null) {
    (+loadImageResource(imageResId)).resource.resource?.let {
        DrawImage(
            image = it,
            tint = tint
        )
    }
}
