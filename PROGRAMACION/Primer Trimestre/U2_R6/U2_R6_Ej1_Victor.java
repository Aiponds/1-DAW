import java.util.Scanner;
public class U2_R6_Ej1_Victor { //Victor Stala
	public static void main(String[]args) {
		//Pedir 3 numeros y mostrar de mayor a menor.
		//Variables
		int primero,segundo,tercero,aux;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Voy a pedirte 3 numeros y los voy a ordenar de mayor a menor.\nIntroduce el primer numero: ");
		primero=teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		segundo=teclado.nextInt();
		System.out.println("Introduce el tercer numero: ");
		tercero=teclado.nextInt();
		//Los ordenamos
		if(primero<segundo) { //Invertimos su posicion
			aux=primero;
			primero=segundo;
			segundo=aux;
		}
		if(tercero<primero) {
			if(tercero>segundo) { //Invertimos
				aux=segundo;
				segundo=tercero;
				tercero=aux;
			}
		}
		else { //primero<tercero, asignamos a primero el valor de tercero y guardamos en tercero el antiguo
			aux=primero;
			primero=tercero;
			tercero=aux;
			//cambiamos el valor de segundo y tercero para ordenarlos nuevamente.
			aux=segundo;
			segundo=tercero;
			tercero=aux;
			
			
		}
		
		
		System.out.println("Los numeros ordenados son: "+primero+", "+segundo+", "+tercero+".");
	}
}