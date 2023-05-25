import java.util.Scanner;
public class U4_R3_Ejercicio_4_12_Victor { //Victor Stala
    public static void main(String[]args) {
        //Implementa la funcion que calcula y devuelve la distancia euclidea.
        //Variables
        double x1,x2,y1,y2, diferenciaDistancia;
        //Desarrollo
        System.out.print("Introduce el valor para los puntos x1, y1: ");
        x1=new Scanner(System.in).nextDouble();
        y1=new Scanner(System.in).nextDouble();
        System.out.print("Introduce el valor para los puntos x2, y2: ");
        x2=new Scanner(System.in).nextDouble();
        y2=new Scanner(System.in).nextDouble();


        //Llamada a la función.
        diferenciaDistancia=distancia(x1,y1,x2,y2);
        System.out.println("La distancia euclídea es: "+diferenciaDistancia+" cm");
    }
    
    static double distancia(double x1, double y1, double x2, double y2) {
        double distancia=Math.sqrt(((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2))));
        return distancia;
    }
}