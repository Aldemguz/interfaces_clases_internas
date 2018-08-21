/*
 Interfaces y clases internas. Pildoras informaticas.

interfaces: Conjunto de directrices que deben cumplir las clases. (suena a clases abstract)
las interfaces establecen los comportamientos que deben cumplir las clases q las implementan

las interfaces solo contienen metodos abstractos y constantes.
las interfaces se almacenan en fichero.class

no se pueden instanciar (usar operador new).

todos los metodos son metodos publicos y abstractos

class <name1> extends <class2> implements <interfaz1>,<interfaz2>...
 * @author aldemaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona [] lasPersonas = new Persona[3];
       lasPersonas[0] = new Empleado("Aldemaro",6000,2018,8,21);
       lasPersonas[1] = new Alumno("Aldemaro","Ing de Sistemas");
       lasPersonas[2] = new Jefatura("Pepe",70000,2016,3,15);
       
       for(Persona e: lasPersonas){
           System.out.println(e.dimeDescripcion());
            }
    }
    
}
