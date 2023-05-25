package Herencias;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        // Creamos objetos de la clase Empleado que hereda de Persona.
        Empleado e1 = new Empleado("Victor",(byte)19,1.80,"X6307046D", 1500);
        Empleado e2 = new Empleado("Juanki",(byte)22,1.77,"123456789A", 2000);
        Empleado e3 = new Empleado("Pablo",(byte)23,1.80,"123456789B", 1700);
        
        e1.mostrar();
        e2.mostrar();
        e3.mostrar(); 
    }
}
