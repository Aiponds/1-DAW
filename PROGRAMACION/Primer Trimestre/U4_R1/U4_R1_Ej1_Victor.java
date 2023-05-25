import java.util.Scanner;
public class U4_R1_Ej1_Victor { //Victor Stala
    public static void main(String[]args) { 
        //Variables
        byte opcion;
        int numero;
        boolean esPrimo;
        //Desarrollo
        System.out.println("Introduce la operación que quieras realizar.");
        System.out.println("\t1.Mostrar Eco n veces.");
        System.out.println("\t2.Mostrar numeros entre n y m.");
        System.out.println("\t3.Devolver el numero máximo entre n y m.");
        System.out.println("\t4.Comprobar caracter y ver si es vocal.");
        System.out.println("\t5.Comprobar n si es primo o no.");
        System.out.print("\tOpcion: ");
        opcion=new Scanner(System.in).nextByte();
        switch(opcion) {
            case 1 : {
                eco();
            }
                break;
            case 2 : {
                comprendidos();
            }
                break;
            case 3 : {
                maximo();
            }
                break;
            case 4 : {
                comprobarVocal();
            }
                break;
            case 5 : {
                System.out.print("Introduce un numero: ");
                numero=new Scanner(System.in).nextInt();
                esPrimo=comprobarPrimo(numero);
                System.out.println("El numero "+numero+" es primo?: "+esPrimo);
            }
                break;
            default : {
                System.out.println("\nLa opción no es válida.");
            }
                break;
        }
    }
    public static void eco() {
        int numero;
        System.out.print("Introduce un numero: ");
        numero=new Scanner(System.in).nextInt();
        for(int i=1;i<=numero;i++) {
            System.out.println("Eco....");
        }
    }
    public static void comprendidos() {
        int numero1, numero2, mayor, menor;
        System.out.print("Introduce un numero: ");
        numero1=new Scanner(System.in).nextInt();
        System.out.print("Introduce otro numero: ");
        numero2=new Scanner(System.in).nextInt();
        mayor=numero1<numero2 ? numero2 : numero1;
        menor=numero1<numero2 ? numero1 : numero2;
        for(int i=menor;i<=mayor;i++) {
            System.out.println(i);
        }
    }
    public static void maximo() {
        int numero1, numero2, maximo;
        System.out.print("Introduce un numero: ");
        numero1=new Scanner(System.in).nextInt();
        System.out.print("Introduce otro numero: ");
        numero2=new Scanner(System.in).nextInt();
        maximo=numero1<numero2 ? numero2 : numero1;
        System.out.println(maximo);
    }
    public static void comprobarVocal() {
        boolean vocal;
        char letra;
        System.out.print("Introduce un caracter: ");
        letra=new Scanner(System.in).nextLine().charAt(0);
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
            vocal=true;
        } else {
            vocal=false;
        }
        if(vocal==true) {
            System.out.println("El caracter "+letra+" SI es vocal.");
        } else {
            System.out.println("El caracter "+letra+" NO es vocal.");
        }
    }
    public static boolean comprobarPrimo(int n) {
        int contadorPrimo=0; //Reiniciamos a 0 por cada numero introducido en la primera petición
        boolean primo=false;
		for(long i=1;i<=n;i++) {
			if(n%i==0)
				contadorPrimo++; //Sumamos 1 al ser resto 0. Si al final del bucle for contadorPrimo<=2, el numero es primo, else NO es primo.
		}
        if (n==1) {
            primo=false;
        } else if(contadorPrimo<=2)
            primo=true;
        return primo;
    }
}