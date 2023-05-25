package Victor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Auxiliar_Victor{
    //colores
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    //peticiones
    public static char pedirLetra() {
        return new Scanner(System.in).next().charAt(0);
    }
    public static int pedirNum() {
        int num;
        try {
            num = new Scanner(System.in).nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("¡Introduce un número entero!");
            return pedirNum();
        }
    }
    //menu y salida
    public static void usarMenu() {
        char opcion;
        boolean salir=false;
        do {
            //MOSTRAR OPCIONES MENU
            System.out.print("Opcion: ");
            opcion = new Scanner(System.in).next().charAt(0);
            switch (opcion) {
                case '0':
                    salir=confirmarSalida();
                    break;
                case '1':
                    //TODO
                    break;
                case '2':
                    //TODO
                    break;
                case '3':
                    //TODO
                    break;
                default:
                    System.out.println("No válido.");
            }
        }while(salir!=true);
    }
    public static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("Seguro que quieres salir? s=salir");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
//    para comparar atributos de objetos
//    agregar esto en cabecera: implements Comparable<Contactos>
//    Comparar strings de objetos
//    @Override
//    public int compareTo(Persona otraPersona) {
//        return this.nombre.compareTo(otraPersona.nombre); //observa la recursividad en este metodo
//    }
//    //comparar ints de objetos
//    @Override
//    public int compareTo(Persona otraPersona) {
//        return Integer.compare(this.edad, otraPersona.edad);
//    }
}
