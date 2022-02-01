package Fundamentals;
//import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        
        numConsec();
        numImpares();
        sumNumeros();
        promNumeros();
        recorreArr();
        encontrarMax();
        arregloImpares();
        mayorY();
        eliminaNegativo();
        minMaxProm();
        
    }
    
    public static void numConsec() {
        System.out.println("------ Números consecutivos (1 - 255) ------");
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public static void numImpares() {

        System.out.println("------ Números impares (1 - 255) ------");
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
    }

    public static void sumNumeros() {
        System.out.println("------ Suma de números (1 - 255) ------");
        int suma = 0;
        for (int i = 0; i <= 255; i++) {
            suma = suma + i;
            System.out.println(suma);
        }
    }

    public static void promNumeros() {
        
        System.out.println("------ Promedio de números ------");
        int arreglo[] = {1, 3, 4, 8};
        int sum = 0;
        for(int i = 0; i < arreglo.length; i++) {
            sum = sum + arreglo[i];
        } 
        int prom = sum / arreglo.length;
        System.out.println("El promedio es: " + prom);
        
    }

    public static void recorreArr() {
        System.out.println("------ Recorrer Arreglo ------");
        int[] myArray = { 1, 3, 5, 7, 9, 13 };
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void encontrarMax() {
        int[] maxArray = {-4, -2, 0, -12, 16, 5};
        int maxNum = maxArray[0];
        for (int i : maxArray) {
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println(maxNum);
    }

    public static void arregloImpares() {
        System.out.println("------ Arreglo Impares ------");
        int [] arregloY;
        arregloY = new int [255];
        for (int i = 0; i < arregloY.length ; i++) {
            if (i % 2 != 0) {
                arregloY [i] = i;
            }
        }
        
        for (int i = 0; i < arregloY.length; i++) {
            System.out.println(arregloY[i]);
        }
    }

    public static void mayorY() {
        
        System.out.println("------ Mayor que Y ------");
        int array[] = {2, 4, 6, 9};
        int y = 5;
        int cant = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < y){
                cant = cant + 1;
            }
        }
        System.out.println(cant);
    }

    public static void eliminaNegativo() {

        System.out.println("------ Elimina Números Negativos ------");
        int arreglo [] = {1, 5, 10, -2};
        int negativo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (!(arreglo[i] >= 1)) {
                arreglo [i] = arreglo[i] + negativo;
            }
        }
        System.out.println(arreglo);
    }

    public static void minMaxProm() {
        System.out.println("------ Minimo, Máximo y Promedio ------");
        int arraygen [] = {1, 5, 10, -2};
        int numMin = arraygen [0];
        int numMax = arraygen [0];
        int suma = 0;

        for (int i = 0; i < arraygen.length; i++) {
            suma = suma + arraygen[i];
        }
        
        int promedio = suma / arraygen.length;

        for (int i : arraygen) {

            if (i > numMax) {
                numMax = i;
            }
            if (i < numMin) {
                numMin = i;
            }
            
        }
        System.out.println("El mínimo es: " + numMin);
        System.out.println("El máximo es: " + numMax);
        System.out.println("El promedio es: " + promedio);
    }

}
