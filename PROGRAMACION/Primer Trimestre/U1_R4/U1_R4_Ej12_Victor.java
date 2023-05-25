import java.util.Scanner;
public class U1_R4_Ej12_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num1, cantidadSuma;
		//Desarrollo
		System.out.println("Introduce un número: ");
		num1=teclado.nextInt();
		cantidadSuma = (num1%7==0) ? 0 : (cantidadSuma=7-(num1%7)) ; //Si es multiplo de 7, responde 0. Si no, calcula lo que le falta hasta llegar a serlo.
		System.out.println("Hay que sumarle "+cantidadSuma+" a "+num1+" para que sea múltiplo de 7");
	}
}