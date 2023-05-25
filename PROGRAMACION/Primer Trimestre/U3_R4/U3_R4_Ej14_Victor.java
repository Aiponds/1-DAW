import java.util.Scanner;
public class U3_R4_Ej14_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		Realiza un programa que nos pida un numero n y nos diga cuantos numeros hay entre 1 y n que sean primos. Un numero primo es aquel que solo es divisible por 1 y por el mismo.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int numero, contadorPrimos=0, resto;
		//Desarrollo
		System.out.print("Voy a decirte cuantos numeros primos hay entre el 1 y el que me introduzcas.\nIntroduce un numero: ");
		numero=teclado.nextInt();
		for(int i=1;i<=numero;i++) {
			resto=numero%i;
			System.out.println("Resto: "+resto);
            if(resto==0){
				contadorPrimos++;
            }
		}//Fin bucle
		System.out.println("Hay un total de "+contadorPrimos+" numeros primos entre 1 y "+numero);
	}//Fin main
}//fin class

			