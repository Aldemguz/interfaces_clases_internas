import java.util.*;

public class Empleado {
    // Attributes
    private final String nombre;
    private double sueldo;
    private Date altaContrato;
    private final int id;
    private static int nextid =1;
    
    //methods
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        this.nombre=nom;
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        this.altaContrato = calendario.getTime();
        this.id = nextid;
        nextid++;
    }
    
    public Empleado(String nombre){
        this(nombre,3000,2000,01,01);
    }
    
    public int dameId(){
        return id;
    }
    
    public String dimeNombre(){ //Getter
        return nombre;
    }
    
    public double dimeSueldo(){ //Getter
        return sueldo;
    }
    
    public Date dimeFechaContrato(){ //Getter
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
}
