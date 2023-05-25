import java.util.*;
public class U3_R1_Ej1_Victor {
    public static void main(String[]args) { //Victor Stala
        //Diseña un programa que muestre, para cada numero introducido por teclado si es par, si es positivo y su cuadrado. El proceso se reeptira hasta que el numero introducido sea 0
        //Variables
        Scanner teclado=new Scanner(System.in);
        int numero=0;
        String parImpar;
        //Desarrollo
        System.out.println("Voy a pedirte un número y voy a decirte si es par, si es positivo y su cuadrado. Voy a parar cuando introduzcas un 0.");
        while(numero!=0) {
            //Pedir el numero
            System.out.print("\nIntroduce un numero: ");
            numero=teclado.nextInt();
            if(numero==0)
                System.out.println("El programa ha acabado. Gracias.");
            else {
                parImpar=numero%2==0 ? "par" : "impar";
                System.out.println("\nEl numero "+numero+" es "+parImpar);
                if(numero<0)
                    System.out.println("El numero "+numero+" es negativo");
                else
                    System.out.println("El numero "+numero+" es positivo");
                System.out.println("El cuadrado de "+numero+" es "+numero*numero);
            } //Fin else
        } //Fin while
    } //Fin main
} //Fin clase