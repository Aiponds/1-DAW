import java.util.Scanner;
public class U3_R4Ejer3_18_Victor { //Victor Stala
	public static void main(String[]args) {
		/*
		De forma similar a la actividad 3.17, implementa un algoritmo que calcule el minimo comun multiplo de dos numeros dados.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		int a, b, auxA=1, auxB=1,aux=0;
		//Desarrollo
		System.out.print("Introduce el valor de a: ");
        a=teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b=teclado.nextInt();
		
		for(int i=1;i<=(a*b);i++) {
			for(int j=1;j<=i;j++) {
				auxA=a*j;
				if(auxA==auxB) {
					aux=auxA;
					break;
				}
			}
			for(int k=1;k<=i;k++) {
				auxB=b*k;
				if(auxB==auxA) {
					aux=auxB;
					break;
				}
			}
			if(auxA==auxB)
				break;
		}
		System.out.println("El MCM de "+a+" y "+b+" es :"+aux);
		
	}//Fin main
}//Fin class
