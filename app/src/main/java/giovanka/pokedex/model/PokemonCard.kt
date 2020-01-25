package giovanka.pokedex.model

import giovanka.pokedex.R

data class PokemonCard(
    val id: String,
    val name: String,
    val typeOfPokemon: List<String>? = null
)

fun PokemonCard.color(): Int {
    val type = typeOfPokemon?.elementAtOrNull(0)

    return when (type?.toLowerCase()) {
        "grass", "bug" -> R.color.poke_light_teal
        "fire" -> R.color.poke_light_red
        "water", "fighting", "normal" -> R.color.poke_light_blue
        "electric", "psychic" -> R.color.poke_light_yellow
        "poison", "ghost" -> R.color.poke_light_purple
        "ground", "rock" -> R.color.poke_light_brown
        "dark" -> R.color.poke_black
        else -> return R.color.poke_light_blue
    }
}