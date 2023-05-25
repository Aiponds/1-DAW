package prueba;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Figura> figurasGeometricas = new ArrayList<Figura>();
        for (int i = 0; i < 5; i++) {
            figurasGeometricas.add(usarMenu());
        }
        System.out.println(figurasGeometricas.toString());
    }
    private static Figura usarMenu() {
        char opcion;
        boolean salir=false;
        boolean relleno=false;
        String color="";
        double radio, base, altura;
        do { 
            try {
                System.out.println("Para la figura geometrica necesito unos datos...\nIntroduce el color: ");
                color = new Scanner(System.in).nextLine();
                System.out.println("Introduce si está relleno o no.");
                relleno = new Scanner(System.in).nextBoolean();
                salir=true;
            } catch (Exception e) {
                System.out.println("Ha habido un fallo en la inserción, vuelve a intentarlo.");
                salir=false;
            }
        } while (salir!=true);
        do {
            System.out.println("1. Crear Circulo");
            System.out.println("2. Crear Rectangulo");
            System.out.print("Opcion: ");
            opcion = new Scanner(System.in).next().charAt(0);
            switch (opcion) {
                case '1':
                    try {
                        System.out.println("Introduce el radio.");
                        radio = new Scanner(System.in).nextDouble();
                    } catch (Exception e) {
                        System.out.println("No valido. Voy a poner un valor por defecto.");
                        radio = 5;
                    }
                    Circulo circulo = new Circulo(radio, color, relleno);
                    return circulo;
                case '2':
                    try {
                        System.out.println("Introduce la base.");
                        base = new Scanner(System.in).nextDouble();
                        System.out.println("Introduce la altura.");
                        altura = new Scanner(System.in).nextDouble();
                    } catch (Exception e) {
                        System.out.println("No valido. Voy a poner valores por defecto.");
                        base = 5;
                        altura = 3;
                    }
                    Rectangulo rectangulo = new Rectangulo(base, altura, color, relleno);
                    return rectangulo;
                default:
                    System.out.println("No válido.");
            }
        }while(salir!=true);
        return null;
    }
    
}