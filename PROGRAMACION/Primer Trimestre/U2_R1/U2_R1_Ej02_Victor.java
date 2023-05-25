import java.util.Scanner;
public class U2_R1_Ej02_Victor { //Victor Stala
	public static void main(String[]args) { 
		/* 
		2.- Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes
		tareas:
		a) Indicar que un programa calculara el producto de tres enteros.
		b) Crear un objeto Scanner llamado entrada que lea valores de la entrada estandar.
		c) Declarar las variables x, y, z y resultado de tipo int.
		d) Pedir al usuario que escriba el primer entero.
		e) Leer el primer entero del usuario y almacenarlo en la variable x.
		f) Pedir al usuario que escriba el segundo entero.
		g) Leer el segundo entero del usuario y almacenarlo en la variable y.
		h) Pedir al usuario que escriba el tercer entero.
		i) Leer el tercer entero del usuario y almacenarlo en la variable z.
		j) Calcular el producto de los tres enteros contenidos en las variables x, y y z, y asignar el
		resultado a la variable resultado.
		k) Usar System.out.printf para mostrar el mensaje 'El producto es', seguido del valor de la
		variable resultado.
		*/
		//Variables
		Scanner entrada=new Scanner(System.in); //b)
		int x,y,z,resultado; //c)
		
		//Desarrollo
		System.out.println("Este programa calculara el producto de tres enteros que te voy a pedir."); //a)
		System.out.println("Introduce el primer entero: "); //d)
		x=entrada.nextInt(); //e)
		System.out.println("Introduce el segundo entero: "); //f)
		y=entrada.nextInt(); //g)
		System.out.println("Introduce el tercer entero: "); //h)
		z=entrada.nextInt(); //i)
		resultado=x*y*z; //j)
		System.out.println("El producto es: "+resultado); //k)		
	}
}