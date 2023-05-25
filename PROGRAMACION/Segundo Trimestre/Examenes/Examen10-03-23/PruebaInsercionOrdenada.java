import java.util.Arrays;

import java.util.*;
public class PruebaInsercionOrdenada {
    public static void main(String[]args) { //Victor Stala
        /*
         * Pedir 3 nombres y ordenarloz (A-Z)
         * Utilizar vectores y buscar mediante vector[i].charAt[0]<vector[i].charAt[0]; 
         * Primero trim() y toUpperCase();
         */
        
        char salir;
        String nombre;
        String aux;
        String agenda[] = new String[3];
        Arrays.fill(agenda, "a");
        do {
            nombre=pedirNombre();
            agenda[0]=nombre; //ANA
            for(int i=1;i<agenda.length;i++){
                nombre=pedirNombre();
                agenda[i]=nombre; //PABLO, BERNARDO
                for(int j=0;j<agenda.length;j++) {
                    if((agenda[j]!=null)&&(agenda[j].charAt(0)<agenda[i].charAt(0))){
                        aux=agenda[j];
                        agenda[j]=nombre;
                        agenda[i]=aux;
                    }
                }
            }
            for(int i=agenda.length-1;i>0;i--){
                System.out.print(agenda[i]+",");
            }
            salir=pedirCaracter();
        }while(salir!='s');
    }
    public static char pedirCaracter() {
        char salir;
        System.out.println("Quieres salir? s=salir");
        salir=new Scanner(System.in).next().charAt(0);
        Character.toLowerCase(salir);
        return salir;
    }
    public static String pedirNombre() {
        String nombre;
        System.out.println("Introduce un nombre para la agenda: ");
        nombre=new Scanner(System.in).nextLine();
        nombre.trim();
        nombre.toUpperCase();
        return nombre;
    } 
}
