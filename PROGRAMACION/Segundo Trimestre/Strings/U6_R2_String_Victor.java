import java.util.Scanner;
public class U6_R2_String_Victor {
    public static void main(String[]args) {
        //Variables
        byte opcion;
        String frase,frase2;
        int long1;
        boolean resul;
        char confirmacion='x';
        String cadena, segundaCadena, busqueda;
        //Desarrollo
        //Menu con confirmacion de salida, salir con char s (Convertir mayus a minus).
        cadena=new String("Esto es un ejemplo.");
        segundaCadena=new String("Esto es UN ejemplo.");
        do {
            textoMenu();
            System.out.println("Opcion: ");
            opcion = new Scanner(System.in).nextByte();
            System.out.println();
            switch(opcion) {
                case 1 : mostrarMensaje(cadena);
                    break;
                case 2 : usarValueOf();
                    break; 
                case 3 : compararCadenas(cadena, segundaCadena);
                    break;
                case 4 : {
                    frase=pedirFrase();
                    frase2=pedirFrase();
                    //cadena.regionMatches(int inicio, String cad2, int otroInt, int long1);
                    resul=frase.regionMatches(3, frase2, 10, 5);
                    System.out.println(resul);
                }
                    break;
                case 5 : {
                    frase=pedirFrase();
                    frase2=pedirFrase();
                    System.out.println(frase+frase2);
                    System.out.println(frase.concat(frase2));
                }
                    break;
                case 6 : {
                    frase=pedirFrase();
                    frase2=pedirFrase();
                    cadenaMasCorta(frase, frase2);
                }
                    break;
                case 7 : {
                    frase=pedirFrase();
                    contarBlancos(frase);
                }
                    break;
                case 8 : {
                    frase=pedirFrase();
                    fraseReves(frase);
                }
                    break;
                case 9 : {
                    frase=pedirFrase();
                    busqueda=pedirBusqueda();
                    buscarCaracter(frase, busqueda);
                }
                    break;
                default : System.out.println("No es válido.");
            }
            System.out.println("Quieres salir? ( s = salir)");
            confirmacion = new Scanner(System.in).next().charAt(0);
            if(confirmacion=='S') {
                confirmacion = Character.toLowerCase(confirmacion);
            }
        }while(confirmacion!='s');
    }//fin main

    static void textoMenu() {
        System.out.println("Bienvenido al menu, selecciona la opción que desees: ");
        System.out.println("\t1.Mostrar cadena.");
        System.out.println("\t2.Usar valueOf.");
        System.out.println("\t3.Comparar cadenas");
        System.out.println("\t4.Comparar trozos de cadenas");
        System.out.println("\t5.Concatenar cadenas.");
        System.out.println("\t6.Decir que cadena es más corta.");
        System.out.println("\t7.Contar los espacios blancos.");
        System.out.println("\t8.Mostrar frase del reves.");
        System.out.println("\t9.Usar indexOf()");
    }//Fin textoMenu

    static void mostrarMensaje(String miCadena) {
        System.out.println("----------- Vemos el contenido ---------");
        System.out.println(miCadena);
    }//Fin mostrarMensaje

    static void usarValueOf() {
        //valueOf es un metodo estatico, para usarlo la clase.valueOf();
        String miCadena=new String("");
        miCadena=String.valueOf(-5);
        System.out.println("Mostramos la conversion de un entero: "+miCadena);
        miCadena=String.valueOf('p');
        System.out.println("Mostramos la conversion de un caracter: "+miCadena);
        miCadena=String.valueOf(true);
        System.out.println("Mostramos la conversion de un booleano: "+miCadena);
    }//Fin usarValueOf

    static void compararCadenas(String cadena1, String cadena2) {
        boolean valor;
        String mensaje;
        System.out.println(cadena1);
        System.out.println(cadena2);
        //valor=cadena1.equals(cadena2);
        valor=cadena1.equalsIgnoreCase(cadena2);
        mensaje=String.valueOf(valor);
        System.out.println("Las cadenas son iguales? : "+valor);
    }//Fin compararCadenas

    static String pedirFrase() {
        System.out.println("Escribe una frase: ");
        String cad=new Scanner(System.in).nextLine();
        return cad;
    }//fin pedirFrase

    static void cadenaMasCorta(String cad1, String cad2) {
        int long1, long2;
        long1=cad1.length();
        long2=cad2.length();
        if(long1==long2) {
            System.out.println("Las cadenas son igual de largas.");
        }else if(long1>long2) {
            System.out.println("La segunda cadena es más corta que la primera.");
        } else {
            System.out.println("La primera cadena es más corta que la primera.");
        }
    }//fin cadenaMasLarga

    static void contarBlancos(String cad1) {
        int contador=0, long1;
        char caracter;
        long1=cad1.length()-1;
        for(int i=0;i<=long1;i++){
            caracter=cad1.charAt(i);
            if(Character.isWhitespace(caracter)) {
                contador++;
            }
        }
        System.out.println("La cadena tiene "+contador+" espacios en blanco.");
        if(cad1.isEmpty()) {
            System.out.println("La frase tiene 0 palabras.");
        } else {
            System.out.println("Por lo tanto la frase tiene "+(contador+1)+" palabras.");
        }
    }//fin contarBlancos

    static void fraseReves(String cad1) {
        int long1;
        char caracter;
        String temp,cadReves=new String("");
        long1=cad1.length()-1;
        for(int i=0;i<=long1;i++) {
            caracter=cad1.charAt(i);
            temp=String.valueOf(caracter);
            cadReves=temp+cadReves;
        }
        System.out.println(cadReves);
    }//fin fraseReves

    static void buscarCaracter(String cad, String subCad) {
        int contadorPalabras=0;
        int longCad=cad.length()-1;
        int longSubCad=subCad.length();
        int posicion=0;
        do {
            posicion=cad.indexOf(subCad, posicion);
            if(posicion>=0) {
                contadorPalabras++;
                posicion=posicion+longSubCad;
            }
        }while(posicion!=-1);
        System.out.println("En la cadena hay "+contadorPalabras+" de la busqueda de "+subCad);
    }//fin buscarCaracter

    static String pedirBusqueda() {
        byte opcion;
        String cad=new String();
        char c;

        System.out.println("1.Caracter");
        System.out.println("2.Cadena");
        System.out.print("Opcion: ");
        opcion=new Scanner(System.in).nextByte();
        switch(opcion) {
            case 1 : {
                System.out.println("Introduce el caracter: ");
                c=new Scanner(System.in).next().charAt(0);
                cad=String.valueOf(c); //La ilusion de la libre elección.
            }
                break;
            case 2 : {
                System.out.println("Introduce la cadena: ");
                cad=new Scanner(System.in).nextLine();
            }
                break;
            default : {
                System.out.println("No es válido.");
            }
        }
        return cad;
    }
}//fin class
