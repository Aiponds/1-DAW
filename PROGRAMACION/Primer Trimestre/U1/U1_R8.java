import java.util.Scanner;
public class U1_R8 {
	public static void main(String[]args) {
	//Variables
	boolean estaLloviendo, terminadoTareas, irBiblioteca, salir;
	Scanner teclado=new Scanner(System.in);	
	//Desarrollo del programa
	System.out.println("Está lloviendo? [true/false]");
	estaLloviendo=teclado.nextBoolean();
	System.out.println("Has terminado las tareas? [true/false]");
	terminadoTareas=teclado.nextBoolean();
	System.out.println("Tienes que ir a la biblioteca? [true/false]");
	irBiblioteca=teclado.nextBoolean();
	System.out.println("Puedo entonces salir?");
	salir=(estaLloviendo&&terminadoTareas)|| irBiblioteca;
	System.out.println("\t"+salir);
	}
}