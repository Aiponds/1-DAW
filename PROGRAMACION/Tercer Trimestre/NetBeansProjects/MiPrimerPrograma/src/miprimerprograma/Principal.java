/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma;
import java.util.Scanner;
import misegundoprograma.CuentaCorriente;

/**
 *
 * @author Victor
 */
class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        usoPersona();
        usoCuentaCorriente();
    }
    public static void usoPersona(){
        Persona p1 = new Persona(); //VALORES INICIALIZADOS MEDIANTE EL CONSTRUCTOR BASE
        Persona p2 = new Persona("Antonio",(byte)19,1.48,"123456789A"); //CREADO CON CONSTRUCTOR
        System.out.println(p1); //MUESTRA LA REFERENCIA DEL OBJETO
        p1.saludar();
        System.out.println("Edad de "+p1.nombre+" = " + p1.edad);
        p1.cumplirAnyos();
        System.out.println("Edad de "+p1.nombre+" al cumplir años = " + p1.edad);
        Persona.hoy = "Miercoles";
        System.out.println("Hoy es "+Persona.hoy);
        Persona.hoyEs(4); //JUEVES
        System.out.println("Hoy es "+Persona.hoy);
        System.out.println("El dni de PERSONA2 es "+p2.dni);
    }

    public static void usoCuentaCorriente() {
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
