import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put(" Bohemian Rhapsody ", " Is this the real life? Is this just fantasy? Caught in a landside... ");
        trackList.put(" I Want to Break Free ", " I want to break free, I want to break free from your lies. You're so self satisfied I don't need you... ");
        trackList.put(" Don't Stop Me Now ", " Tonight I'm gonna have myself a real good time. I feel alive... ");
        trackList.put(" Another One Bites the Dust ", " Steve walks warily down the street with his brim pulled way down low, ain't no sound but the sound of his feet... ");


        String cancion = trackList.get(" I Want to Break Free ");
        System.out.println("------ Cancion Extraida por Titulo ------");
        System.out.println(cancion);
        
        System.out.println("------ Lista de Canciones ------");
        for (String i : trackList.keySet()) {
            
            System.out.println("Track: " + i + " Lyrics: " + trackList.get(i));
        }
        
    }
}
