package Victor;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Victor
 */
public class Ejercicio6_Victor {
    public static void main(String[] args) throws IOException  {
        FileInputStream fis = new FileInputStream("C:\\Users\\Victor\\Downloads\\IesMurgi.jpeg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Victor\\Downloads\\IesMurgi2.jpeg");
        ArrayList bytesImagen = new ArrayList<Integer>();
        int byteLeido = 0;
        long contador = 0;
        while (byteLeido != -1) {
            byteLeido = fis.read();
            bytesImagen.add(byteLeido);
        }
        for (int i = 0; i < bytesImagen.size(); i++) {
            fos.write((int) bytesImagen.get(i));
        }
        fos.close();
    }
}
