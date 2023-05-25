import java.util.Scanner;
public class U2_R2_Ej18_Victor {
    public static void main(String[]args) { //Victor Stala
        /*
        Realiza el "juego de la suma", que consiste en que aparezcan dos numeros aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicacion debe indicar
        si el resultado de la operacion es correcto o incorrecto.
        Modificado para que, además de los dos numeros aleatorios, tambien aparezca la operacion que debe realizar el jugador: suma resta o multiplicacion.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int num1,num2,operacion, operacionUsuario;
        byte elegirOperacion;
        //Desarrollo
        System.out.println("Voy a pedirte 2 numeros entre 1 y 99 y su operacion. Te voy a pedir el resultado y te voy a indicar si es correcto o no.\nIntroduce el primer numero: ");
        num1=teclado.nextInt();
        if((num1<1)||(num1>=100))
            System.out.println("El numero introducido no es el que te pedí.");
        else {
            System.out.println("Introduce el segundo numero: ");
            num2=teclado.nextInt();
            if((num2<1)||(num2>=100))
                System.out.println("El numero introducido no es el que te pedí.");
            else {
                System.out.println("Introduce la operacion que quieras hacer [0-Suma, 1-Resta, 2-Multiplicacion. (Si no introduces nada o distinto de ese rango se suman.)]");
                elegirOperacion=teclado.nextByte();
                switch(elegirOperacion) {
                    case 1 : operacion=num1-num2;
                        break;
                    case 2 : operacion=num1*num2;
                        break;
                    default : operacion=num1+num2;
                        break;
                }
                System.out.println("Introduce el resultado de la operacion de los dos numeros que has elegido: ");
                operacionUsuario=teclado.nextInt();
                if(operacion!=operacionUsuario)
                    System.out.println("La operacion que has calculado es distinta al resultado real.");
                else
                    System.out.println("La operacion que has calculado igual al resultado real. Bien hecho.");
            }
        }
        

    }
}