import java.util.Scanner;
public class U4_R3_Ejercicio_4_13_Victor { //Victor Stala
    public static void main(String[]args) {
        //Crea la funcion que muestre por consola los primeros n numeros pares.
        //Variables
        int n;
        //Desarrollo
       System.out.print("Introduce cuantos numeros pares quieres ver por pantalla: ");
       n=new Scanner(System.in).nextInt();

        //Llamada a la función.
        muestraPares(n);
    }
    
    static void muestraPares(int n) {
        int numeroMuestra=1;
        int contadorPares=0;
        do {
            if(numeroMuestra%2==0) {
                System.out.println(numeroMuestra+" ");
                contadorPares++;
            }
            numeroMuestra++;
    
        } while(contadorPares!=n);
    }
}
