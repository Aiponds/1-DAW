package miprimerprograma;

/**
 *
 * @author Victor
 */
public class Empleado extends Persona{
    double salario;
    public Empleado(){
        super();
        this.salario=1000;
    }
    public Empleado(String nombre, byte edad, double estatura, String dni, int salario){
        //prueba
        super(nombre, (byte)edad, estatura, dni);
        this.salario=salario;
    }
    public void incrementarSalario(double incremento){
        this.salario+=incremento;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Salario: "+this.salario);
    }
}
