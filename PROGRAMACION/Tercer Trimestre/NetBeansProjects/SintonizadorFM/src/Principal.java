import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here 
        usarMenu();
    }

    private static void usarMenu() {
       char opcion;
       boolean salir=false;
       Sintonizador europaFM = new Sintonizador(82);
       Sintonizador los40 = new Sintonizador(90);
       europaFM.frecuenciaDisplay();
       do {
           System.out.println("\nIntenta sintonizar EuropaFM");
           System.out.println("0.Salir");
           System.out.println("1.Subir frecuencia.");
           System.out.println("2.Bajar frecuencia");
           System.out.println("3.Mostrar frecuencia");
           System.out.print("Opcion: ");
           opcion = new Scanner(System.in).next().charAt(0);
           switch (opcion) {
               case '0':
                   salir=confirmarSalida();
                   break;
               case '1':
                   europaFM.frecuenciaUp();
                   break;
                case '2':
                   europaFM.frecuenciaDown();
                   break;
                case '3':
                   europaFM.frecuenciaDisplay();
                   break;
               default:
                   System.out.println("No válido.");
           }
       }while(salir!=true);
       System.out.println("Vamos a comprobar si tu radio es igual a mi radio.");
       europaFM.iguales(los40);
    }

    private static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("Seguro que quieres salir? s=salir");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
}