package Victor;
import java.io.*;
/**
 *
 * @author Victor
 */
public class Ejercicio5_Victor {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Victor\\Downloads\\IesMurgi.jpeg");
        int byteLeido = 0;
        long contador = 0;
        while (byteLeido != -1) {
            byteLeido = fis.read();
            contador+=byteLeido;
        }
        System.out.print(contador+" bytes.");
    }
}
