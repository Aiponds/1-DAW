import java.time.LocalTime; //Importación de un paquete.
import java.util.Scanner; //Importación del paquete para pedir datos.

public class U1_R2{
	public static void main(String[]args){
		//Definición de variables
		final short SUELDO=200;
		short sueldo=0;
		LocalTime queHoraEsEnElEjido;
		Scanner teclado=new Scanner(System.in);
		int edad=0;
		float altura=0.0f;
		String nombre;
		
		//Desarrollo del programa
		System.out.print("Mi sueldo es: "+sueldo+"€\n\t");
		//sueldo=sueldo+100;
		System.out.print("Mi sueldo ahora es: "+sueldo+"€\n\t");
		
		queHoraEsEnElEjido=LocalTime.now();
		System.out.println("La hora en El Ejido es: "+queHoraEsEnElEjido);
		//La instrucción \n hace un salto de línea y la instrucción \t hace una tabulación.
		
		System.out.println("Introduzca su edad: ");
		edad=teclado.nextInt();
		System.out.println("Tu edad es: "+edad+" años.");
		
		System.out.println("Introduzca su altura: ");
		altura=teclado.nextFloat();
		System.out.println("Su altura es: "+altura+" metros.");
		
		teclado.nextLine(); //OBLIGATORIO PARA LEER STRING SI SE HAN HECHO LECTURAS ANTES
		System.out.println("Introduze tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Tu nombre es "+nombre+".");
		
		
	}//Fin del metodo principal
}//Fin de la clase
