import java.util.*;
public class ejemploTryCatch_VictorStala {
    public static void main(String[]args) { //Victor Stala
        //Variables
        
        //Desarrollo
        ejercicio();
        
    }
    public static void ejercicio() {
        boolean salir=true;
        byte opcion;
        do {
            try {
                texto();
                opcion = new Scanner(System.in).nextByte(); 
                switch(opcion) {
                    case 1 : {
                        pedirNum();
                    }
                    break;
                    case 2 : {
                        pedirFloat();
                    }
                    break;
                    case 3 : {
                        dividirEnteros();
                    }
                    break;
                    case 4 : {
                        accederRango();
                    }
                    break;
                    default : {
                        System.out.println("Opcion no válida.");
                        salir=false;
                    }
                }
            } catch (InputMismatchException bucle) {
                System.out.println("No válido.");
                salir=false;
            }
        }while(salir!=true);
    }
    public static void texto() {
        System.out.println("\n\n-------------------------------------");
        System.out.println("1. Insertar Entero");
        System.out.println("2. Insertar Float (s/n)");
        System.out.println("3. Dividir enteros.");
        System.out.println("4. Dime la posicion.");
        System.out.print("Opcion: ");
    }
    public static void pedirNum() {
        int numero=0;
        try {
            System.out.print("Introduce un numero: ");
            numero=new Scanner(System.in).nextInt();
            System.out.println("Tu numero es: "+numero);
        } catch (InputMismatchException num) {
            System.out.println("Esperaba un número entero.");
        }
    }
    public static void pedirFloat() {
        float numero;
        try {
            System.out.print("Introduce un numero: ");
            numero=new Scanner(System.in).nextInt();
            System.out.println("Tu numero es: "+numero);
        } catch (InputMismatchException num) {
            System.out.println("Esperaba un numero decimal, separado con un punto.");
        }
    }
    public static void dividirEnteros() {
        int num1, num2, resul;
        try {
            System.out.print("Introduce numero1:");
            num1=new Scanner(System.in).nextInt();
            System.out.print("Introduce numero2:");
            num2=new Scanner(System.in).nextInt();
            resul=num1/num2;
            System.out.println("El resultado es:"+resul);
        } catch (InputMismatchException num) {
            System.out.println("Esperaba un entero.");
        } catch (ArithmeticException dividir) {
            System.out.println("No se puede dividir entre 0");
        }
    }
    public static void accederRango() {
        int[] array=new int[]{1,2,3,4,5};
        int pos;
        try {
            System.out.println("Dime a que posicion quieres acceder.");
            pos=new Scanner(System.in).nextInt();
            System.out.println(array[pos]);
        } catch(ArrayIndexOutOfBoundsException fuera) {
            System.out.println("Has salido del rango del array.");
        }
    }
}