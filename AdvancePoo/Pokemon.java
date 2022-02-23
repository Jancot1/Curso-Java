package AdvancePoo;

import java.util.List;

public class Pokemon {
    private static String name;
    private static String type;
    private static int health;
        
    public static int countPokemon;

    public List<Pokemon> poke;

    public void attackPokemon(){
        System.out.println("*Lanza un ataque de*");
    }

    //Getter y Setter

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Pokemon.health = health;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Pokemon.type = type;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pokemon.name = name;
    }

    // Constructor

    public Pokemon(){
        
    }

    public Pokemon(String name){
        Pokemon.name = name;
    }

    public Pokemon(String name, String type){
        Pokemon.name = name;
        Pokemon.type = type;
    }

    public Pokemon(String name, String type, int health){
        Pokemon.name = name;
        Pokemon.type = type;
        Pokemon.health = health;
    }
}
