import java.util.Scanner;
public class U2_R7_Ej2_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		int edad;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce un numero");
		edad=teclado.nextInt();
		edad= -edad;
		System.out.println(edad+" ahora es absoluto");
		
	}
}