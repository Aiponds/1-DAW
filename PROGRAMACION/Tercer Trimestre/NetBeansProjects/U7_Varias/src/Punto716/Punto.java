package Punto716;

/**
 *
 * @author Victor
 */
public class Punto {
    private double x,y;
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void desplazaX(double dx){
        this.x+=dx;
    }
    public void desplazaY(double dy){
        this.y+=dy;
    }
    public void desplaza(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }
    public double distanciaEuclidea(Punto otro){
        double d;
        d=Math.sqrt(Math.pow((otro.x-this.x),2)+Math.pow((otro.y-this.y),2));
        return d;
    }
    public void muestra(){
        System.out.println("X: "+this.x);
        System.out.println("Y: "+this.y);
    }
}
