import java.util.Scanner;
public class U2_R2_Ej4_Victor { //Victor Stala
	public static void main(String[]args) {
		//Pedir dos numeros y mostrarlos ordenados de mayor a menor
		//Variables
		Scanner teclado=new Scanner(System.in);
		int num1, num2;
		//Desarrollo
		System.out.println("Introduce dos números y los ordeno de mayor a menor.\nIntroduce el primer numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2=teclado.nextInt();
		if(num1==num2)
			System.out.println("Los numeros ordenados son: "+num1+"="+num2);
		else {
			if(num1>num2)
				System.out.println("Los numeros ordenados son: "+num1+">"+num2);
			else
				System.out.println("Los numeros ordenados son: "+num2+">"+num1);
		}
	}
}