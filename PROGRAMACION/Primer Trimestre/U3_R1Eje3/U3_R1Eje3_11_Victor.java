import java.util.Scanner;
public class U3_R1Eje3_11_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Pedir un número y calcular su factorial.Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numero, factorial=1;
		//Desarrollo
		System.out.print("Voy a decirte el factorial de un número. Introduce el numero: ");
		numero=teclado.nextInt();
		for(int aux=numero;aux>1;aux--) {
			factorial*=aux;
		}
		System.out.println("El factorial de "+numero+" es "+factorial);
	}
}