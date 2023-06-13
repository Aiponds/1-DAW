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
public class Ejercicio8_Victor {
    public static void main(String[] args) throws IOException {
        File carpeta = new File("C:\\Users\\Victor\\Documents\\OneDrive\\Escritorio\\Imagenes");
        listarArchivos(carpeta);
    }
    public static void listarArchivos(File carpeta) {
        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (int i = 0; i < archivos.length; i++) {
                File archivo = archivos[i];
                if (archivo.isFile()) {
                    System.out.println("Archivo: " + archivo.getName());
                } else if (archivo.isDirectory()) {
                    System.out.println("Directorio: " + archivo.getName());
                    listarArchivos(archivo); // Recursivamente listar archivos en subcarpeta
                }
            }
        }
    }
}
