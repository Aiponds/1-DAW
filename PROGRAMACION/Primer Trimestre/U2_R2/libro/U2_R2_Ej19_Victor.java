import java.util.*;
public class U2_R2_Ej19_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        Crea una aplicacion que solicite al usuario cuantos grados tiene un angulo y muestre el equivalente en radianes. Si el angulo introducido por el usuario no se encuentra en el rango de 0 a 360º hay que transformarla a dicho rango.
        Nota: El operador modulo puede ayudarnos a convertir un angulo a su equivalente en el rango comprendido de 0º a 360º
        */
        //Variables
        int grados;
        double radianes;
        Scanner teclado=new Scanner(System.in);
        //Desarrollo
        System.out.println("Introduce los grados que tiene un angulo. Voy a calcular el equivalente en radianes.\nIntroduce los grados: ");
        grados=teclado.nextInt();
        if(grados==0)
            System.out.println(grados+"º equivalen a 0 radianes");
        else {
            if(grados<0) {
                //Convertir y calcular radianes
                grados=(360-(Math.abs(grados)%360));
                radianes=grados*(Math.PI/180);   
                System.out.println(grados+"º equivalen a "+radianes+" radianes.");         
            }
            else {
                if(grados>360) {
                    //Convertir y calcular radianes
                    grados=(360-(grados%360));
                    radianes=grados*(Math.PI/180);
                    System.out.println(grados+"º equivalen a "+radianes+" radianes.");    
                }
                else {
                    //Calcular radianes
                    radianes=grados*(Math.PI/180);
                    System.out.println(grados+"º equivalen a "+radianes+" radianes.");
                }
            }
        }
    }
}