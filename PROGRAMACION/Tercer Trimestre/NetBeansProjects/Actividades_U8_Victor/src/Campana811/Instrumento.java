/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campana811;

import java.util.Arrays;

/**
 *
 * @author Victor
 */
public abstract class Instrumento {
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI}
    protected Nota[] melodia;
    public Instrumento(){
        this.melodia = new Nota[0];
    }
    void add(Nota n){
        melodia = Arrays.copyOf(this.melodia, this.melodia.length+1);
        this.melodia[this.melodia.length-1] = n;
    }
    abstract void intepretar();
}

