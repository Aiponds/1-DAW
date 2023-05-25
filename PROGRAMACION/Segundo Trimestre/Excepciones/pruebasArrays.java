import java.util.*;
public class pruebasArrays {
    public static void main(String[]args){
        //varaibles
        int[] arrayEntero = new int[]{3,7,4,1,5,9,6,0,10};
        char[] arrayChar = new char[]{'A','B','C','D','E'};
        String[] arrayString = new String[]{"Pablo","Victor","Jairo","Alberto","Dani","Pedro","Chema","Alfonso","Isma"};
        int posicion;
        //desarrollo
        Arrays.sort(arrayString);
        posicion=Arrays.binarySearch(arrayString, "Victor");
        System.out.println(arrayString[posicion]);
    
        System.out.println(Arrays.toString(arrayChar));
        Arrays.sort(arrayEntero);
        System.out.println(Arrays.toString(arrayEntero));
        int[] arrayEntero2=arrayEntero; //CON EL MISMO CONTENIDO EN MEMORIA CREA UNA COPIA, SI EDITAMOS ORIGINAL CAMBIA LA COPIA
        int[] arrayClonado=arrayEntero.clone(); //EL MISMO CONTENIDO PERO EN OTRO ESPACIO EN MEMORIA, SI CAMBIAMOS LA ORIGINAL LA COPIA SE MANTIENE
        System.out.println(arrayEntero==arrayClonado);
        System.out.println(arrayEntero==arrayEntero2);
        System.out.println(Arrays.equals(arrayEntero, arrayClonado));
        arrayEntero[2]=2;
        System.out.println(arrayEntero2[2]);
        System.out.println(arrayClonado[2]);
        System.out.println(arrayEntero==arrayClonado);
        System.out.println(arrayEntero==arrayEntero2);
        System.out.println(Arrays.equals(arrayEntero, arrayClonado));
        Arrays.fill(arrayEntero2, 1);
        System.out.println(Arrays.toString(arrayEntero2));
        int[] arrayCopia1=Arrays.copyOf(arrayEntero, 3);
        int[] arrayCopia2=Arrays.copyOfRange(arrayEntero, 3, arrayEntero.length);
        System.out.println(Arrays.toString(arrayCopia1));
        System.out.println(Arrays.toString(arrayCopia2));
    }
}

