import java.util.Scanner;
public class U1_R4_Ej19_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		double precioInfantiles=15.50f, precioAdultos=20.00f, precioInicial=0.00f, precioTotal=0.00f;
		int numAdultos, numInfantiles;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Cuantos adultos hay? ");
		numAdultos=teclado.nextInt();
		System.out.println("Cuantos niños hay? ");
		numInfantiles=teclado.nextInt();
		precioInicial=(numAdultos*precioAdultos)+(numInfantiles*precioInfantiles);
		//Calculamos si hace falta el descuento o no.
		precioTotal= precioInicial>=100.00f ? (precioInicial*0.95) : precioInicial;
		System.out.println("Lo que se va a cobrar son "+precioTotal+"€ en total.");
	}
}