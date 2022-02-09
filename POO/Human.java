package POO;

public class Human {
    public int strength = 3;
    public int stealth = 3;
    public int intel = 3;
    public int health = 100;

    public void attack() {
        System.out.println("*El Humano realiza un ataque*");
        health = health - strength;
        System.out.println("La vida del enemigo ahora es: " + health);
    }
}
