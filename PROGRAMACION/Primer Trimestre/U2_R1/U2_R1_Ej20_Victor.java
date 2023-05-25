import java.util.Scanner;
public class U2_R1_Ej20_Victor { //Victor Stala
	public static void main(String[]args) {
		/* 
		20.- Escriba una aplicacion que reciba del usuario un numero compuesto por cinco digitos, que
		separe ese numero en sus digitos individuales y los imprima, cada uno separado de los demas por
		tres espacios. Por ejemplo, si el usuario escribe el numero 42339, el programa debe imprimir 4 2 3 3 9
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num;
		//Desarrollo
		System.out.println("Voy a separar un numero de 5 digitos en digitos individuales.\n Introduce el numero: ");
		num=teclado.nextInt();
		if(num<9999)
			System.out.println("El numero introducido no tiene 5 digitos.");
		else {
			System.out.print(num/10000+"   ");
			System.out.print((num%10000)/1000+"   ");
			System.out.print(((num%10000)%1000)/100+"   ");
			System.out.print((((num%10000)%1000)%100)/10+"   ");
			System.out.print(((((num%10000)%1000)%100)%10)+"   ");
		}
	}
}