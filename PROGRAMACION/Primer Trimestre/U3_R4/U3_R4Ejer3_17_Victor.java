import java.util.Scanner;
public class U3_R4Ejer3_17_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Para dos nnumeros dados, a y b, es posible buscar el maximo comun divisor (el numero mas grande que divide a ambos) mediante un
        algoritmo ineficiente pero sencillo: desde el menor dea  y b, ir buscando de forma decreciente el priemr numero que divide a ambos
        simultaneamente. Realiza un programa que calcule el maximo comun divisor de dos numeros.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int a, b, aux;
		//Desarrollo
		System.out.print("Introduce el valor de a: ");
        a=teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b=teclado.nextInt();

        if(a<b) //Guardamos el valor menor
            aux=a;
        else
            aux=b;
        for(int i=aux;i>=1;i--) {
            if(a%i==0 && b%i==0) {
                System.out.println("El MCD de "+a+" y "+b+" es: "+i);
                break;
            }
        }

	}//Fin main
}//Fin class
