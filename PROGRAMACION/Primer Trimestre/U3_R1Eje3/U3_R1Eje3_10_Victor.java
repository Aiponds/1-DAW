import java.util.Scanner;
public class U3_R1Eje3_10_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Mostrar la suma de los 10 primeros números impares
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		short suma=0;
		//Desarrollo
		for(byte i=1;i<20;i+=2)
			suma+=i;
		System.out.println("La suma de los 10 primeros impares es "+suma);
	}
}