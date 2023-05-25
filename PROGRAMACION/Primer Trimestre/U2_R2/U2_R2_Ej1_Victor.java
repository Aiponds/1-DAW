import java.util.Scanner;
public class U2_R2_Ej1_Victor { //Victor Stala
	public static void main(String[]args) {
		//Pide un nº al usuario y nos dice si es par.
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num;
		//Desarrollo
		System.out.println("Introduce un número: ");
		num=teclado.nextInt();
		if(num%2==0)
			System.out.println("El número introducido es par");
		else
			System.out.println("El número introducido es impar");
	}
}