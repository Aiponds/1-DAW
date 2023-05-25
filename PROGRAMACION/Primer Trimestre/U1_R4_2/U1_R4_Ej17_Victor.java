import java.util.Scanner;
public class U1_R4_Ej17_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		float milimetros=0.0f, centimetros=0.0f, metros=0.0f;
		//Desarrollo
		System.out.println("Introduce los milímetros: ");
		milimetros=teclado.nextFloat();
		System.out.println("Introduce los centimetros: ");
		centimetros=teclado.nextFloat();
		System.out.println("Introduce los metros: ");
		metros=teclado.nextFloat();
		//Ahora calculamos todo en centimetros:
		centimetros=centimetros+(milimetros/10);
		centimetros=centimetros+(metros*100);
		System.out.println("La suma de las distancias es: "+centimetros+" centimetros");
		
	}
}