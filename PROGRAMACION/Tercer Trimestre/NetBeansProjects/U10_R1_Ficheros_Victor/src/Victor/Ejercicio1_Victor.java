package Victor;

import java.io.*;

/**
 *
 * @author Victor
 */
public class Ejercicio1_Victor {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Victor\\Documents\\OneDrive\\Documentos\\NetBeansProjects\\U10_R1_Ficheros_Victor\\mensajecortesia.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }
}
