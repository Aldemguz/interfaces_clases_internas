/*

 * @author aldemaro
 */
public class Jefatura extends Empleado {
    private double incentivo;
    
    public Jefatura(String nombre, double sueldo, int agno, int mes, int dia){
        
        super(nombre,sueldo,agno,mes,dia);
    }
    
    public void estableceIncentivo(double incentivo){ //Setter
        this.incentivo = incentivo;
        this.setSueldo(super.dimeSueldo()+incentivo);
    }
    
    //@Override
    //public double dimeSueldo(){ //Getter y Setter /no debería hacerse
        //double sueldoJefe = super.dimeSueldo()+incentivo;
        //super.setSueldo(sueldoJefe);
     //   return sueldo;
    //}
    
}
