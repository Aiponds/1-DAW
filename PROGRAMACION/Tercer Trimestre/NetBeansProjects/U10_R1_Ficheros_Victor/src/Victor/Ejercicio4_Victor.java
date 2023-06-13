package Victor;
import java.io.*;
/**
 *
 * @author Victor
 */
public class Ejercicio4_Victor {
    public static void main(String[] args) throws IOException {
        String linea = "";
        FileReader fr = new FileReader("C:\\Users\\Victor\\Documents\\OneDrive\\Escritorio\\modulos.txt");
        BufferedReader br = new BufferedReader(fr);
        while(linea!=null){
            linea = br.readLine();
            if(linea!=null) {
                System.out.println(linea);
            }
        }
    }
}
