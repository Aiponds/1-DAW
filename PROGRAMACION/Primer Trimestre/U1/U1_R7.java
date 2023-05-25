import java.util.Scanner;
public class U1_R7 {
	public static void main(String[]args) {
		//Defino variables
		Scanner teclado=new Scanner(System.in);
		byte edad;
		boolean mayorEdad;
		
		//Desarrollo programa
		System.out.println("Introduce tu edad: ");
		edad=teclado.nextByte();
		mayorEdad=edad>=18;
		System.out.println("¿Eres mayor de edad? -> "+mayorEdad);
		
		
	}
}