import java.util.Scanner;
public class U2_R6_Ej3_Victor { //Victor Stala
	public static void main(String[]args) {
		//Pide 1 numero entre 0-99.999 e indica cuantas cifras tiene el numero.
		//Variables
		int num1;
		Scanner teclado=new Scanner(System.in);
		//Desarrollo
		System.out.println("Introduce un numero del rango [0-99999]. Te voy a decir cuantas cifras tiene.");
		num1=teclado.nextInt();
		if(num1<0 || num1>99999)
			System.out.println("El numero introducido no está en el rango que te he dicho.");
		else if(num1<10)
			System.out.println("El numero "+num1+" tiene 1 cifra.");
		else if(num1<100)
			System.out.println("El numero "+num1+" tiene 2 cifras.");
		else if(num1<1000)
			System.out.println("El numero "+num1+" tiene 3 cifras.");
		else if(num1<10000)
			System.out.println("El numero "+num1+" tiene 4 cifras.");
		else if(num1<100000)
			System.out.println("El numero "+num1+" tiene 5 cifras.");
		
	}
}