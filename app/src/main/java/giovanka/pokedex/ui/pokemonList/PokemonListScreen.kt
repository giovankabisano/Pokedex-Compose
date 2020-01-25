package giovanka.pokedex.ui.pokemonList

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.withOpacity
import androidx.ui.tooling.preview.Preview
import giovanka.pokedex.R
import giovanka.pokedex.model.PokemonCard
import giovanka.pokedex.ui.VectorImageButton

@Composable
fun PokemonListScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text("Pokedex") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_jetnews_logo) {
                    openDrawer()
                }
            }
        )
        VerticalScroller(modifier = Flexible(1f)) {
            Column {
                Title()
                ContentSection()
            }
        }
    }
}

@Composable
private fun Title() {
    Text(
        modifier = Spacing(top = 16.dp, left = 16.dp, right = 16.dp),
        text = "Giovanka's Pokedex",
        style = ((+MaterialTheme.typography()).subtitle1).withOpacity(0.87f)
    )
    HomeScreenDivider()
}

@Composable
private fun ContentSection() {
    ListItem(pokemon = PokemonCard("Haha", "Stupi", listOf("Shit")), onPokemonSelected = {})
}

@Composable
private fun HomeScreenDivider() {
    Opacity(0.08f) {
        Divider(modifier = Spacing(left = 14.dp, right = 14.dp))
    }
}

@Preview
@Composable
fun preview() {
    PokemonListScreen(openDrawer = {})
}
