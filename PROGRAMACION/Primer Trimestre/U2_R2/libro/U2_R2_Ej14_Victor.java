import java.util.Scanner;

public class U2_R2_Ej14_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        Escribe un programa que solicite al usuario un numero comprendido entre 1 y 99. El programa debe mostrarlo con letras, por ejemplo, para 56 se verá "cincuenta y seis."
        */
        //Variables
        
        int numero, decena, unidad;
        String primeraParte="", segundaParte="";
        Scanner teclado=new Scanner(System.in);
        //Desarrollo
        System.out.println("Voy a pedirte un numero entre 1 y 99 y te lo voy a representar en letras.\nIntroduce el numero: ");
        numero=teclado.nextInt();
        //Separamos el numero en 2 cifras para luego hacer un switch e inicializamos 2 strings para darle valor en esos switch
        decena=numero/10;
        unidad=numero%10;
        if((numero>99)||(numero<1))
            System.out.println("El numero que me has introducido no esta entre 1 y 99");
        else {
            if(numero<=29) {
                switch(numero) {
                    case 1 : System.out.println("El numero "+numero+" es 'uno'");
                        break;
                    case 2 : System.out.println("El numero "+numero+" es 'dos'");
                        break;
                    case 3 : System.out.println("El numero "+numero+" es 'tres'");
                        break;
                    case 4 : System.out.println("El numero "+numero+" es 'cuatro'");
                        break;
                    case 5 : System.out.println("El numero "+numero+" es 'cinco'");
                        break;
                    case 6 : System.out.println("El numero "+numero+" es 'seis'");
                        break;
                    case 7 : System.out.println("El numero "+numero+" es 'siete'");
                        break;
                    case 8 : System.out.println("El numero "+numero+" es 'ocho'");
                        break;
                    case 9 : System.out.println("El numero "+numero+" es 'nueve'");
                        break;
                    case 10 : System.out.println("El numero "+numero+" es 'diez'");
                        break;
                    case 11 : System.out.println("El numero "+numero+" es 'once'");
                        break;
                    case 12 : System.out.println("El numero "+numero+" es 'doce'");
                        break;
                    case 13 : System.out.println("El numero "+numero+" es 'trece'");
                        break;
                    case 14 : System.out.println("El numero "+numero+" es 'catorce'");
                        break;
                    case 15 : System.out.println("El numero "+numero+" es 'quince'");
                        break;
                    case 16 : System.out.println("El numero "+numero+" es 'dieciseis'");
                        break;
                    case 17 : System.out.println("El numero "+numero+" es 'diecisiete'");
                        break;
                    case 18 : System.out.println("El numero "+numero+" es 'dieciocho'");
                        break;
                    case 19 : System.out.println("El numero "+numero+" es 'diecinueve'");
                        break;
                    case 20 : System.out.println("El numero "+numero+" es 'veinte");
                        break;
                    case 21 : System.out.println("El numero "+numero+" es 'veintiuno'");
                        break;
                    case 22 : System.out.println("El numero "+numero+" es 'veintidos'");
                        break;
                    case 23 : System.out.println("El numero "+numero+" es 'veintitres'");
                        break;
                    case 24 : System.out.println("El numero "+numero+" es 'veinticuatro'");
                        break;
                    case 25 : System.out.println("El numero "+numero+" es 'veinticinco'");
                        break;
                    case 26 : System.out.println("El numero "+numero+" es 'veintiseis'");
                        break;
                    case 27 : System.out.println("El numero "+numero+" es 'veintisiete'");
                        break;
                    case 28 : System.out.println("El numero "+numero+" es 'veintiocho'");
                        break;
                    case 29 : System.out.println("El numero "+numero+" es 'veintinueve'");
                        break;
                }
            }
            //Para el resto de numeros que tienen la misma estructura, comprobamos su primera cifra y su segunda cifra para escribir el numero compuesto de 2 Strings.
            else {
                switch(decena) {
                    case 3 : primeraParte="treinta";
                        break;
                    case 4 : primeraParte="cuarenta";
                        break;
                    case 5 : primeraParte="cincuenta";
                        break;
                    case 6 : primeraParte="sesenta";
                        break;
                    case 7 : primeraParte="setenta";
                        break;
                    case 8 : primeraParte="ochenta";
                        break;
                    case 9 : primeraParte="noventa";
                        break;
                }
                switch(unidad) {
                    case 1 : segundaParte=" y uno";
                        break;
                    case 2 : segundaParte=" y dos";
                        break;
                    case 3 : segundaParte=" y tres";
                        break;
                    case 4 : segundaParte=" y cuatro";
                        break;
                    case 5 : segundaParte=" y cinco";
                        break;
                    case 6 : segundaParte=" y seis";
                        break;
                    case 7 : segundaParte=" y siete";
                        break;
                    case 8 : segundaParte=" y ocho";
                        break;
                    case 9 : segundaParte=" y nueve";
                        break;
                }
                System.out.println("El numero "+numero+" es '"+primeraParte+segundaParte+"'");
            }
        }
    }
}