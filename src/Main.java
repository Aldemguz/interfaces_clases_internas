/*
Practicando interfacez... Pildoras informaticas
Todas las interfaces son abstractas q tienen puras constantes y metodos abstractos
usando interfaz para utilizar el metodo sort de arrays. 
uso de stanceof
 * @author aldemaro
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Jefatura jefe_RRHH = new Jefatura("Jefe RRHH",90000,2018,8,21);
        jefe_RRHH.estableceIncentivo(15000);
        Empleado [] losEmpleados = new Empleado[5];
        losEmpleados[0] = new Empleado("Empleado 1",50000,2017,6,20);
        losEmpleados[1] = new Empleado("Empleado 2",20000,2016,9,20);
        losEmpleados[2] = new Empleado("Empleado 3",45000,2012,4,21);
        losEmpleados[3] = jefe_RRHH;
        losEmpleados[4] = new Jefatura("Jefe 2",90000,2015,6,12);
        Empleado director_comercial= new Jefatura("Sandra", 86000, 2013,4,13);
        
        Empleado ejemplo = new Empleado("Elisabeth",25000,2013,2,15); //???
        
        if(director_comercial instanceof Jefatura){
            System.out.println("es de tipo Jefatura");
        }
        //Si utiliza alguna de esas intefaz o hereda de otra clase es una instancia
        if(ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }
        
        Arrays.sort(losEmpleados);
        for(Empleado e: losEmpleados){
            System.out.println("nombre: "+e.dimeNombre()+", id: "+e.dameId()+", sueldo: "
                    +e.dimeSueldo());
        }
        
        System.out.println(jefe_RRHH.tomarDecisiones("Invertir en la bolsa"));
        
    }
    
}
