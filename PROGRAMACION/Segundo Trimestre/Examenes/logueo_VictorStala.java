import java.util.*;
public class logueo_VictorStala {
    static char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public static void main(String[]args) {
        //Variables
        char[] dni=new char[9];
        char[] dniOriginal=new char[9];
        boolean valido=false;
        //Desarrollo
        textoEjercicio();
        do {
            dni=almacenarDNI(dni);
            for(int i=0;i<dni.length;i++) {
                dniOriginal[i]=dni[i];
            }
            valido=algoritmoComprobacion(dni);
        }while(valido!=true);
        visualizarArray(dniOriginal);
    }//fin main
    public static void textoEjercicio() {
        System.out.println("---------------------------------------------------------");
        System.out.print("Bienvenido a 'Apuestas Manolo'.\nPara entrar, tenemos que comprobar tu DNI.");
    }//fin texto
    public static char[] almacenarDNI(char[] array) {
        String aux=new String();
        boolean valido;
        do {
            valido=true;
            try { //por si no rellena el array
                System.out.print("\nEnseñame tu DNI o NIE: ");
                aux = new Scanner(System.in).nextLine(); 
                aux=aux.toUpperCase();
                aux=aux.trim();
                for(int i=0;i<array.length;i++) {
                    array[i]=aux.charAt(i);
                    if((i>0) && (i<array.length-1)) { //SI HAY LETRAS DESPUES DE LA PRIMERA Y ANTES DE LA ULTIMA DESCARTAMOS.
                        if(Character.isLetter(array[i])) {
                            valido=false;
                            break;
                        }
                    }
                }//FIN FOR
                if(Character.isLetter(array[0])) { //COMPROBAR SI LA LETRA EXTRANJERA ES VALIDA SI LA HAY.
                    if((array[0]!='X') && (array[0]!='Y') && (array[0]!='Z')) {
                        valido=false;
                    }
                }
                if(Character.isDigit(array[8])) { //COMPROBAR SI EL ULTIMO CARACTER ES DISTINTO A UNA LETRA.
                    valido=false;
                }
            } catch (StringIndexOutOfBoundsException hola) {
                valido=false;
            }
            if(valido==false) { //MENSAJE INVALIDO PARA NO REPETIRLO EN CADA COMPROBACION.
                System.out.println("El documento no es válido.");
            }
        }while(valido!=true);
        return array;
    }//fin almacenaje
    public static void visualizarArray(char[] array) {
        System.out.print("Tu documento es ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
        }
        System.out.print(" y es válido. Bienvenido. \n\n");
    }//fin visualizar
    public static boolean algoritmoComprobacion(char[] array) {
        boolean valido=true;
        int num, aux2;
        String documentoNoLetra=new String("");
        //comprobamos si el primer caracter es una letra(extranjero) para saber si hay que reemplazar.
        if(Character.isLetter(array[0])) {
            char aux=array[0];
            switch(aux) {
                case 'X' : {
                    array[0]='0';
                }
                break;
                case 'Y' : {
                    array[0]='1';
                }
                break;
                case 'Z' : {
                    array[0]='2';
                }
            }
        }//fin letra
        //ALMACENNO EL DOCUMENTO EN UN STRING PARA PASARLO A INT Y REALIZAR CALCULOS SOBRE EL.
        for(int i=0;i<array.length;i++) {
            if(Character.isDigit(array[i])) { 
                documentoNoLetra=documentoNoLetra+array[i];
            }
        }
        num=Integer.parseInt(documentoNoLetra);
        //CALCULOS PARA VALIDAR.
        aux2=num%23;
        if(array[8]!=letrasDNI[aux2]) {
            System.out.println("El documento no es correcto. Vuelve a decirmelo.");
            valido=false;
        }
        return valido;
    }//fin algoritmo

}
