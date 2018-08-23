/*

 * @author aldemaro
 */
public class Jefatura extends Empleado implements Jefes {
    private double incentivo;
    
    public Jefatura(String nombre, double sueldo, int agno, int mes, int dia){
        
        super(nombre,sueldo,agno,mes,dia);
    }
    
    public void estableceIncentivo(double incentivo){ //Setter
        this.incentivo = incentivo;
        this.setSueldo(super.dimeSueldo()+incentivo);
    }
   
    @Override
    public String tomarDecisiones(String decision){
        return "Un miembro tomo la decision de: "+decision;
    } 
    
}
