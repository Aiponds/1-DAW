import java.util.Scanner;
public class U6_R3_Ej6_12_Victor {
    public static void main(String[]args) {
        //Variables
        String cad1=new String();
        //Desarrollo
        cad1=peticionCad();
        juegoAhorcado(cad1);
    }
    static String peticionCad() {
        String cad=new String();
        System.out.println("Bienvenido al juego del ahorcado.");
        System.out.println("---------------------------------");
        System.out.println("Introduce la palabra a adivinar: ");
        cad=new Scanner(System.in).nextLine();
        return cad;
    }//fin peticionCad
    static char peticionChar() {
        System.out.print("Introduce una letra: ");
        char letra=new Scanner(System.in).next().charAt(0);
        return letra;
    }//fin peticionChar
    static void juegoAhorcado(String cad1) {
        String cadAux=new String("");
        char letra;
        boolean iguales=false;
        byte contador=0;
        int pos=0;
        for(int i=0;i<=cad1.length()-1;i++) { //Sacamos la longitud de la palabra y mostramos una barrabaja por cada caracter.
            cadAux+="_";
        }
        cad1=cad1.toLowerCase(); //Paso a minuscula para que no haya problemas en la insercion de caracteres.
        cad1=cad1.trim();
        System.out.println("\n\n\n\n\n\n\n"+cadAux);
        do {
            letra=peticionChar();
            letra=Character.toLowerCase(letra); //Paso a minuscula para que no haya problemas en la insercion de caracteres.
            do { //BUCLE PARA BUSCAR LA LETRA:
                pos=cad1.indexOf(letra, pos);
                if(pos>=0) {
                    cadAux = cadAux.substring(0, pos) + letra + cadAux.substring(pos + 1);
                    pos++;
                }
            }while(pos!=-1);
            if(cad1.indexOf(letra)==-1) { // Realizo otra busqueda (ineficiente) y si no encuentra el caracter(==-1) añade 1 fallo.
                contador++;
            }
            System.out.println("Fallos: "+contador);
            System.out.println(cadAux);
            iguales=cadAux.equalsIgnoreCase(cad1); //Paso a minuscula para que no haya problemas en la insercion de caracteres y compruebo si está completo.
        }while(iguales==false && contador<7);
        if(contador>=7) {
            System.out.println("Has fallado. Vuelve a jugar.");
        } else {
            System.out.println("Enhorabuena, has adivinado la palabra con "+contador+" fallos.");
        }
    }//fin juegoAhorcado
}