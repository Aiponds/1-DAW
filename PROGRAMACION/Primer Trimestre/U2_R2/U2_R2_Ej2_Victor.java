import java.util.Scanner;
public class U2_R2_Ej2_Victor { //Victor Stala
	public static void main(String[]args) {
		//Pedir 2 numeros enteros y decir si son iguales o no.
		//Variables
		int num1, num2;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce un numero entero");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero entero");
		num2=teclado.nextInt();
		if(num1==num2)
			System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
		else
			System.out.println("Los numeros "+num1+" y "+num2+" no son iguales");			
	}
}