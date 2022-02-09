package POO;

public class Samurai extends Human {
    float regen;
    public float salud = 200;
    public static int cantSamurai = 0;
    
    public Samurai(){
        cantSamurai = cantSamurai + 1;
    }

    public int deathBlow(int health) {
        System.out.println("*El Samurai reliza un corte limpio con su espada*");
        health = health - health;
        System.out.println("La salud del enemigo se reduce a: " + health);
        return health;
    }

    public void meditate() {
        System.out.println("*El Samurai medita y comienza a regenerarse*");
        regen = salud / 2;
        salud = salud + regen;
        System.out.println(salud);
    }

    public static int howMany() {
        return cantSamurai;
    }
}
