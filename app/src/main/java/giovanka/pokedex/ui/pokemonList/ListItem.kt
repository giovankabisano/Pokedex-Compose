package giovanka.pokedex.ui.pokemonList

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.material.surface.Card
import androidx.ui.tooling.preview.Preview

@Composable
fun ListItem(pokemonName: String = "Lol") {
    Card(elevation = 4.dp) {
        Column {
            Text("pokemonName")
        }
    }
}

@Preview
fun PreviewListItem() {
    ListItem()
}