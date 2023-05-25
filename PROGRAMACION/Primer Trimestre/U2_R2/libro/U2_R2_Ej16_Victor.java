import java.util.Scanner;
public class U2_R2_Ej16_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        Utiliza el operador ternario para calcular el valor absoluto de un numero que se solicita al usuario por teclado.
        */
        //Variables
        int numero;
        Scanner teclado=new Scanner(System.in);
        //Desarrollo
        System.out.println("Voy a decirte el valor absoluto de un numero que me introduzcas.\nIntroduce el número");
        numero=teclado.nextInt();
        numero=numero>0 ? numero : Math.abs(numero);
        System.out.println("El absoluto es "+numero);

    }
}