import java.util.Scanner;
public class U4_R3_Ejercicios_4_15_16_17_18_19_Victor {
    public static void main(String[]args) {
     //Menu iterativo con los ejercicios 4_15 - 4_19.
        //Variables.
        byte opcion, numSalida;
        int valor, hora1, hora2, minutos1, minutos2, numero, numero2, numero3;
        boolean salir=false;
        //Desarrollo
        do { //Iterativo hasta introducir 0 al final.
            System.out.println("Introduce la operación que quieras realizar.");
            System.out.println("\t1.Diferencia de minutos");
            System.out.println("\t2.Divisores primos de n");
            System.out.println("\t3.Comprobar amigos entre a y b");
            System.out.println("\t4.Numeros aleatorios");
            System.out.println("\t5.Numeros aleatorios sobrecarga");
            System.out.print("\tOpcion: ");
            opcion=new Scanner(System.in).nextByte();
            switch(opcion) {
                case 1 : {
                    System.out.print("Introduce la hora: ");
                    hora1=new Scanner(System.in).nextInt();
                    System.out.print("Introduce los minutos: ");
                    minutos1=new Scanner(System.in).nextInt();
                    System.out.print("Introduce la  segunda hora: ");
                    hora2=new Scanner(System.in).nextInt();
                    System.out.print("Introduce los segundos minutos: ");
                    minutos2=new Scanner(System.in).nextInt();

                    valor=diferenciaMin(hora1,minutos1,hora2,minutos2);
                    System.out.println("La diferencia entre las horas es de "+valor+" minutos");
                }
                    break;
                case 2 : {
                    System.out.print("Introduce un numero: ");
                    numero=new Scanner(System.in).nextInt();
                    divisoresPrimos(numero);
                }
                    break;
                case 3 : {
                    System.out.print("Introduce un numero: ");
                    numero=new Scanner(System.in).nextInt();
                    System.out.print("Introduce otro numero: ");
                    numero2=new Scanner(System.in).nextInt();
                    numerosAmigos(numero, numero2);
                }
                    break;
                case 4 : {
                    System.out.print("Introduce la cantidad de numeros aleatorios que quieres generar: ");
                    numero=new Scanner(System.in).nextInt();
                    System.out.print("Introduce el valor minimo: ");
                    numero2=new Scanner(System.in).nextInt();
                    System.out.print("Introduce el valor máximo: ");
                    numero3=new Scanner(System.in).nextInt();
                    numerosAleatorios(numero, numero2, numero3);
                }
                    break;
                case 5 : {
                    System.out.print("Introduce la cantidad de numeros aleatorios que quieres generar: ");
                    numero=new Scanner(System.in).nextInt();
                    numerosAleatorios(numero);
                }
                    break;
                default : {
                    System.out.println("\nLa opción no es válida.");
                }
                    break;
            }//Fin menú.
            //Preguntar la salida
            System.out.println("Quieres salir del menu? [0-SALIR]");
            numSalida=new Scanner(System.in).nextByte();
        } while(numSalida!=0);
        System.out.println("Has salido del menú. Adios.");
    }//Fin body
    
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int contadorMinutos1, contadorMinutos2, diferenciaMinutos;
        contadorMinutos1=minuto1+(hora1*60);
        contadorMinutos2=minuto2+(hora2*60);
        diferenciaMinutos=contadorMinutos1-contadorMinutos2;
        return diferenciaMinutos;
    }

    static void divisoresPrimos(int n) {
        for (int i=n-1;i>=1;i--) {
            if (n%i==0) {
                for (int x=2;x<n/2;x++) {
                    if (n%x==0) {
                        System.out.println(i+" es primo y es divisor.");
                    }
                }
            }
        }
    }

    static void numerosAmigos(int a, int b) {
        int sumaA=0, sumaB=0;
        for(int i=1;i<a;i++) {
            if(a%i==0) {
                sumaA+=i;
            }
        }
        for(int i=1;i<b;i++) {
            if(b%i==0) {
                sumaB+=i;
            }
        }
        if(sumaA==b && sumaB==a) {
            System.out.println("Los numeros "+a+" y "+b+" son amigos.");
        }
    }

    static void numerosAleatorios(int cantidadNumeros, int valorMinimo, int valorMaximo) {
        double numero;
        for(int i=1;i<cantidadNumeros;i++) {
            numero=Math.random()*valorMaximo+valorMinimo;
            System.out.println(numero);
        }
    }

    static void numerosAleatorios(int cantidadNumeros) {
        double numero;
        for(int i=1;i<cantidadNumeros;i++) {
            numero=Math.random()*1+0;
            System.out.println(numero);
        }
    }

}
