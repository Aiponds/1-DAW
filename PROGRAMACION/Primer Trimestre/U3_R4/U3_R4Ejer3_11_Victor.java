import java.util.Scanner;
public class U3_R4Ejer3_11_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Realiza un programa que convierta un numero decimal en su representación binaria. Hay que tener en cuenta que desconocemos cuantas cifras tiene el neumero que introduce le usuario.
		Por simplicidad, iremos mostrando el numero binario un digito por linea.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numero, aux, resto;
		String binario="";
		//Desarrollo
		System.out.println("Introduce un numero decimal y te lo voy a representar en binario: ");
		numero=teclado.nextInt();
		aux=numero;
		do {
			resto=numero%2;
			binario=resto+binario;
			numero=numero/2;
		} while(numero!=1);
		binario=numero+binario;
		System.out.println("El numero "+aux+" en binario al reves es "+binario);
		
	}
}