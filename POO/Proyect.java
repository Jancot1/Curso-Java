package POO;

public class Proyect {
    
    private String name;
    private String description;

    public Proyect(){

    }

    public Proyect (String name){
        this.name = name ;
    }

    public Proyect (String name, String description) {

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

      
}