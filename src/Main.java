/*
Practicando interfacez... Pildoras informaticas
 * @author aldemaro
 */
public class Main {

    public static void main(String[] args) {
        Jefatura jefe_RRHH = new Jefatura("Aldemaro",90000,2018,8,21);
        jefe_RRHH.estableceIncentivo(15000);
        Empleado [] losEmpleados = new Empleado[5];
        losEmpleados[0] = new Empleado("Edicson",50000,2017,6,20);
        losEmpleados[1] = new Empleado("Edicson",50000,2017,6,20);
        losEmpleados[2] = new Empleado("Edicson",50000,2017,6,20);
        losEmpleados[3] = jefe_RRHH;
        losEmpleados[4] = new Jefatura("Irina",90000,2015,6,12);
        
        for(Empleado e: losEmpleados){
            System.out.println("nombre: "+e.dimeNombre()+", id: "+e.dameId()+", sueldo: "
                    +e.dimeSueldo());
        }
        
    }
    
}
