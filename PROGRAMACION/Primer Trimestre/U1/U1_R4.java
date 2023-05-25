import java.util.Scanner;
public class U1_R4 {
	public static void main(String[]args){
	//DEFINICION DE VARIABLES
	int edad=0;
	Scanner teclado=new Scanner(System.in);
	//DESARROLLO DEL PROGRAMA
	System.out.println("Introduce tu edad: ");
	edad=teclado.nextInt();
	edad++;
	System.out.println("Tu edad dentro de un año sera: "+edad+" años");
	}
}