package POO;

public class ProyectTest {
    public static void main(String[] args) {
        Proyect name = new Proyect();
        Proyect description = new Proyect();
        name.setName("Class Proyect");
        description.setDescription("Esto corresponde a una descripcion");

        String nameProyect = name.getName();
        String descProyect = description.getDescription();

        elevatorPitch(nameProyect, descProyect);
    }
    
    public static void elevatorPitch (String name, String description){
        System.out.println(name + " : " + description);
    }
}
