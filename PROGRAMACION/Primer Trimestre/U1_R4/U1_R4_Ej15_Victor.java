import java.util.Scanner;
public class U1_R4_Ej15_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		Scanner teclado=new Scanner(System.in);
		int a,b,c,x,y;
		//Desarrollo
		//Pedimos todas las variables
		System.out.println("Introduce el valor de a: ");
		a=teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		b=teclado.nextInt();
		System.out.println("Introduce el valor de c: ");
		c=teclado.nextInt();
		System.out.println("Introduce el valor de x: ");
		x=teclado.nextInt();
		//Realizamos el calculo de la formula.
		y=((a*(x*x))+(b*x)+c);
		System.out.println("Para la fórmula y="+a+"*"+x+"^2 + "+b+"*"+x+" + "+c+", el resultado es: "+y);
	}
}