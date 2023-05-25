import java.util.Scanner;
public class U1_R4_Ej14_Victor { //Victor Stala
	public static void main(String[]arg) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		float base=0.0f, altura=0.0f, area=0.0f;
		//Desarrollo
		System.out.println("Introduce la base del triángulo: ");
		base=teclado.nextFloat();
		System.out.println("Introduce la altura del triángulo: ");
		altura=teclado.nextFloat();
		area=(base*altura)/2;
		System.out.println("El área del triángulo es: "+area);
	}
}