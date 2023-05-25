import java.util.Scanner;
public class U2_R1_Ej03_Victor { //Victor Stala
	public static void main(String[]args) { 
		/* 
		3.- Utilice las instrucciones que escribio en el ejercicio 2.5 para escribir un programa completo que
		calcule e imprima el producto de tres enteros.
		*/
		//Variables
		Scanner entrada=new Scanner(System.in); 
		int x,y,z,resultado;
		
		//Desarrollo
		System.out.println("Este programa calculara el producto de tres enteros que te voy a pedir."); 
		System.out.println("Introduce el primer entero: "); 
		x=entrada.nextInt(); 
		System.out.println("Introduce el segundo entero: ");
		y=entrada.nextInt(); 
		System.out.println("Introduce el tercer entero: "); 
		z=entrada.nextInt(); 
		resultado=x*y*z;
		System.out.println("El producto es: "+resultado); 	
	}
}