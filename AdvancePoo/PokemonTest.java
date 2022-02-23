package AdvancePoo;

public class PokemonTest {
    public static void main(String[] args) throws Exception{
        
        Pokemon p = new Pokemon();
        Pokedex px = new Pokedex();
        
        // Pokemon 1
        Pokemon saved = px.createPokemon("Charizard","Fuego",300);

        // Pokemon 2
        px.createPokemon("Vaporeon","Agua",100);
        
        //  px.listPokemon();
        //  px.pokemonInfo(p);
        // p.attackPokemon();
        
    }
    
}
