package giovanka.pokedex.ui.pokemonList

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Surface
import androidx.ui.res.colorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview
import giovanka.pokedex.R
import giovanka.pokedex.model.PokemonCard
import giovanka.pokedex.model.color
import giovanka.pokedex.ui.common.PokeBallSmall
import giovanka.pokedex.ui.common.PokemonTypeLabels
import giovanka.pokedex.ui.common.TypeLabelMetrics.Companion.SMALL

@Composable
fun ListItem(
    pokemon: PokemonCard,
    onPokemonSelected: (PokemonCard) -> Unit
) {
    Surface(
        color = +colorResource(pokemon.color()),
        shape = RoundedCornerShape(16.dp)
    ) {
        Ripple(bounded = true) {
            Clickable(onClick = { onPokemonSelected(pokemon) }) {
                PokeDexCardContent(pokemon)
            }
        }
    }
}

@Composable
private fun PokeDexCardContent(pokemonCard: PokemonCard) {
    Stack(
        modifier = Height(120.dp) wraps ExpandedWidth
    ) {
        positioned(topInset = 8.dp, leftInset = 12.dp) {
            Column {
                PokemonName(pokemonCard.name)
                PokemonTypeLabels(pokemonCard.typeOfPokemon, SMALL)
            }
        }

        positioned(topInset = 10.dp, rightInset = 8.dp) {
            PokemonId(pokemonCard.id)
        }

        positioned(bottomInset = (-10).dp, rightInset = (-5).dp) {
            Container(width = 96.dp, height = 96.dp) {
                PokeBallSmall(
                    Color.White,
                    0.25f
                )
            }
        }

//        pokemonCard.image?.let { image ->
//            positioned(bottomInset = (8).dp, rightInset = (8).dp) {
//                Container(width = 72.dp, height = 72.dp) {
//                    DrawImage(image = +imageResource(image))
//                }
//            }
//        }
    }
}

@Composable
private fun PokemonName(text: String?) {
    Text(
        text = text ?: "",
        style = TextStyle(
            fontFamily = FontFamily("Roboto"),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = +colorResource(R.color.white_1000)
        ),
        modifier = Spacing(bottom = 8.dp)
    )
}

@Composable
private fun PokemonId(text: String?) {
    Opacity(opacity = 0.1f) {
        Text(
            text = text ?: "",
            style = TextStyle(
                fontFamily = FontFamily("Roboto"),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        )
    }
}

@Preview
@Composable
fun previewListItem() {
    ListItem(PokemonCard("wlwl", "lol", listOf("shit")), onPokemonSelected = {})
}