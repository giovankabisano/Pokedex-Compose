package giovanka.pokedex

import androidx.compose.Composable

interface Root {

    sealed class Routing {
        object Home : Routing()
        object Pokedex : Routing()
    }

    companion object {
        @Composable
        fun Content(defaultRouting: Routing = Routing.Home) {
//            Router("Root", defaultRouting) { backStack ->
//                val onMenuItemSelected: (MenuItem) -> Unit = {
//                    when (it) {
//                        MenuItem.Pokedex -> backStack.push(Routing.Pokedex)
//                    }
//                }
//
//                when (backStack.last()) {
//                    is Routing.Home -> Home.Content(onMenuItemSelected)
//                    is Routing.Pokedex -> Pokedex.Content()
//                }
//            }
        }
    }
}
