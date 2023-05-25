import java.util.Scanner;
public class U1_R4_Ej13_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num1, num2, cantidadSuma;
		//Desarrollo
		System.out.println("Introduce un número: ");
		num1=teclado.nextInt();
		System.out.println("Introduce otro número: ");
		num2=teclado.nextInt();
		/*	Se comprueba si el resto de num1/num2 es 0. Si es verdadero devuelve el valor 0
			Si no es verdadero, calcula lo que le falta hasta llegar a num2 para ser multiplo.
		*/
		cantidadSuma = (num1%num2==0) ? 0 : (cantidadSuma=num2-(num1%num2)) ;
		System.out.println("Hay que sumarle "+cantidadSuma+" a "+num1+" para que sea múltiplo de "+num2);
		
	}
}