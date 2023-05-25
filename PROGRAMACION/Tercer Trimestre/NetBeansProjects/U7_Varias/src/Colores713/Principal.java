/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colores713;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Colores
        Colores colores = new Colores();
        
        // Imprimir la paleta inicial
        System.out.println("Paleta inicial:");
        System.out.println(colores.toString());
        
        // Agregar un color a la paleta
        colores.agregarColor("azul");
        
        // Imprimir la paleta actualizada
        System.out.println("Paleta actualizada:");
        System.out.println(colores.toString());
        
        // Generar una lista de colores al azar
        int n = 4;
        String[] nColores = colores.azar(n);
        
        // Imprimir los colores generados al azar
        System.out.println("Colores generados al azar:");
        for (int i = 0; i < nColores.length; i++) {
            System.out.println(nColores[i]);
        }
    }
}
