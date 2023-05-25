import java.util.Scanner;
public class U3_R1Eje3_9_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. Hay que mostrar la tabla de multiplicar de dicho número,
		asegurándose de que el número introducido se encuentra en el rango establecido.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		byte numero;
		//Desarrollo
		System.out.println("Introduce un numero entre 1 y 10. Voy a mostrate su tabla de multiplicar.");
		System.out.print("Introduce el numero: ");
		numero=teclado.nextByte();
		if(numero<1 || numero>10)
			System.out.println("El numero no se encuentra dentro del rango establecido[1-10].");
		else {
			System.out.println("Tabla del "+numero);
			for(byte i=1;i<11;i++)
				System.out.println(numero+"x"+i+"="+i*numero);
		}
	}
}