import java.util.Scanner;
public class EjercicioPractico_Sorpresa_Victor {
    public static final String MAYOR = "\u001B[31m";
    public static final String IGUAL = "\u001B[32m";
    public static final String MENOR = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[]args) { //Victor Stala
        /*
        * Desarrollar el juego de "La camara secreta", que consiste en abrir una cámara mediante su combinación secreta, que está formado por
        * una combinación de dígitos [1-5]. El jugador especificará cual es la longitud de la combinación. A mayor logntiud, mayor será la dificultad del juego
        * La aplicación genera de forma aleatoria que el usuario tendrá que acertar. En cada intento se muestra como pista para cada digito de la combinacion introducida
        * por el jugador si es mayor, menor o igual que el correspondiente en la combinación secreta.
        */
        ejercicioCamara();
    }//Fin del main.
    
    public static void ejercicioCamara() {
        int posiciones;
        int[] claveSecreta;
        int[] claveInsertada;
        boolean acierto=false;
        System.out.println("Bienvenido a 'La camara secreta.', se va a generar una clave de [n] posiciones con valores [1-5]. Intenta adivinarla.");
        System.out.print("\tIntroduce el número de posiciones [n]: ");
        posiciones=peticionNumero();
        claveSecreta=generadorClave(posiciones);
        System.out.println("\nSe ha generado la clave de "+posiciones+" posiciones.");
        do {
            System.out.print("\nInserta la clave: \n");
            claveInsertada=insertarClave(posiciones);
            acierto=compararClaves(claveSecreta, claveInsertada, posiciones);
        }while(acierto!=true);
        System.out.println("Has acertado la combinación y has accedodo a La camara secreta. Enhorabuena.");
    }//Fin ejercicio.

    public static int peticionNumero() {
        int num=-1;
        do { //peticion de números positivos.
            num=new Scanner(System.in).nextInt();
        }while(num<0);
        return num;
    }//Fin peticion de numeros.

    public static int[] generadorClave(int posiciones) {
        int[] clave=new int[posiciones];
        for(int i=0;i<clave.length;i++){ //genera la clave en el rango [1-5]
            clave[i]=(int)(Math.random()*4)+1;
        }
        return clave;
    }//fin generador clave.

    public static int[] insertarClave(int posiciones) {
        int[] clave=new int[posiciones];
        int valorInsertado;        
        for(int i=0;i<clave.length;i++){ //Para cada posicion se asigna la posicion de la clave.
            do{ //preguntar valores [1-5] y almacenarlos
                System.out.print("Posicion "+i+": ");
                clave[i]=valorInsertado=new Scanner(System.in).nextInt();
            }while(valorInsertado<=0 || valorInsertado>=6);
        }
        return clave;
    }//fin Insertar clave.

    public static boolean compararClaves(int[] claveAleatoria, int[] claveInsertada, int posiciones) {
        boolean aciertoTotal=false;
        int acumuladorIguales=0;
        System.out.print("Tu clave es ("+MAYOR+"MAYOR, "+MENOR+"MENOR, "+IGUAL+"IGUAL"+RESET+"): ");
        for(int i=0;i<claveInsertada.length;i++) {
            if(claveAleatoria[i]<claveInsertada[i]) { //si el valor insertado es mayor.
                System.out.print(MENOR);
                System.out.print(claveInsertada[i]);
            } else if(claveAleatoria[i]>claveInsertada[i]) { //si el valor insertado es menor
                System.out.print(MAYOR);
                System.out.print(claveInsertada[i]);
            } else { //si el valor insertado es igual
                System.out.print(IGUAL);
                System.out.print(claveInsertada[i]);
                acumuladorIguales++;
            }
            System.out.print(RESET);
        }
        System.out.println();
        aciertoTotal=(acumuladorIguales==posiciones) ? true:false;
        return aciertoTotal;
    }//fin comparacion claves.
}//fin clase
