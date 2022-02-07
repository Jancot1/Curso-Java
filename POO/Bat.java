package POO;

public class Bat {

    public int nivel = 300;

    public void fly() {
        System.out.println("*Comienza a volar el Murcielago*");
    }

    public void eatHumans() {
        System.out.println("Bueno, no importa");
    }

    public void attackTown() {
        System.out.println("*La ciudad comienza a ser atacada por el Murcielago*");
    }

    public void displayEnergy(int nivel) {
        
        System.out.println("El nievel de Energía del Murcielago es: " + nivel);
    }
}
