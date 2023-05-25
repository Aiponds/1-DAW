import java.util.Scanner;
public class Ejarrays2 { // HECHO POR VICTOR STALA
    public static void main(String[]args) {
        // Definimos las variables
        Scanner teclado = new Scanner(System.in);
        int menu;
        boolean salir = false;
        char seguro;
        // Desarrollamos el programa
        while (!salir) {
            System.out.println();
            System.out.println();
            System.out.println("1. Vector letras");
            System.out.println("2. Vector numeros");
            System.out.println("3. Buscar letra en una palabra");
            System.out.println("4. Pedir nombre y mostrar sin vocales");
            System.out.println("5. Pedir frase y palabra, mostrar num veces de la ocurrencia de la palabra.");
            System.out.println("6. Frase y decir si es palindromo.");
            System.out.println("0. Salir");
            System.out.println("Escribe una de las opciones");
            menu = teclado.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("Has seleccionado la opcion 2");
                    vectorLetras();
                }
                    break;
                case 2: { //CREAR UN METODO PARA MOSTRAR UN VECTOR QUE LE ENTRA POR CABECERA
                    System.out.println("Has seleccionado la opcion 2");
                    vectorNumeros();
                }
                    break;
                case 3: { //CREAR CON METODOS: DADA UNA PALBRA POR EL USUARIO, PREGUNTARLE QUE LETRA QUIERE BUSCAR Y DAR COMO RESPUESTA EL NUMERO DE VECES QUE APARECE EN LA PALABRA(IGNORANDO MAYUSCULAS Y MINUSCULAS)
                    System.out.println("Has seleccionado la opcion 3");
                    numLetrasPalabra();
                }
                    break;
                case 4: {
                    System.out.println("Has seleccionado la opcion 4");
                    nombreSinVocales();
                }
                    break;
                case 5: {
                    System.out.println("Has seleccionado la opcion 5");
                    numPalabraEnFrase();
                }
                    break;
                case 6: {
                    System.out.println("Has seleccionado la opcion 6");
                    frasePalindromo();;
                }
                    break;
                    
                case 0: {
                    System.out.println("Estas seguro que quieres salir s/n");
                    seguro = teclado.next().charAt(0);
                    if (seguro == 's' || seguro == 'S') {
                        salir = true;
                    }
                }
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
        teclado.close();

    }// FIN_MAIN

    public static void vectorLetras() {
        //Creamos un vector de letras
        char palabra[], letra;
        int dimension;
        
        do {
            System.out.println("Dime de que dimensión quieres el vector:");
            dimension=new Scanner(System.in).nextInt();
        } while(dimension<=0); //La dimensión no puede ser negativa ni cero

        //Le asignamos la dimensión a la estructura
        palabra=new char[dimension];

        //Inicializamos la estructura
        for(int i=0;i<palabra.length;i++){
            palabra[i]='%';
        }
        //La visualizamos por pantalla
        System.out.println();
        System.out.println("Nuestro array de caracteres contiene:");
            for(int i=0;i<palabra.length;i++) {
                System.out.print(palabra[i]+" ");
        }

        //Modificamos datos
        for(int i=0;i<palabra.length;i++) {
            System.out.println();
            System.out.println("Posicion "+i+" dame su valor: ");
            palabra[i]=new Scanner(System.in).next().charAt(0);
        }

        //La visualizamos por pantalla
        System.out.println();
        System.out.println("Nuestro array de caracteres contiene:");
        for(int i=0;i<palabra.length;i++){
            System.out.print(palabra[i]+" ");
        }
    }//fin vectorLetras

    public static void vectorNumeros() {
        //Creamos un vector de numeros
        int vector[], dimension, valor;
        //Le asignamos la dimensión a la estructura
        do {
            System.out.print("Introduce la dimension del vector: ");
            dimension=new Scanner(System.in).nextInt();
        }while(dimension<=0);
        vector=new int[dimension];
        //Modificamos datos
        for(int i=0;i<vector.length;i++) {
            System.out.print("Introduce el valor para la posición "+i+": ");
            valor=new Scanner(System.in).nextInt();
            vector[i]=valor;
        }
         //La visualizamos por pantalla
         for(int i=0;i<vector.length;i++) {
            System.out.print(vector[i]+" ");
        }
    }

    public static void numLetrasPalabra() {
        String cadena=new String("");
        char letra;
        int pos=0, contadorLetra=0;
        System.out.print("Introduce una palabra: ");
        cadena=new Scanner(System.in).nextLine();
        System.out.print("Introduce la letra a buscar: ");
        letra=new Scanner(System.in).next().charAt(0);
        do {
            pos=cadena.indexOf(letra, pos);
            if(pos>=0) {
                contadorLetra++;
                pos++;
            }
        }while(pos!=-1);
        System.out.println("Hay un total de "+contadorLetra+" ocurrencias de la letra "+letra+" en la cadena: "+cadena);
    }

    static void nombreSinVocales() { //Pedir el nombre al usuario y mostrarlo sin vocales
        String nombre=new String();
        System.out.print("Introduce tu nombre: ");
        nombre=new Scanner(System.in).nextLine();
        nombre=nombre.toLowerCase();
        //quitarle las vocales:
        for(int i=0;i<nombre.length();i++) {
            if((nombre.charAt(i)!='a')&&(nombre.charAt(i)!='e')&&(nombre.charAt(i)!='i')&&(nombre.charAt(i)!='o')&&(nombre.charAt(i)!='u')){
                System.out.print(nombre.charAt(i));
            }
        }
    }

    static void numPalabraEnFrase() { //Pedir una frase y palabra. Buscar cuantas veces aparece la palabra en la frase.
        String frase=new String();
        String palabra=new String();
        int posicion=0;
        int contador=0;
        //Desarrollo
        System.out.print("Introduce una frase: ");
        frase=new Scanner(System.in).nextLine();
        System.out.print("Introduce una palabra a buscar: ");
        palabra=new Scanner(System.in).nextLine();
        frase=frase.toLowerCase();
        palabra=palabra.toLowerCase();
        do {
            posicion=frase.indexOf(palabra, posicion);
            if(posicion>=0) {
                posicion=posicion+palabra.length()-1;
                contador++;
            }
        }while(posicion!=-1);
        System.out.println("La frase "+frase+" tiene "+contador+" occurencias de la palabra "+palabra);
    }

    static void frasePalindromo() { //Leer una frase y decir si es palíndromo
        //Variables
        String frase=new String();
        //Desarrollo
        System.out.print("Introduce una frase: ");
        frase=new Scanner(System.in).nextLine();
        //Darle el formato y quitar espacios.
        frase=frase.toLowerCase();
        frase=frase.replaceAll(" ").replaceAll(, "").replaceAll(".", "").replaceAll(":").replaceAll(";");
        //Creamos instancia StringBuilder para darle la vuelta con reverse()
        StringBuilder fraseReves=new StringBuilder(frase);
        fraseReves.reverse();
        //Comparamos si las cadenas son iguales.
        if (frase.equals(fraseReves.toString())) {
        System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo.");
        }
    }//fin frasePalindromo
    

}// FIN_CLASS