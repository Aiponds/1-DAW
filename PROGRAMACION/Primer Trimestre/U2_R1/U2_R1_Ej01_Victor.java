import java.util.Scanner;
public class U2_R1_Ej01_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		1.- Escriba instrucciones para realizar cada una de las siguientes tareas:
		a) Declarar las variables c, estaEsUnaVariable, q76354 y numero como de tipo int.
		b) Pedir al usuario que introduzca un entero.
		c) Recibir un entero como entrada y asignar el resultado a la variable int valor. Suponga que se
		puede utilizar la variable entrada tipo Scanner para recibir un valor del teclado.
		d) Imprimir 'Este es un programa en Java' en una linea de la ventana de comandos. Use el
		metodo System.out.println.
		e) Imprimir 'Este es un programa en Java' en dos lineas de la ventana de comandos. La
		primera linea debe terminar con es un. Use el metodo System.out.printf y dos
		especificadores de formato %s.
		f) Si la variable numero no es igual a 7, mostrar 'La variable numero no es igual a 7'.
		*/
		//Variables
		int c, estaEsUnaVariable, q76354, numero, valor; //a)
		Scanner teclado=new Scanner(System.in);
		String primera=" es un";
		String segunda=" programa en java.";
		//Desarrollo
		System.out.println("Introduce un numero entero: "); //b)
		numero=teclado.nextInt();
		valor=numero; //c)
		System.out.println("Este es un programa en Java"); //d)
		System.out.printf("Este %s%s%n", primera, segunda); //e)
		if(numero!=7)
			System.out.println("La variable numero no es igual a 7"); //f)
		
	}
}