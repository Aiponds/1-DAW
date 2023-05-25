import java.util.Scanner;
public class U3_R1_Ej2_Victor {
    public static void main(String[]args) { //Victor Stala
        //Implementar una aplicacion para calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo y se mostrará: la suma de todas las edades introducidas, la media, el numero de alumnos y cuantos son mayores de edad.
        //Variables
        Scanner teclado=new Scanner(System.in);
        byte edad=0;
        int numAlumnos=0,numMayoresEdad=0;
        long sumaEdades=0;
        float mediaEdades=0;
        //Desarrollo
        System.out.println("Voy a pedirte las edades de los alumnos del centro educativo. Si introduces un numero negativo o cero, voy a parar y mostrare los datos recolectados.");
        //Pedir la edad
        System.out.println("Introduce la edad: ");
        edad=teclado.nextByte();
        while(edad>0) {
            //Se suman las edades para el total
            sumaEdades+=edad;
            //Se comprueba si es mayor de edad.
            if(edad>=18)
                numMayoresEdad+=1;
            //volver a pedir la edad al final
            System.out.println("Introduce otra edad: ");
            edad=teclado.nextByte();
            //sumamos 1 al contador de alumnos 
            numAlumnos+=1;          
        }//Fin while
        //Se calcula la edad media.
        if(numAlumnos==0)
            System.out.println("\nNo has introducido ninguna edad");
        else {
            mediaEdades=sumaEdades/numAlumnos;
            System.out.println("\nEl recuento ha finalizado, voy a mostrate los datos.");
            System.out.println("La suma de las edades total es: "+sumaEdades);
            System.out.println("El numero total de alumnos es: "+numAlumnos);
            System.out.println("La media de las edades es: "+mediaEdades);
            System.out.println("En el centro hay un total de "+numMayoresEdad+" de alumnos mayores de edad.");
        }//Fin else
        teclado.close();
    }//Fin main
}//Fin clase
