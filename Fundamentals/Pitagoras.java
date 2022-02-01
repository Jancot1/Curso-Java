package Fundamentals;

public class Pitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {
        double cateto1 = 2;
        double cateto2 = 3;
        double hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hypo;
    }
}

