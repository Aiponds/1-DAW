package Caja812;

/**
 *
 * @author Victor
 */
public class Caja {
    protected final int ancho, alto, fondo;
    protected String etiqueta;
    protected final Unidad unidad;
    protected enum Unidad { cm, m };
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    public double getVolumen() {
        if(this.unidad==Unidad.cm){
            return ((this.ancho/100) * (this.alto/100) * (this.fondo/100));
        } else {
            return (this.ancho * this.alto * this.fondo);
        }
    }
    public void  setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta.length() <= 30 ? etiqueta : etiqueta.substring(0,30);
    }
    @Override
    public String toString() {
        return ("Ancho: " + this.ancho + " " + this.unidad +
                "\nAlto: " + this.alto + " " + this.unidad +
                "\nFondo: " + this.fondo + " " + this.unidad +
                "\nEtiqueta: " + this.etiqueta);
    }
}

