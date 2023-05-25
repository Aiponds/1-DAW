import java.util.Scanner;
import java.util.*;
public class U2_R6_Ej2_Victor { //Victor Stala
	public static void main(String[]args) {
		//Resuelve polinomio de segundo grado ax^2+bx+c=0
		//Variables
		Scanner teclado=new Scanner(System.in);
		double a,b,c,aux,solu1,solu2;
		String mensaje;
		//Desarrollo
		System.out.println("Introduce 3 numeros y voy a calcular.\nIntroduce el primer numero: ");
		a=teclado.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		b=teclado.nextDouble();
		System.out.println("Introduce el tercer numero: ");
		c=teclado.nextDouble();
		
		//Calculamos el discriminante
		aux=(b*b-4*a*c);
		if(aux<0)
			mensaje="No tiene soluciones reales";
		else if(a==0)
			mensaje="No es una ecuacion de segundo grado, no puedo calcularla";
		else {
			solu1=(-b+ Math.sqrt(aux))/(2*a);
			solu2=(-b- Math.sqrt(aux))/(2*a);
			mensaje="Solución 1: "+solu1+"\nsolución 2: "+solu2;
		}
			
		
		System.out.println("La ecuación: "+a+"x²+"+b+"x+"+c+"=0 tiene estas soluciones: \n"+mensaje);
		
	}
}
