import java.util.*;

public class Empleado extends Persona {
    // Attributes
    private double sueldo;
    private Date altaContrato;
    private final int id;
    private static int nextid =1;
    
    //methods
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        super(nom);
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        this.altaContrato = calendario.getTime();
        this.id = nextid;
        nextid++;
    }
    
    public double dimeSueldo(){ //Getter
        return sueldo;
    }
    
    public int dimeId(){
        return id;
    }
    
    public Date dimeFechaContrato(){ //Getter
        return altaContrato;
    }
    @Override
    public String dimeDescripcion(){
        return "Nombre: "+super.dimeNombre()+", id: "+id+", con sueldo: "+sueldo;
    }
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
}
