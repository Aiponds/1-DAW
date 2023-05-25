import java.util.Scanner; //Importación del paquete para pedir datos.

public class U1_R3{
	public static void main(String[]args){
		//Definición de variables
		Scanner teclado=new Scanner(System.in);
		int base=0;
		byte iva=0;
		float total;
		float totalIva;

		//Desarrollo del programa
		System.out.println("Introduce la base imponible: ");
		base=teclado.nextInt();
		System.out.println("Introduce el IVA a aplicar: ");
		iva=teclado.nextByte();
		totalIva=(base*iva)/100.0f; //Se calcula el IVA a añadir
		total=base+totalIva; //Se calcula el total con el IVA.
		System.out.println("El IVA que se va a añadir es: "+totalIva+"€");
		System.out.println("El total es igual a: "+total+"€");
		
	}//Fin del metodo principal
}//Fin de la clase
