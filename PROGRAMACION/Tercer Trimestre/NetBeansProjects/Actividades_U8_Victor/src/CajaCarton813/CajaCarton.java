/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajaCarton813;

import Caja812.Caja;

/**
 *
 * @author Victor
 */
public class CajaCarton extends Caja {
    private static double superficieTotal = 0.0;
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
        superficieTotal += 2 * (ancho * alto + alto * fondo + ancho * fondo); //Formula del area de una caja que suma al acumulador. Devuelve en cm^2
    }
    @Override
    public double getVolumen() {
        return (this.ancho * this.alto * this.fondo)*0.8;
    }
    public double getSuperficieTotal() {
        return superficieTotal;
    }
    
}
