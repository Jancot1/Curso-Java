package POO;

import java.util.Scanner;

public class BatTest {
    public static void main(String[] args) {
        
        Bat b = new Bat();
        boolean salir = false;  

        do {
            System.out.println("----- Ingrese una acción para el Murcielago -----");
            System.out.println("[1] Comer Humanos");
            System.out.println("[2] Atacar la Ciudad");
            System.out.println("[3] Volar");
            System.out.println("[0] Salir");
            Scanner op = new Scanner(System.in);
            int opcion = op.nextInt();
            switch (opcion) {
                case 1:
                    b.eatHumans();
                    b.nivel = b.nivel + 25;
                    b.displayEnergy(b.nivel);
                    break;
                case 2:
                    b.nivel = b.nivel - 100;
                    b.attackTown();
                    b.displayEnergy(b.nivel);
                    break;
                case 3:
                    b.fly();
                    b.nivel = b.nivel - 10;
                    b.displayEnergy(b.nivel);
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
