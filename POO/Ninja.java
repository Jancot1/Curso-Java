package POO;

public class Ninja extends Human {
    int stealth = 10;
    public int health = 0;

    public float steal(Float health) {
        System.out.println("*El Ninja se escabulle y roba salud*");
        health = health - 10;
        return health;
    }

    public void runAway() {
        System.out.println("*El Ninja se escapa* (-10 Health)");
        health = health - 10;
    }

}
