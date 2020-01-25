package giovanka.pokedex.ui

import android.view.MenuItem
import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.tooling.preview.Preview

interface PokemonList {

    companion object {
        @Composable
        fun Content(onMenuItemSelected: (MenuItem) -> Unit) {
            VerticalScroller {

            }
        }
    }
}


@Preview
@Composable
fun PreviewMainScreen() {
    PokemonList.Content(onMenuItemSelected = {})
}
