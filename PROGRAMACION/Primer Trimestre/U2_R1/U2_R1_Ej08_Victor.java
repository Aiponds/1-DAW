import java.util.Scanner;
public class U2_R1_Ej08_Victor {
    public static void main(String[]args) { //Victor Stala
        /*
        8.- Escriba una aplicacion que pida al usuario que escriba dos numeros, que obtenga los numeros
        del usuario e imprima la suma, producto, diferencia y cociente (division) de los numeros.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int num1, num2, suma, producto, diferencia, cociente;
        //Desarrollo
        System.out.println("Voy a calcular la suma, el producto, la diferencia y el cociente de 2 numeros.\nIntroduce el primer número");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=teclado.nextInt();
        suma=num1+num2;
        producto=num1*num2;
        diferencia=num1-num2;
        cociente=num1/num2;
        System.out.println("La suma de "+num1+" y "+num2+" es: "+suma);
        System.out.println("El producto de "+num1+" y "+num2+" es: "+producto);
        System.out.println("La diferencia de "+num1+" y "+num2+" es: "+diferencia);
        System.out.println("El cociente de "+num1+" y "+num2+" es: "+cociente);
    } 
}