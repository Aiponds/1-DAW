/**
 *
 * @author Victor
 */
class Sintonizador {
    //Atributos
    private double frecuencia;
    /*
     * Constructores
     */ 
    public Sintonizador(){
        this.frecuencia = 80.0;
    }
    public Sintonizador(double frecuencia){
        this.frecuencia = frecuencia;
    }
    /*
     * Getters y Setters
     */
    public double getFrecuencia(){
        return this.frecuencia;
    }
    public void setFrecuencia(double frecuencia){
        this.frecuencia=frecuencia;
    }
    /*
     * Metodos
     */
    public void frecuenciaUp(){
        this.frecuencia+=0.5;
        rango();
    }
    public void frecuenciaDown(){
        this.frecuencia-=0.5;
        rango();
    }
    private void rango(){
        this.frecuencia=this.frecuencia>108 ? 80: this.frecuencia;
        this.frecuencia=this.frecuencia<80 ? 108: this.frecuencia;
    }
    public void frecuenciaDisplay(){
        System.out.println("Frecuencia actual: "+getFrecuencia());
    }
    public boolean iguales(Sintonizador radio){
        return(this.frecuencia == radio.getFrecuencia());
    }
}