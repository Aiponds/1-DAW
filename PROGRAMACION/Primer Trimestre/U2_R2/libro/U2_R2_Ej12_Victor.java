import java.util.Scanner;
public class U2_R2_Ej12_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        El DNI consta de un entero de 8 digitos seguidos de una letra que se obtiene a partir del numero de la siguiente forma:
        letra= numero DNI modulo 22
        Basandote en esa informacion, elige la letra a partir de la numeracion de la siguiente tabla:
        y diseña una aplicacion en la que, dado un numero de DNI, calcule la letra que le corresponde. Observa que un numero de 8
        digitos esta dentro del rango del tipo int.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int dni, numLetra;
        char letra='A';
        //Desarrollo
        System.out.println("Voy a pedirte el DNI sin la letra y voy a calcularla yo.\nIntroduce tu DNI: ");
        dni=teclado.nextInt();
        numLetra=dni%23;
        switch(numLetra) {
            case 0 : letra='T';
                break;
            case 1 : letra='R';
                break;
            case 2 : letra='W';
                break;
            case 3 : letra='A';
                break;
            case 4 : letra='G';
                break;
            case 5 : letra='M';
                break;
            case 6 : letra='Y';
                break;
            case 7 : letra='F';
                break;
            case 8 : letra='P';
                break;
            case 9 : letra='D';
                break;
            case 10 : letra='X';
                break;
            case 11 : letra='B';
                break;
            case 12 : letra='N';
                break;
            case 13 : letra='J';
                break;
            case 14 : letra='Z';
                break;
            case 15 : letra='S';
                break;
            case 16 : letra='Q';
                break;
            case 17 : letra='V';
                break;
            case 18 : letra='H';
                break;
            case 19 : letra='L';
                break;
            case 20 : letra='C';
                break;
            case 21 : letra='K';
                break;
            case 22 : letra='E';
                break;
        }
        System.out.println("Para el DNI "+dni+", la letra que le corresponde es "+letra);
    }
}