/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Victor
 */
public class Circulo extends Figura implements Calculable {
    //Atributos
    private double radio;
    //Constructor
    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }
    //Getters y Setters
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return (Math.PI*(Math.pow(this.radio, 2)));
    }
    @Override
    public double calcularPerimetro(){
        return (2*Math.PI*this.radio);
    }

    @Override
    public String toString() {
        return "\n\nColor : "+this.color+
                "\nRelleno : "+this.relleno+
                "\nRadio : "+this.radio+
                "\nArea : "+calcularArea()+
                "\nPerimetro : "+calcularPerimetro();
    }
    
}
