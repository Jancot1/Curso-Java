package POO;

public class Wizard extends Human {
    public int health = 50;
    int intel = 8;
    int cura;
    int damage;

    public int heal(int health) {
        System.out.println("*El Mago lanza un hechizo de curación* (+8 Health)");
        cura = health + 8;
        return cura;
    }
    
    public float fireBall(Float health) {
        System.out.println("*El Mago lanza una bola de fuego*");
        damage = intel * 3;
        health = health - damage;
        return health;
    }
}
