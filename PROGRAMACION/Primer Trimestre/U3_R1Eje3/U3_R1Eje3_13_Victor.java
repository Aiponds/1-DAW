import java.util.Scanner;
public class U3_R1Eje3_13_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Dadas 6 notas, escribir la cantidad de algunos aprobados, condicionados (nota igual a cuatro) y suspensos.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		float nota;
		byte numSuspensos=0,numCondicionados=0,numAprobados=0;
		//Desarrollo
		for(byte i=1;i<7;i++) {
			System.out.print("Introduce una nota: ");
			nota=teclado.nextFloat();
			if(nota<0 || nota>10) {
				System.out.println("La nota no es valida");
				i--;
			} else {
				if(nota<4)
					numSuspensos++;
				else {
					if(nota<5)
						numCondicionados++;
					else
						numAprobados++;
				}
			}
		}
		System.out.println("En total hay "+numSuspensos+" notas suspensas, "+numCondicionados+" notas condicionadas y "+numAprobados+" notas aprobadas.");
	}
}