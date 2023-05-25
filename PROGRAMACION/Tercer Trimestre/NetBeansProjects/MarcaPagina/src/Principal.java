
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        usarMenu();
    }
    private static void mostrarOpciones(){
        System.out.println("0.Salir");
        System.out.println("1.Mostrar la pagina.");
        System.out.println("2.Aumentar la pagina.");
        System.out.println("3.Reiniciar lectura.");
    }
    
    private static void usarMenu() {
        char opcion;
        boolean salir=false;
        int incremento;
        MarcaPagina libro = new MarcaPagina();
        do {
            mostrarOpciones();
            System.out.print("Opcion: ");
            opcion = new Scanner(System.in).next().charAt(0);
            switch (opcion) {
                case '0':
                    salir=confirmarSalida();
                    break;
                case '1':
                    libro.verPagina();
                    break;
                case '2': {
                    System.out.print("Introduce cuantas paginas has leido: ");
                    incremento = new Scanner(System.in).nextInt();
                    libro.incrementar(incremento);
                }
                    break;
                case '3':
                    libro.empezar();
                    break;
                default:
                    System.out.println("No válido.");
            }
        }while(salir!=true);
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
