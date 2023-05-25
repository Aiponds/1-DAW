package ctacorriente;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
class CuentaCorriente {
    /*
    DATOS: DNI, NOMBRE TITULAR Y SALDO.
    PERMITIR:
    1. CREAR UNA CUENTA (DNI, NOMBRE TITULAR, SALDO=0)
    2. SACAR DINERO, EL METODO DEBE INDICAR SI HA SIDO POSIBLE LLEVAR A CABO LA OPERACION, SI EXISTE SALDO SUFICIENTE.
    3. INGRESAR DINERO
    4. MOSTRAR INFORMACION: MUESTRA LA INFORMACION DISPONIBLE DE LA CUENTA CORRIENTE.
    */
    final String dni;
    String nombre;
    double saldo;
    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
    }
    String getDni(){
        return this.dni;
    }
    String getNombre(){
        return this.nombre;
    }
    double getSaldo(){
        return this.saldo;
    }
    void sacarDinero(double saldo){
        if(this.saldo<saldo) {
            System.out.println("No se pudo realizar la operacion de retirar el saldo especificado.");
        } else {
            this.saldo-=saldo;
        }
    }
    void ingresarDinero(double saldo){
        this.saldo+=saldo;
    }
    void mostrarInformacion(){
        System.out.println("\nNombre del titular: "+getNombre());
        System.out.println("DNI del titular: "+getDni());
        System.out.println("Saldo disponible: "+getSaldo());
    }
    
}//Fin de la clase.
public class Principal {
    public static void main(String[] args) {
        boolean salir=false;
        double saldo;
        char opcion;
        String nombre, dni;
        System.out.println("Bienvenido al banco. Vamos a crear una cuenta corriente: ");
        nombre=pedirNombre();
        dni=pedirDni();
        CuentaCorriente usuario = new CuentaCorriente(dni, nombre);
        do {
            opcion = pedirOpcionMenu();
            switch (opcion) {
                case '0':
                    salir=confirmarSalida();
                    break;
                case '1':
                    usuario.mostrarInformacion();
                    break;
                case '2':{
                    System.out.print("Cantidad a ingresar: ");
                    saldo = new Scanner(System.in).nextDouble();
                    usuario.ingresarDinero(saldo);
                }
                    break;
                case '3':{
                    System.out.print("Cantidad a retirar: ");
                    saldo = new Scanner(System.in).nextDouble();
                    usuario.sacarDinero(saldo);
                }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (salir!=true);
        System.out.println("Has decidido salir. Adios...");
    }
    public static String pedirNombre(){
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre = new Scanner(System.in).nextLine();
        return nombre;
    }
    public static String pedirDni(){
        String dni;
        System.out.print("Introduce tu dni: ");
        dni = new Scanner(System.in).nextLine();
        return dni;
    }
    public static char pedirOpcionMenu(){
        char opcion;
        informacionMenu();
        System.out.print("Opcion: ");
        opcion = new Scanner(System.in).next().charAt(0);
        return opcion;
    }
    public static void informacionMenu(){
        System.out.println("\nOpciones del banco:");
        System.out.println("0. Salir.");
        System.out.println("1. Mostrar información.");
        System.out.println("2. Ingresar saldo.");
        System.out.println("3. Retirar saldo.");
    }
    public static boolean confirmarSalida(){
        boolean salir;
        char c;
        System.out.println("Estas seguro de que quieres salir? (s=salir)");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        if(c=='s') {
            salir=true;
        } else {
            salir=false;
        }
        return salir;
    }
    
}
