package Herencias;

/**
 *
 * @author Victor
 */
public class Persona {
    protected String nombre;
    protected byte edad;
    protected double estatura;
    protected final String dni;
    protected static String hoy;
    
    public Persona(){
        this.nombre = "Victor";
        this.edad = 10;
        this.estatura = 1.00;
        this.dni="00000000A";
    }
    public Persona(String nombre, byte edad, double estatura, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
    }
        
    public void saludar(){
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado de conocerte");
    }
    public void cumplirAnyos(){
        edad++; //INCREMENTA LA EDAD EN 1.
    }
    public void crecer(double incremento){
        estatura += incremento; //EL INCREMENTO AUMENTA LA ESTATURA.
    }
    public static void hoyEs(int dia){
        switch (dia) {
            case 1: hoy="Lunes";
                break;
            case 2: hoy="Martes";
                break;
            case 3: hoy="Miercoles";
                break;
            case 4: hoy="Jueves";
                break;
            case 5: hoy="Viernes";
                break;
            case 6: hoy="Sabado";
                break;
            case 7: hoy="Domingo";
                break;
            default:
                System.out.println("No es válido");
        }
    }
}
