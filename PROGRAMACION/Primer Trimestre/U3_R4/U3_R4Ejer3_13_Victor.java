import java.util.Scanner;
public class U3_R4Ejer3_13_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Escribe un programa que incremente la hora de un rejoj. Se pedirán por teclado la hora, minutos y segundos, así como cuantos segundos se desea incrementar la hora introducida.
		La aplicación mostrara la nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int horas, minutos, segundos, aux=0;
		//Desarrollo
		System.out.print("Introduce la cantidad de horas: ");
		horas=teclado.nextInt();
		System.out.print("Introduce la cantidad de minutos: ");
		minutos=teclado.nextInt();
		System.out.print("Introduce la cantidad de segundos: ");
		segundos=teclado.nextInt();
		if(horas<0 || minutos<0 || segundos<0 || horas>23 || minutos>59 || segundos>59)
			System.out.println("No es válida la hora del reloj.");
		else {
			aux=segundos; //guardamos el anterior valor de segundos.
			System.out.println("La hora es "+horas+":"+minutos+":"+aux+".");
			
			System.out.print("Introduce el incremento de segundos: ");
			segundos=teclado.nextInt();
			//Se ajusta segun lo necesario la hora
			if(segundos<0)
				System.out.println("No es valido el incremento.");
			else {
				segundos=aux+segundos;
				do {
					if(segundos>=60) {
						segundos=segundos-60;
						minutos++;
					} if(minutos>=60) {
						minutos=minutos-60;
						horas++;
					} if(horas>=24) {
						horas=horas-24;
					}
				}while(segundos>=60 || minutos>=60 || horas>=24);
				System.out.printf("La hora final es %d:%d:%d.",horas,minutos,segundos);
			}
		}//Fin else
	}//Fin main
}//fin class

			