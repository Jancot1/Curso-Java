package Fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> ejercicio1(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] array = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        int suma = 0;
    
        for(int element:array){
            suma = suma + element;
            if (element > 10) {
                arrayList.add(element);
            }
        }

        System.out.println(suma);
        return arrayList;
    }

    public ArrayList<String> ejercicio2() {
        ArrayList <String> arrList = new ArrayList<String>();
        ArrayList <String> arrayNombres = new ArrayList<String>();

        arrayNombres.add("Nancy");
        arrayNombres.add("Jinichi");
        arrayNombres.add("Fujibayashi");
        arrayNombres.add("Momochi");
        arrayNombres.add("Ishikawa");

		Collections.shuffle(arrayNombres);
        for (String element:arrayNombres) {

            System.out.println(element);

            if (element.length() > 5) {
                arrList.add(element);
            }
        }
        return arrList;
    }

    public void ejercicio3() {
        ArrayList <String> arrayList=new ArrayList<String>();
		
		for(int i=65;i<=90;i++) {
			arrayList.add(Character.toString((char) i));
		}		
		Collections.shuffle(arrayList);
		System.out.println("Ultima Letra del arreglo: " + arrayList.get(arrayList.size() - 1));
		if(arrayList.get(0).equals("A") || arrayList.get(0).equals("E") || arrayList.get(0).equals("I") || 
        arrayList.get(0).equals("O") || arrayList.get(0).equals("U")) {
			System.out.println("La primera letra del arreglo es: " + arrayList.get(0));
		}else {
			System.out.println("La primera Letra: " + arrayList.get(0));
		}
    }

    public ArrayList<Integer> ejercicio4(){
        ArrayList <Integer> arrayList = new ArrayList<Integer>();

        int aleatorio = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            aleatorio = r.nextInt(40);
            aleatorio = aleatorio + 55;
            arrayList.add(aleatorio);
        }
        return arrayList;
    }

    public ArrayList<Integer> ejercicio5(){
        ArrayList <Integer> arrayList = new ArrayList<>();

        int aleatorio = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            aleatorio = r.nextInt(40);
            aleatorio = aleatorio + 55;
            arrayList.add(aleatorio);
        }

        Collections.sort(arrayList);

        System.out.println("El número mínimo es: " + arrayList.get(0));
        System.out.println("El número máximo es : " + arrayList.get(arrayList.size() - 1));
        return arrayList;
    }

    public String ejercicio6() {
        String cadena = "";
        int aleatorio = 0;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            aleatorio = random.nextInt(25);
            aleatorio = aleatorio + 65;
            cadena = cadena + Character.toString((char) aleatorio);
        }
        return cadena;
    }

    public ArrayList<String> actividad7() {
		ArrayList<String> arrayList=new ArrayList<String>();
		String cadena = "";
		
		int aleatorio = 0;
		Random random = new Random();
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 5; i++) {
				aleatorio = random.nextInt(25);
				aleatorio = aleatorio + 65;
				cadena = cadena + Character.toString((char) aleatorio);
			}
			arrayList.add(cadena);
			cadena = "";
		}
		return arrayList;
	}
}
