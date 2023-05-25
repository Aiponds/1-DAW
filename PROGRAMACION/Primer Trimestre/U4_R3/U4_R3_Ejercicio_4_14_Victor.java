import java.util.Scanner;
public class U4_R3_Ejercicio_4_14_Victor { //Victor Stala
    public static void main(String[]args) {
        //Escribe una funcion a la que se pase como parametros de entrada una cantidad de dias horas y minutos. La funcion calculara y devolvera el numero de segundos que existen en los datos de entrada.
        //Variables
        int dias, horas, minutos;
        //Desarrollo
       System.out.print("Introduce la cantidad de dias: ");
       dias=new Scanner(System.in).nextInt();
       System.out.print("Introduce la cantidad de horas: ");
       horas=new Scanner(System.in).nextInt();
       System.out.print("Introduce la cantidad de minutos: ");
       minutos=new Scanner(System.in).nextInt();

       //llamada a la funcion
        calcularSegundos(dias,horas,minutos);
    }
    
    static void calcularSegundos(int dias, int horas, int minutos) {
        int segundos=0;
        if(dias>0) {
            segundos=segundos+(((dias*24)*60)*60);
        }
        if(horas>0) {
            segundos=segundos+((horas*60)*60);
        }
        if(minutos>0) {
            segundos=segundos+(minutos*60);
        }
        System.out.println("Hay introducidos un total de "+segundos+" segundos.");
    }
}
