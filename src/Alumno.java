/*
 Clase Alumno
 * @author aldemaro
 */
public class Alumno extends Persona{
    private String carrera;
    
    public Alumno(String nom, String carrera){
        super(nom);
        this.carrera = carrera;
    }
    
    @Override
    public String dimeDescripcion(){
        return "Estudiante: "+super.dimeNombre()+", Carrera: "+carrera;
    }
    
}
