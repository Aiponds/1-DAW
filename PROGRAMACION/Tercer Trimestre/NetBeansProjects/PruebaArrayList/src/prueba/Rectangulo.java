/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Victor
 */
public class Rectangulo extends Figura implements Calculable {
    //Atributos
    private double base, altura;
    //Constructor
    public Rectangulo(double base, double altura, String color, boolean relleno) {
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }
    //Getters y Setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (base*altura);
    }
    @Override
    public double calcularPerimetro(){
        return(2*base+2*altura);
    }
    @Override
    public String toString() {
        return "\n\nColor : "+this.color+
                "\nRelleno : "+this.relleno+
                "\nBase : "+this.base+
                "\nAltura : "+this.altura+
                "\nArea : "+calcularArea()+
                "\nPerimetro : "+calcularPerimetro();
    }
}
