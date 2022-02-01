package Fundamentals;
public class StringManipulator {
    public String trimAndConcat(String hola, String mundo) {
        return hola.trim() + mundo.trim();
    }

    public Integer getIndexOrNull(String palabra, char letra) {
        if(palabra.indexOf(letra) == - 1){
            return null;
        }
        return palabra.indexOf(letra);
    }

    public Integer getIndexOrNull(String frase, String subString){
        if (frase.indexOf(subString) == -1){
            return null;
        }
        return frase.indexOf(subString);
    }

    public String concatSubstring(String s1, int inicio, int fin, String s2){
        return s1.substring(inicio, fin) + s2;
    }
    
}
