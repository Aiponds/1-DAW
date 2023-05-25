/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cifrado717;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        Cifrado cifrado = new Cifrado();
        
        String mensaje = "Ejemplo de cifrado Victor";
        System.out.println("Mensaje original: " + mensaje);
        mensaje=mensaje.toLowerCase();
        String mensajeCodificado = cifrado.codificar(mensaje, 3);
        System.out.println("Mensaje codificado: " + mensajeCodificado);

    }
}
