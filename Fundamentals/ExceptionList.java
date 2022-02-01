package Fundamentals;
import java.util.ArrayList;

public class ExceptionList {

    public static void main(String[] args) throws Exception {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        try {
            for(int i = 0; i < myList.size(); i++) {
    
                Integer castedValue = (Integer) myList.get(i);
                myList.set(i, castedValue);
            }
            
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("El elemento no puede ser modificado a int");
        }
        System.out.println(myList);

    }

}
