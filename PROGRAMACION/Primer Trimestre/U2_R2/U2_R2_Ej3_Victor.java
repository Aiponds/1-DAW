import java.util.Scanner;
public class U2_R2_Ej3_Victor { //Victor Stala
	public static void main(String[]args){
		//Pedir dos numeros distintos y mostrar cual es el mayor
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num1, num2;
		//Desarrollo
		System.out.println("Introduce dos numeros distintos y te dire cual es el mayor.\nIntroduce el primer numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=teclado.nextInt();
		if(num1==num2) {
			System.out.println("Has introducido dos numeros iguales");
		}
		else {
			if(num1>num2)
				System.out.println("El numero "+num1+" es mayor que el numero "+num2);
			else
				System.out.println("El numero "+num2+" es mayor que el numero "+num1);
		}
	}
}