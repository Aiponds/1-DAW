import java.util.Scanner;
public class U2_R7_Ej1_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		byte edad;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce tu edad");
		edad=teclado.nextByte();
		switch(edad) {
			case 1: System.out.println("Hola");
				break;
			case 2: System.out.println("Me alegro");
				break;
			case 8: System.out.println("de conocerte");
				break;
			case 11: System.out.println("hoy mismo");
				break;
			default: System.out.println("Sin precedentes");
				break;
		}
	}
}