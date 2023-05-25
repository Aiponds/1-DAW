import java.util.Scanner;
public class U1_R5 {
	public static void main(String[]args) {
		//Defino variables
		int fechaActual;
		int fechaNacimiento;
		int edad;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo programa
		System.out.println("Introduce el año actual: ");
		fechaActual=teclado.nextInt();
		System.out.println("Introduce tu año de nacimiento: ");
		fechaNacimiento=teclado.nextInt();
		edad=fechaActual-fechaNacimiento;
		System.out.println("Tu edad es: "+edad);
	}
}