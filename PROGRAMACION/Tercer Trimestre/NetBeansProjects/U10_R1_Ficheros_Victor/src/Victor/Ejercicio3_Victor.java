package Victor;

import java.io.*;

/**
 *
 * @author Victor
 */
public class Ejercicio3_Victor {
    public static void main(String[] args) throws IOException {
        String frase = "\nIES Murgi ( El Ejido) Almeria\n" +"Curso 2022 2023.\n" +"CFGS DAW.";
        FileWriter fw = new FileWriter("C:\\Users\\Victor\\Documents\\OneDrive\\Documentos\\Ficheros\\salida.txt" ,true);
        for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                fw.write(caracter);
            }
        fw.close();
    }
}
