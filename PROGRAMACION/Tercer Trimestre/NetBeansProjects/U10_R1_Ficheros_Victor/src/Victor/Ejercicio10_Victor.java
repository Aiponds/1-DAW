package Victor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Ejercicio10_Victor {
    public static void main(String[] args) throws IOException {
        System.out.print("1. Introduce el nombre de un directorio a crear: ");
        String nomDirectorio = new Scanner(System.in).nextLine();
        System.out.print("1. Introduce el nombre de un fichero a crear: ");
        String nomArchivo = new Scanner(System.in).nextLine();
        System.out.print("1. Introduce una frase a introducir en ese fichero: ");
        String frase = new Scanner(System.in).nextLine();
        nomArchivo = nomArchivo+".txt";
        File carpeta = new File(nomDirectorio);
        File archivo = new File(carpeta, nomArchivo);
        carpeta.mkdir();
        archivo.createNewFile();
        FileWriter fw = new FileWriter(archivo);
        for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                fw.write(caracter);
        }
        
        fw.close();
    }
}
