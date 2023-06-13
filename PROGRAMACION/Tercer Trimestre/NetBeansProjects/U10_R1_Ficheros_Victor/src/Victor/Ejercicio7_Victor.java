package Victor;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Victor
 */
public class Ejercicio7_Victor {
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
        ArrayList<Calendario> calendarios = new ArrayList<Calendario>();
        calendarios.add(new Calendario(2023,(byte)4,(byte)10));
        calendarios.add(new Calendario(1998,(byte)5,(byte)15));
        calendarios.add(new Calendario(2024,(byte)1,(byte)1));
        calendarios.add(new Calendario(2000,(byte)10,(byte)9));
        calendarios.add(new Calendario(2013,(byte)4,(byte)11));
        //Serialización
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Victor\\Documents\\OneDrive\\Escritorio\\TemaFicherosJava\\FicheroSerializado.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(calendarios);
        oos.close();
        fos.close();
        //Deserialización
        FileInputStream fis = new FileInputStream("C:\\Users\\Victor\\Documents\\OneDrive\\Escritorio\\TemaFicherosJava\\FicheroSerializado.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Calendario> calendariosDeserializados = (ArrayList<Calendario>) ois.readObject();
        ois.close();
        fis.close();
        
        System.out.println("ArrayList deserializado:");
        for (int i = 0; i < calendariosDeserializados.size(); i++) {
            System.out.println(calendariosDeserializados.get(i).toString());
        }
    }
}
