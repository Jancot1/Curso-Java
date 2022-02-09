package POO;

public class HumanTest {
   public static void main(String[] args) {
       Human h = new Human();
       Ninja n = new Ninja();
       Wizard w = new Wizard();
       Samurai s = new Samurai();
       Samurai s2 = new Samurai();

       // ----- Maestro de Objetos parte 1 -----

       h.attack();

       // ----- Maestro de Objetos parte 2 -----
       
       // Wizard: Método heal
        n.health = w.heal(n.health);
        System.out.println("Es curado y La salud del Ninja ahora es: " + n.health);
        
        // Wizard: Método fireBall
        s.salud = w.fireBall(s.salud);
        System.out.println("El Samurai recibe el daño y su vida ahora es: " + s.salud);

        // Ninja: Método steal
        s.salud = n.steal(s.salud);
        System.out.println("La vida del Samurai ahora es: " + s.salud);

        // Ninja: Método runAway
        n.runAway();
        System.out.println("La salud del Nija disminuye en: " + n.health);
       
        // Samurai: Método deathBlow
        System.out.println("*El Wizard ataca al Samurai*");
        w.health = s.deathBlow(w.health);
        
        // Samurai: Método meditate
        s.meditate();
        
        // Samurai: Método howMany
        System.out.println("La cantidad de Samurai son: " + s.howMany());




   } 
}
