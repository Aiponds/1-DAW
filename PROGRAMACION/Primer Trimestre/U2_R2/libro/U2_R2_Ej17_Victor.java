import java.util.Scanner;
public class U2_R2_Ej17_Victor {
    public static void main(String[]args) { //Victor Stala
        /*
        Realiza el "juego de la suma", que consiste en que aparezcan dos numeros aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicacion debe indicar
        si el resultado de la operacion es correcto o incorrecto.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int num1,num2,suma;
        //Desarrollo
        System.out.println("Voy a pedirte 2 numeros entre 1 y 99 y los vas a sumar. Te voy a pedir la suma y te voy a indicar si es correcta o no.\nIntroduce el primer numero: ");
        num1=teclado.nextInt();
        if((num1<1)||(num1>=100))
            System.out.println("El numero introducido no es el que te pedí.");
        else {
            System.out.println("Introduce el segundo numero: ");
            num2=teclado.nextInt();
            if((num2<1)||(num2>=100))
                System.out.println("El numero introducido no es el que te pedí.");
            else {
                System.out.println("Introduce la suma de los dos: ");
                suma=teclado.nextInt();
                if(suma==num1+num2)
                    System.out.println("La suma entre "+num1+" y "+num2+" es "+suma+" por lo cual es correcto.");
                else
                    System.out.println("La suma entre "+num1+" y "+num2+" no es "+suma+" por lo cual es incorrecto.");
            }
        }
        

    }
}