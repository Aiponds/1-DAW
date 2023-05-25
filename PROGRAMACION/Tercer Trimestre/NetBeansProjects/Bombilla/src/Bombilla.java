/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Bombilla {
    /*
     * BOOLEAN PRIVADO ENCENDIDA-APAGADA (ESTADO)
     * METODO QUE NOS DIGA EL ESTADO DE LA BOMBILLA
     * METODO QUE APAGUE-ENCIENDA TODAS LAS BOMBILLAS
     * VIGILAR QUE SOLO SE PUEDE ENCENDER SI EL INTERRUPTOR GENERAL ESTA ENCENDIDO
     */
    private boolean estado;
    private static boolean corriente=true;
    
    public Bombilla(){
        this.estado=false;
    }
    public boolean getEstado(){
        return this.estado&&this.corriente;
    }
    public void cambiarEstado(){
        this.estado = !this.estado;
    }
    public void cambiarEstadoGeneral(){
        this.corriente = !this.corriente;
    }
}
