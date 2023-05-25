import java.util.Scanner;
public class U3_R1Eje3_8_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Pedir diez números por teclado y mostrar la media.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numero,suma=0;
		//Desarrollo
		System.out.println("Voy a pedirte 10 numeros y voy a hacer la media.");
		for(byte i=1;i<11;i++) {
			System.out.print("Introduce un numero: ");
			numero=teclado.nextInt();
			suma+=numero;
		}
		System.out.println("La media es "+(suma/10));
	}
}