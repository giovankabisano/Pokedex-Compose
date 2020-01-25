package giovanka.pokedex.ui

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import giovanka.pokedex.util.BackPressHandler


@Composable
fun PokedexApp() {
    val backPressHandler = BackPressHandler()

    MaterialTheme(
        colors = lightThemeColors
    ) {
        backPressHandler.Provider {

        }
    }
}