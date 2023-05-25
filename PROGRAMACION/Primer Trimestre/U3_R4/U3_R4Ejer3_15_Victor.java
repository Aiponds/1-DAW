import java.util.Scanner;
public class U3_R4Ejer3_15_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Diseña una aplicacion que dibuje el triangulo de pascal, par an filas. Numerando las filas y elementos desde 0, la formula para obtener el m-esimo elemento de la n-esima fila 
		es E(n,m) -> n!/m!(n-m)!
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int filas, auxiliar;
		//Desarrollo
		System.out.print("Voy a pedirte el numero de filas: ");
		filas=teclado.nextInt();
		
		for(int n=0;n<filas;n++) {
			auxiliar=1;
			for(int m=0;m<=n;m++) {
				System.out.print(auxiliar+" ");
				auxiliar=auxiliar*(n-m)/(m+1);
			}
			System.out.println();
		}
	}//Fin main
}//Fin class
