import java.util.Scanner;
public class U3_R2_EjPropio_Victor {
	public static void main(String []args) {
		//Generar un numero aleatorio entre 1 y 100, pedir al usuario que lo adivine y dandole pistas de mayor o menor si falla. Terminar cuando introduzca el numero o -1 para salir.
		//Variables
		Scanner teclado=new Scanner(System.in);
		byte numeroSecreto,numero;
		int contadorNum=0;
		String mensaje="";
		//Desarrollo
		System.out.println("He generado 1 numero aleatorio entre 1 y 100. Intenta adivinar el numero.");
		numeroSecreto=(byte)(Math.random()*100+1);
		//pedimos el numero
		System.out.print("Introduce un numero[1-100]: ");
		numero=(byte)(Math.random()*100+1);
		System.out.println(numero);
		while(numero!=-1) {
			//comprobamos si ha acertado
			if(numero==numeroSecreto) {
				contadorNum++;
				System.out.println("\nHas acertado. El numero SI era "+numeroSecreto+" Enhorabuena.");
				System.out.println("Has probado "+contadorNum+" veces.");
				numero=-1;
			} else {
				contadorNum++;
				//decimos si es mayor o menor
				mensaje=(numero<numeroSecreto) ? "PISTA: El numero secreto es mayor que el introducido" : "PISTA: El numero secreto es menor que el introducido";
				System.out.println("Has probado por ahora "+contadorNum+" veces.");
				//volvemos a pedir un numero
				System.out.print(mensaje+"\n\nIntroduce otro numero[1-100]: ");
				numero=(byte)(Math.random()*100+1);
				System.out.println(numero);
			}//fin else
		}//fin while
		System.out.println("El programa ha acabado. Gracias.");
	} //Fin main
} //fin clase