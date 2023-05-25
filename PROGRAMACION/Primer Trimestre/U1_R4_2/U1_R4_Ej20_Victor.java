import java.util.Scanner;
import java.util.*;
public class U1_R4_Ej20_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		double num1=0.0f;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce un número real: ");
		num1=teclado.nextDouble();
		num1=Math.sqrt(num1);
		System.out.println("La raiz cuadrada de ese número es "+num1);
		
		
	}
}