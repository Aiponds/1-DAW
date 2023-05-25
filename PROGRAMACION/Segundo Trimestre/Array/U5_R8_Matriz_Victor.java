import java.util.*;
public class U5_R8_Matriz_Victor {
    public static void main(String[]args) { //Victor Stala
        //Variables
        int dimension;
        int[][] matriz;
        //Desarrollo
        dimension=pedirDimension();
        matriz=new int[dimension][dimension];
        matriz=rellenarMatriz(matriz);
        mostrarMatriz(matriz);
    }//fin body

    public static int pedirDimension() {
        int num;
        do {
            System.out.print("Introduce un numero para la dimensión de la matriz: ");
            num=new Scanner(System.in).nextInt();
        }while(num<=0);
        return num;
    }//fin pedir num

    public static int[][] rellenarMatriz(int[][] matriz) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                if(i==j) {
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=(int)(Math.random()*18)+2;
                }
            }
        }
        System.out.println("\nSe ha rellenado la matriz.");
        return matriz;
    }//fin rellenar

    public static void mostrarMatriz(int[][] matriz) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
