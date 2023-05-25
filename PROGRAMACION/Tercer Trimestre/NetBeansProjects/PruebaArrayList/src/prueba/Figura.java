package prueba;

/**
 *
 * @author Victor
 */
public abstract class Figura {
    protected String color;
    protected boolean relleno;
    //Constructor
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }
    //Getters y Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getRelleno() {
        return relleno;
    }
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
}
