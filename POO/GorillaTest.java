package POO;
import java.util.Scanner;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        boolean salir = false;

        do {
            
            System.out.println("----- Ingrese una acción para el Gorila -----");
            System.out.println("[1] Lanzar algo");
            System.out.println("[2] Comer Banana");
            System.out.println("[3] Trepar un árbol");
            System.out.println("[0] Salir");
            
            Scanner op = new Scanner(System.in);
            int opcion = op.nextInt();

            switch (opcion){
                case 1:
                    g.throwSomething();
                    g.level = g.level - 5;
                    g.displayEnergy(g.level);
                    break;
                case 2:
                    g.level = g.level + 10;
                    g.eatBananas();
                    g.displayEnergy(g.level);
                    break;
                case 3: 
                    g.climb();
                    g.level = g.level - 10;
                    g.displayEnergy(g.level);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción ingresada no es váldia");
                    break;
            }

        } while (salir);
        
    }
    
}
