/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cambio714;

/**
 *
 * @author Victor
 */
public class Cambio {
    private int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    private String[] denominaciones = {"500€", "200€", "100€", "50€", "20€", "10€", "5€", "2€", "1€"};    
    public void calcularCambio(int total, int pago) {
        int cambio = pago - total;
        System.out.println("Cambio: " + cambio);
        for (int i = 0; i < valores.length; i++) {
            int cantidad = cambio / valores[i];
            if (cantidad > 0) {
                System.out.println(denominaciones[i] + ": " + cantidad);
                cambio -= cantidad * valores[i];
            }
        }
    }
}
