import java.util.Scanner;
public class U1_R4_Ej22_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		float longitud=0.000f;
		int longitudCm=0;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce la distancia en metros: ");
		longitud=teclado.nextFloat();
		longitud=longitud*100;
		longitudCm=(int)longitud;
		System.out.println("El resultado son "+longitudCm+" centimetros.");
		
	}
}