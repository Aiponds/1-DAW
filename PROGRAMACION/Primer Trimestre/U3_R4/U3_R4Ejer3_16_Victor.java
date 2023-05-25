import java.util.Scanner;
public class U3_R4Ejer3_16_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Solicita al usuario un numero n y dibuja un ntrianngulo de base y altura n, de la forma (para n igual a 4):
				*
			   * *
			  * * *
			 * * * *
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int n;
		//Desarrollo
		System.out.println("Introduce n: ");
		n=teclado.nextInt();
		
		for(int i=1;i<=n;i++){
			for (int j=1;j<=n-i;j++) { //Rellena con espacios en blanco hasta que llega al numero de la fila - el valor de la fila
				System.out.print(" ");
			}
			for (int k=0;k<i;k++) { //Introduce los asteriscos hasta que alcanze el valor del bucle general.
				System.out.print(" *");
			}
			System.out.println();
		}//fin_bucle
	}//Fin main
}//Fin class
