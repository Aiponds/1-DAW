/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto716;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(5, 7);

        System.out.println("Distancia entre los puntos:");
        System.out.println(punto1.distanciaEuclidea(punto2));

        System.out.println("\nPunto 1:");
        punto1.muestra();

        System.out.println("\nDesplazando punto 1 en x: 1.5 y y: -0.5");
        punto1.desplaza(1.5, -0.5);

        System.out.println("\nPunto 1 actualizado:");
        punto1.muestra();
    }
}

