import java.util.Scanner;
public class U1_R9 {
	public static void main(String[]args) {
		//Variables
		float nota1=0.0f ,nota2=0.0f ,media=0.0f;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce la primera nota: ");
		nota1=teclado.nextFloat();
		System.out.println("Introduce la segunda nota: ");
		nota2=teclado.nextFloat();
		media=(nota1+nota2)/2;
		System.out.println("Tu media total es: "+media);
	}
}