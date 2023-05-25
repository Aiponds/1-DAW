import java.util.Scanner;
public class U1_R4_Ej18_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numHormigas, numAracnidos, numCochinillas, numPatasTotal;
		//Desarrollo
		System.out.println("Cuantas hormigas has capturado?: ");
		numHormigas=teclado.nextInt();
		System.out.println("Cuantas arañas has capturado?: ");
		numAracnidos=teclado.nextInt();
		System.out.println("Cuantas cochinillas has capturado?: ");
		numCochinillas=teclado.nextInt();
		//Calculamos el numero de patas y mostramos el resultado
		numPatasTotal=(numHormigas*6)+(numAracnidos*8)+(numCochinillas*14);
		System.out.println("El número total de patas que se han contabilizado son: "+numPatasTotal);
	}
}