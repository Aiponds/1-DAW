import java.util.Scanner;
public class U2_R2_Ej15_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        Escribe una aplicacion que solicite por consola dos numeros reales que corresponden a la base y altura de un triangulo.
        Debera mostrarse su area, comprobando que los numeros introducidos por el usuario no son negativos, algo que no tendria sentido.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        float base, altura;
        //Desarrollo
		System.out.println("Voy a mostrarte el área de un triangulo en funcion de su base y altura.\nIntroduce la base en cms: ");
		base=teclado.nextFloat();
		System.out.println("Introduce la altura en cms: ");
		altura=teclado.nextFloat();
        if((base<=0)||(altura<=0))
            System.out.println("No se puede introducir la base o la altura en negativo o 0, no tiene sentido.");
		else
			System.out.println("El área del triangulo es: "+(base*altura)/2+" cms");
    }
}