/*
 clase Abstracta persona.

 *
 * @author aldemaro
 */
public abstract class Persona {
    
    private final String nombre;
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    public String dimeNombre(){
        return nombre;
    }
    
    public abstract String dimeDescripcion();
}
