package AdvancePoo;

public class Pokedex extends AbstractPokemon {

    int myPokemons;

    @Override
    public void listPokemon() {
        // TODO Auto-generated method stub
        Pokemon pokemon = new Pokemon();
        System.out.println("----- Lista de Pokemones -----");
        for (int i = 0; i < pokemon.poke.size(); i++) {
            
            System.out.println(pokemon.poke.get(i).getName());
        }
        Pokemon.countPokemon = myPokemons;
        System.out.println("Cantidad de Pokemones: " + myPokemons);
    }
    
}
