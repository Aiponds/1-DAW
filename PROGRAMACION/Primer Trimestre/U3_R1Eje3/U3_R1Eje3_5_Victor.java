import java.util.Scanner;
public class U3_R1Eje3_5_Victor { //Victor Stala
	public static void main(String[]args) { 
		/*
		Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.
		Mientras la solución introducida sea correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.Usa un do_while() en tu resolución.
		*/
		//Variables
		Scanner teclado=new Scanner(System.in);
		byte num1, num2;
		short suma, operacionesCorrectas=0;
		boolean salida=false;
		//Desarrollo
		do {
			num1=(byte)(Math.random()*100+1);
			num2=(byte)(Math.random()*100+1);
			System.out.print("Introduce la suma de "+num1+"+"+num2+"=");
			suma=teclado.nextShort();
			if(suma==num1+num2) {
				System.out.print("La suma es correcta.\n");
				operacionesCorrectas++;
			} else {
				System.out.print("La suma es incorrecta.");
				salida=true;
			}
		} while(salida!=true);
		System.out.println("\nEl programa ha acabado. Has tenido "+operacionesCorrectas+" operaciones bien.");
	}
}