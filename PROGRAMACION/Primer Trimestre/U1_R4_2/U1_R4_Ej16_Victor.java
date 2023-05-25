import java.util.Scanner;
public class U1_R4_Ej16_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		int segundos, minutos, horas;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce una cantidad de segundos: ");
		segundos=teclado.nextInt();
		//Calculamos los minutos y horas en base a los segundos.
		minutos=segundos/60;
		segundos=segundos%60;
		horas=minutos/60;
		minutos=minutos%60;
		System.out.println("Hay "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
	}
}