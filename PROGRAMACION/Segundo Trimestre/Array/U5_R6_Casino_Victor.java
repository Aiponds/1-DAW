import java.util.Arrays;
import java.util.Scanner;
public class U5_R6_Casino_Victor {
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[]args) { //Victor Stala
        //Variables
        byte opcion=0;
        char salir='x';
        int aciertos=0;
        int edades[][];
        //Desarrollo
        do {
            System.out.println("Bienvenido al menú. Selecciona una opción.");
            System.out.println("\t0.Salir");
            System.out.println("\t1.Visualizar Array ordenado.");
            System.out.println("\t2.Pedir primitiva y comprobar.");
            System.out.println("\t3.En desarrollo.");
            System.out.print("Opcion:");
            opcion=new Scanner(System.in).nextByte();
            switch(opcion) {
                case 0 : {
                    System.out.print("Introduce 's' para confirmar la salida: ");
                    salir=new Scanner(System.in).next().charAt(0);
                    salir=Character.toLowerCase(salir);
                }
                break;
                case 1 : {
                    arrayOrdenado();
                }
                break;
                case 2 : {
                    aciertos=primitiva();
                    System.out.println("Has acertado "+aciertos+" veces.");
                    System.out.println();
                }
                break;
                case 3 : {
                    edades=new int[4][5];

                    inicializar(edades);
                    mostrar(edades);
                    pintarFilasAlternas(edades);
                    pintarColumnasAlternas(edades);

                    inicializarAleatorio(edades, 25, 100);
                    mostrar(edades);
                    consultaPosicion(edades, 2, 3);
                    consultaPares(edades);
                }
                break;
                default : { 
                    System.out.println("La opción introducida no es válida.");
                }
            }//Fin menu

        }while(salir!='s');
        System.out.println("\nHas salido. Adios.");
    }//Fin body
    public static void arrayOrdenado() {
        int miArray[]=new int[100];

        for(int i=0;i<100;i++) { //Insertar valores [5-105] a las 100 posiciones.
            miArray[i]=(int)(Math.random() * 100)+5;
        }
        Arrays.sort(miArray);
        System.out.println("De menor a mayor: ");
        for(int i=0;i<100;i++) {//Visualizar los valores.
            System.out.print(miArray[i]+" ");
        }
        System.out.println();
        System.out.println("De mayor a menor: ");
        for(int i=99;i>=0;i--) {//Visualizar los valores.
            System.out.print(miArray[i]+" ");
        }
        System.out.println();
    }//Fin arrays ordenados.

    public static int primitiva() {
        int numAciertos=0;
        int boleto[]=new int[6];
        int solucion[]=new int[6];
        int aux=0;
        boolean salir=false;
        for(int i=0;i<6;i++) {
            boleto[i]=0;
            solucion[i]=0;
        }
        System.out.println("Voy a pedirte 6 numeros: ");
        for(int i=0;i<6;i++) { //Insertar valores [0-50] a las 6 posiciones.
            do{
                System.out.print("\tIntroduce tu numero [0-50]: ");
                aux=new Scanner(System.in).nextInt();
                if((aux>=1)&&(aux<=49)) { //Descartar valores fuera del rango
                    for(int j=0;j<=i;j++) {
                        if(boleto[j]!=aux) { //Descartar valores repetidos en cualquier posicion del bucle
                            salir=true;
                        } else {
                            salir=false;
                            break;
                        }
                    }
                } else {
                    salir=false;
                }
            }while(salir!=true);//Fin bucle que busca que el numero sea entre 0 y 50
            boleto[i]=aux;
        }
        //Iniciar los valores aleatorios para la solucion.
        for(int i=0;i<6;i++) { //Insertar valores ganadores [0-50] a las 6 posiciones.
            do{
                aux=(int)(Math.random()*49+1);
                for(int j=0;j<=i;j++) {
                    if(solucion[j]!=aux) { //Descartar valores repetidos en cualquier posicion del bucle
                        salir=true;
                    } else {
                        salir=false;
                        break;
                    }
                }
            }while(salir!=true);//Fin bucle que busca que el numero sea entre 0 y 50
            solucion[i]=aux;
        }
        for(int i=0;i<6;i++) {
            for(int j=0;j<solucion.length;j++) {
                if(solucion[i]==boleto[j]) { //comprobamos cada posicion del boleto con la de la i-nesima posicion de solucion.
                    numAciertos++;
                }
            }
        }
        System.out.println("Tu boleto:");
        for(int i=0;i<6;i++) {
            System.out.print(boleto[i]+" ");
        }
        System.out.println("\nSolucion ganadora:");
        for(int i=0;i<6;i++) {
            System.out.print(solucion[i]+" ");
        }        
        System.out.println();
        return numAciertos;
    }//Fin primitiva

    public static void inicializar(int[][] array) {
        for(int i=0;i<array.length;i++) { //recorro FILAS
            for(int j=0;j<array[i].length;j++) { //RECORRO COLUMNAS
                array[i][j]=1;
            }
        }
    }//fin inicializar

    public static void inicializarAleatorio(int[][] array, int minimo, int maximo) {
        System.out.println("Inicializado de manera aleatoria: ");
        for(int i=0;i<array.length;i++) { //recorro FILAS
            for(int j=0;j<array[i].length;j++) { //RECORRO COLUMNAS
                array[i][j]=(int)(Math.random()*76)+25;
            }
        }
    }//fin inicializar

    public static void consultaPosicion(int[][] array, int fila, int columna) {
        System.out.println("El valor de array["+fila+"]["+columna+"] es: "+array[fila][columna]);
    }

    public static void consultaPares(int[][] array) {
        System.out.println("Mostramos solo los valores pares dentro del array");
        for(int i=0;i<array.length;i++) {
            System.out.print("Fila "+i+" : ");
            for(int j=0;j<array[i].length;j++) {
                if(array[i][j]%2==0) {
                    System.out.print("\t"+array[i][j]);
                } else {
                    System.out.print("\tX");
                }
            }
            System.out.println();
        }
    }

    public static void mostrar(int[][] array) {
        for(int i=0;i<array.length;i++) { //recorro COLUMNAS
            System.out.print("Fila "+i+" : ");
            for(int j=0;j<array[i].length;j++) { //RECORRO FILAS
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }
    }//fin mostrar

    public static void pintarFilasAlternas(int[][] array) {
        //vamos a tratar de pintar, no se si va a salir
        for(int i=0;i<array.length;i++) {
            if(i%2==0) {
                System.out.println(RED);
            } else {
                System.out.println(YELLOW);
            }
            System.out.print("Fila "+i+" : ");
            for(int j=0;j<array[0].length;j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }
        System.out.println(RESET);
    }

    public static void pintarColumnasAlternas(int[][] array) {
        //vamos a tratar de pintar, no se si va a salir
        System.out.print(RED);
        for(int i=0;i<array.length;i++) {
            
            System.out.print("Fila "+i+" : ");
            for(int j=0;j<array[0].length;j++) {
                if(j%2==0) {
                    System.out.print(RED);
                } else {
                    System.out.print(YELLOW);
                }
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }
        System.out.println(RESET);
    }

}//fin class
