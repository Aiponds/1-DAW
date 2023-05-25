import java.util.Scanner;
public class Prueba {
    public static void main(String[]args) {
        menu();
    }

    public static void menu() {
        //Variables
        char salir='x';
        byte opcion;
        //Desarrollo
        do {
            System.out.println("\nIntroduce la opcion: ");
            System.out.println("\t0. Salir");
            System.out.println("\t1. asdasdasd");
            System.out.print("\tOpcion: ");
            opcion=new Scanner(System.in).nextByte();
            switch(opcion) {
                case 0 : {
                    System.out.print("\nSeguro que quieres salir? (s = salir): ");
                    salir=new Scanner(System.in).next().charAt(0);
                    salir=Character.toLowerCase(salir);
                }
                break;
                case 1 : {

                }
                break;
                default : {
                    System.out.println("No es válido.");
                }
            }
        }while(salir!='s');
        System.out.println("Has decidido salir, adios.");
    }//Fin Menu
}