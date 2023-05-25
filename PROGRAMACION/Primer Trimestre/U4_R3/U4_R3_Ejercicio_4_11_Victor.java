import java.util.Scanner;
public class U4_R3_Ejercicio_4_11_Victor { //Victor Stala
    public static void main(String[]args) {
        //Diseña una funcion que calcule y muestre la superficie y el volumen de una esfera.
        //Variables
        double radio;
        //Desarrollo
        System.out.print("Introduce el radio de la esfera y voy a calcular su superficie y su volumen: ");
        radio=new Scanner(System.in).nextDouble();

        //Llamada a la función.
        medidasEsfera(radio);
    }
    
    static void medidasEsfera(double radio) {
        double superficie=(4*Math.PI)*Math.pow(radio, 2);
        double volumen=((4*Math.PI)/3)*Math.pow(radio, 3);

        System.out.println("La superficie es de "+superficie+" cm^2");
        System.out.println("El volumen es de "+volumen+" cm^3");
    }
}
