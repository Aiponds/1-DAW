import java.util.Scanner;
public class U2_R1_Ej16_Victor { //Victor Stala
    public static void main(String[]args) {
        /* 
        16.- Escriba una aplicacion que lea dos enteros, determine si el primero es un multiplo del segundo
        imprima el resultado. [Sugerencia: use el operador residuo].
         */
        //Variables
        int num1, num2;
        Scanner teclado=new Scanner(System.in);
        //Desarrollo
        System.out.println("Introduce dos enteros. Voy a comprobar si el primero es multiplo del segundo.\nIntroduce el primer numero: ");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2=teclado.nextInt();
        if(num1%num2==0)
            System.out.println("El numero "+num1+" es multiplo de "+num2);
        else
            System.out.println("El numero "+num1+" NO es multiplo de "+num2);
    }
}