package AdvancePoo;

import java.util.List;

public interface PokemonInterface {
    Pokemon createPokemon (String name, String type, int health);
    List<Pokemon> pokemonInfo(Pokemon pokemon);
    void listPokemon();
}
