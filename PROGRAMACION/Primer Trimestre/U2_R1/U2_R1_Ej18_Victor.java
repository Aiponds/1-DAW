import java.util.*;
public class U2_R1_Ej18_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        18.- Escriba una aplicacion que reciba del usuario el radio de un circulo como un entero, y que
        imprima el diametro, la circunferencia y el area del circulo mediante el uso del valor de punto
        flotante 3.14159 para π.
        Use las siguientes formulas (r es el radio):
        diámetro = 2r
        circunferencia = 2πr
        área = πr^2
        No almacene los resultados de cada calculo en una variable. En vez de ello, especifique cada
        calculo como el valor que se imprimira en una instruccion System.out.printf. Los valores
        producidos por los calculos del area y de la circunferencia son numeros de punto flotante. Dichos
        valores pueden imprimirse con el especificador de formato %f en una instruccion System.out.printf.
         */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int radio;
        //Desarrollo
        System.out.println("Introduce el radio de un circulo, voy a imprimir el diametro, la circunferencia y el area de ese circulo.\nIntroduce el radio: ");
        radio=teclado.nextInt();
        System.out.printf("El diametro del circulo es: %d\n", radio*2);
        System.out.printf("La circunferencia del circulo es: %f\n", 2*Math.PI*radio);
        System.out.printf("El area del circulo es: %f\n", Math.PI*radio*radio);

    }
}