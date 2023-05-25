import java.util.Scanner;
import java.util.*;
public class U1_R10 {
	public static void main(String[]args) {
		//Variables
		double radio=0.0f, longitud=0.0f, area=0.0f;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce un radio: ");
		radio=teclado.nextDouble();
		longitud=2*Math.PI*radio;
		System.out.println("La longitud de la circunferencia es: "+longitud);
		area=Math.PI*(radio*radio);
		System.out.println("El área de la circunferencia es: "+area);
	}
}