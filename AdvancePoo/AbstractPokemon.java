package AdvancePoo;

import java.util.List;

public abstract class AbstractPokemon implements PokemonInterface {

    @Override
    public Pokemon createPokemon(String name, String type, int health) {
        // TODO Auto-generated method stub
        // System.out.println(name);
        // System.out.println(type);
        // System.out.println(health);
        Pokemon pokemon = new Pokemon(name,type,health);
        pokemon.poke.add(pokemon);
        return pokemon;
    }

    @Override
    public List<Pokemon> pokemonInfo(Pokemon pokemon) {
        // TODO Auto-generated method stub
        for (int i = 0; i < pokemon.poke.size(); i++) {
            System.out.println("---- Información del Pokemon " + i + " -----");
            System.out.println(pokemon.poke.get(i));
        }
        return pokemon.poke;
    }
}
