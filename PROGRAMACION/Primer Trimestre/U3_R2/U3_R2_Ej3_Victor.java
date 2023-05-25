import java.util.Scanner;
public class U3_R2_Ej3_Victor {
	public static void main(String[]args) { //Victor Stala
		/* 
		Un centro de investigacion para de la flora urbana necesita una aplicación que muestre cuál el el arbol más alto. Para ello se introducirá por teclado la altura en centimetros de cada árbol 
		(terminando la introducción de datos cuadno se utilice -1 como altura). Los árboles se identifican mediante etiquetas con números unicos correlativos, comenzando en 0.
		Diseñar una aplicación que resuelva el problema planteado.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int altura,alturaMayor=0;
		long codigo=0,codigoMayor=0;
		//Desarrollo
		System.out.print("Voy a decirte cual es el arbol mas alto.\nIntroduce la altura en cm: ");
		altura=teclado.nextInt();
		while(altura!=-1) {
			//Descartamos las alturas no reales.
			if(altura<=0) {
				System.out.println("La altura introducida no es valida.");
				System.out.print("\nIntroduce otra altura(-1 para salir): ");
				altura=teclado.nextInt();
			}
			else {
				if(altura>alturaMayor) { //Si es mayor, se almacena.
				alturaMayor=altura;
				codigoMayor=codigo;
				}
				System.out.print("\nIntroduce otra altura(-1 para salir): ");
				altura=teclado.nextInt();
				codigo++;
			}//FinElse
		}//FinWhile
		System.out.println("\nEl arbol mas alto mide "+alturaMayor+"cm y su codigo almacenado es "+codigoMayor);
	}//FinMain
}//FinClase