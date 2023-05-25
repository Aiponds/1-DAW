import java.util.Scanner;
public class U3_R4Ejer3_12_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Modifica la actividad para que el usuario pueda introducir un numero en binario y el programa muestre su conversion a decimal.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numero, ultimoNumero, numDecimal=0, elevado=1;
		//Desarrollo
		System.out.println("Introduce un numero binario y te lo voy a representar en decimal: ");
		numero=teclado.nextInt();
		
		do {
			ultimoNumero=numero%10; //sacamos el digito (0 o 1) para calcular
			numDecimal+=ultimoNumero*elevado;
			elevado*=2;
			numero/=10; //eliminamos un numero de posicion para seguir
		} while(numero!=0);
		
		System.out.println("El numero "+numDecimal);
	}
}