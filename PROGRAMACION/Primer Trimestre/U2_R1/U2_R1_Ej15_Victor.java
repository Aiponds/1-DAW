import java.util.Scanner;
public class U2_R1_Ej15_Victor { // Victor Stala
    public static void main(String[]args) {
        /*
        15.- Escriba una aplicacion que lea un entero y que determine e imprima si es impar o par
        [sugerencia: use el operador residuo. Un numero par es un multiplo de 2. Cualquier multiplo de 2
        deja un residuo de 0 cuando se divide entre 2].
         */
        //Variables
        int numero;
        Scanner teclado=new Scanner(System.in);
        //Desarrollo
        System.out.println("Introduce un numero, voy a decirte si es impar o par: ");
        numero=teclado.nextInt();

        if(numero%2==0)
            System.out.println("El numero introducido es par.");
        else
            System.out.println("El numero introducido es impar");
    }
}