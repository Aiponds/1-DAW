/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victor;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Victor
 */
public class Ejercicio9_Victor {
    public static void main(String[] args) throws IOException {
        File carpeta = new File("C:\\Users\\Victor\\Documents\\OneDrive\\Escritorio\\Prueba", "\\CarpetaInterna");
        File archivo = new File(carpeta, "\\archivogenerado.ods");
        carpeta.mkdir();
        archivo.createNewFile();
    }
}
