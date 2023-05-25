import java.util.*;
public class U5_R7_Carrera_Victor {
    public static void main(String[]args) { //Victor Stala
        //Variables
        int[] arrayDorsalesInicial;
        int[] arrayDorsalesFormateado;
        int numParticipantes=0;
        //Desarrollo
        //Pedir numero participantes y declarar array con dimension n.
        numParticipantes=preguntarParticipantes(numParticipantes);
        arrayDorsalesInicial=new int[numParticipantes];
        arrayDorsalesFormateado=new int[numParticipantes];
        //Metodo en el que pedimos y vamos introduciendo los numeros de los dorsales de los participantes
        arrayDorsalesInicial=rellenarArrayParticipantes(arrayDorsalesInicial);
        //Preguntar posicion a posicion si es dopping y eliminarlo.
        arrayDorsalesFormateado=comprobarDopajeParticipantes(arrayDorsalesInicial);
        //Preguntar posicion a posicion si es menor de edad y SI TRUE adelantar un puesto.
        arrayDorsalesFormateado=comprobarMenorEdad(arrayDorsalesFormateado);
        //Preguntar posicion a posicion si ha pagado, SI NO se mueve al final de la lista.
        arrayDorsalesFormateado=comprobarPagoCorredor(arrayDorsalesFormateado);
        visualizarArray(arrayDorsalesFormateado);
    }//fin body

    public static int preguntarParticipantes(int participantes) {
        System.out.print("Introduce el número de participantes que hay en la carrera: ");
        participantes=new Scanner(System.in).nextInt();
        return participantes;
    }//finn preguntar participantes

    public static int[] rellenarArrayParticipantes(int[] array) {
        int dorsal=0;
        int posicion=0;
        do {
            System.out.print("Introduce el dorsal del corredor: ");
            dorsal=new Scanner(System.in).nextInt();
            //IF para descartar todos los valores menores que -1
            if(dorsal>-1) {
                //añadimos el valor del dorsal al array segun la posicion que va incrementando en 1 desde 0.
                array[posicion]=dorsal;
                posicion++;
            } else if(dorsal==-1){
                System.out.println("Ha finalizado la inserción de dorsales.");
            } else {
                System.out.println("No es válido el dorsal introducido.");
            }
            //finaliza si introduce -1
        }while((posicion<array.length)&&(dorsal!=-1));
        return array;
    }//fin rellenado

    public static int[] comprobarDopajeParticipantes(int[] array) {
        char dopaje;
        int[] arrayFormato=new int[array.length];
        int contador=0;
        System.out.println();
        for(int i=0;i<array.length;i++){
            System.out.print("El dorsal numero "+array[i]+" se ha dopado? (s/n):"); 
            dopaje=new Scanner(System.in).next().charAt(0);
            dopaje=Character.toLowerCase(dopaje);
            if(dopaje=='n'){
                arrayFormato[contador]=array[i];
                contador++;
            } else if((dopaje!='s')&&(dopaje!='n')) {
                System.out.println("Caracter no válido.");
                i--;
            }
        }
        return arrayFormato;
    }

    public static void visualizarArray(int[] array) {
        int puesto=1;
        System.out.println("La lista de los dorsales de los corredores es: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println("\nLos ganadores son: ");
        for(int i=0;i<3;i++){
            System.out.println("Puesto "+puesto+": Dorsal n"+array[i]);
            puesto++;
        }
    }//fin visualizacion array

    public static int[] comprobarMenorEdad(int[] array) {
        int aux=0;
        System.out.println();
        for(int i=0;i<array.length;i++) {
            char menorEdad;
            if((i!=0)&&(array[i]>0)){
                System.out.println("El corredor del dorsal "+array[i]+" es menor de edad? (s/n)");
                menorEdad=new Scanner(System.in).next().charAt(0);
                menorEdad=Character.toLowerCase(menorEdad);
                if(menorEdad=='s'){
                    aux=array[i-1];
                    array[i-1]=array[i];
                    array[i]=aux;
                } else if((menorEdad!='s')&&(menorEdad!='n')) {
                    System.out.println("Caracter no válido.");
                    i--;
                }
            }
        }
        return array;
    }//fin comprobar menor edad y recolocar.

    public static int[] comprobarPagoCorredor(int[] array) {
        char pago;
        int contador=0;
        int contador2=0;
        int[] arrayMorosos=new int[array.length];
        int[] arrayBuenaonda=new int[array.length];
        System.out.println();
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                System.out.print("El dorsal numero "+array[i]+" ha pagado? (s/n):"); 
                pago=new Scanner(System.in).next().charAt(0);
                pago=Character.toLowerCase(pago);
                if(pago=='n'){
                    arrayMorosos[contador]=array[i];
                    contador++;
                } else if(pago=='s') {
                    arrayBuenaonda[contador2]=array[i];
                    contador2++;
                } else if((pago!='s')&&(pago!='n')) {
                    System.out.println("Caracter no válido.");
                    i--;
                }
            }
        }
        do {
            arrayBuenaonda[contador2]=arrayMorosos[contador];
            contador2++;
            contador--;
        }while(contador>=0);
        for(int i=0;i<array.length;i++) {
            if(arrayBuenaonda[i]!=0) {
                array[i]=arrayBuenaonda[i];
            }
        }
        return array;
    }
}//fin clase
