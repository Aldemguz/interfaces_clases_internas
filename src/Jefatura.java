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
    }
    
    @Override
    public double dimeSueldo(){
        double sueldoJefe = super.dimeSueldo();
        return sueldoJefe+incentivo;
    }
    
}
