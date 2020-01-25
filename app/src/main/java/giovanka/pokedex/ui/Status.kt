package giovanka.pokedex.ui

import androidx.compose.Model
import androidx.compose.frames.ModelList

/**
 * Class defining the screens we have in the app: PokemonList, PokemonDetails and Map
 */
sealed class Screen {
    object PokemonList : Screen()
    data class PokemonDetail(val pokemonId: String) : Screen()
    object Map : Screen()
}

@Model
object PokedexStatus {
    var currentScreen: Screen = Screen.PokemonList
    val favorites = ModelList<String>()
    val selectedTopics = ModelList<String>()
}

/**
 * Temporary solution pending navigation support.
 */
fun navigateTo(destination: Screen) {
    PokedexStatus.currentScreen = destination
}
