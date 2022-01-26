public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulatorObject = new StringManipulator();
        // Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena.
        System.out.println(manipulatorObject.trimAndConcat("     Hola     ","     Mundo     "));

        char letter = 'n';
        // Obtener el índice del caracter dado y devolverlo o devolver -1.
        System.out.println(manipulatorObject.getIndexOrNull("NTT Data",letter));
        System.out.println(manipulatorObject.getIndexOrNull("Hola Mundo",letter));
        System.out.println(manipulatorObject.getIndexOrNull("Saludar",letter));

        // Obtener el índice donde empieza la subcadena dada y devolverlo o devolver -1.
        System.out.println(manipulatorObject.getIndexOrNull("Hola","la"));
        System.out.println(manipulatorObject.getIndexOrNull("Hola","mundo"));
        
        //Obtener una subcadena utilizando un índice de inicio y un índice de finalización
        // y concatenarlo con la segunda cadena de entrada en nuestro método.
        System.out.println(manipulatorObject.concatSubstring("Hola", 1, 3, "mundo"));
    }
}
