import java.util.Scanner;
public class U3_R1Eje3_12_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		byte nota,numSuspensos=0;
		//Desarrollo
		System.out.println("Voy a pedirte 5 notas y voy a decirte cuantos suspensos hay.");
		for(byte i=1;i<6;i++) {
			System.out.println("Introduce una nota.");
			nota=teclado.nextByte();
			if(nota<0 || nota>10) {
				System.out.println("La nota no es valida");
				i--;
			} else {
				if(nota<5)
					numSuspensos++;
			}
		}
		System.out.println("En total hay "+numSuspensos+" suspensos.");
	}
}