/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victor;
import java.io.*;

/**
 *
 * @author Victor
 */
public class Ejercicio2_Victor {
    public static void main(String[] args) throws IOException  {
        String frase = "Estamos escribiendo a traves de streams de datos.";
        FileWriter fw = new FileWriter("C:\\Users\\Victor\\Documents\\OneDrive\\Documentos\\Ficheros\\salida.txt");
        for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                fw.write(caracter);
        }
        fw.close();
    }
}
