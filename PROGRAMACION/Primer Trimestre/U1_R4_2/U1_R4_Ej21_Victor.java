import java.util.Scanner;
public class U1_R4_Ej21_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		int a,b;
		boolean iguales;
		//Desarrollo
		System.out.println("Introduce un número: ");
		a=teclado.nextInt();
		System.out.println("Introduce otro número: ");
		b=teclado.nextInt();
		iguales=(a==b) ? true : false;
		System.out.println("Los numeros "+a+" y "+b+" son iguales? = "+iguales);
	}
}