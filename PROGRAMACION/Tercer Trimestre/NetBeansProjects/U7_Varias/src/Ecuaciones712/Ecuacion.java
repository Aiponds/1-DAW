/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ecuaciones712;

/**
 *
 * @author Victor
 */
public class Ecuacion {
    private int a,b,c;
    private double resul;
    
    public Ecuacion(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.resul=0;
    }
    private double resolverDiscriminante(){
        return ((Math.pow(b,2))-4*this.a*this.c);
    }
    private boolean comprobarValidez(double discriminante){
        return resolverDiscriminante()>=0;
    }
    private double resolverRaiz(double discriminante){
        return (Math.sqrt(discriminante));
    }
    public String resolverEcuacion(){
        this.resul=resolverDiscriminante();
        String resultado;
        if(comprobarValidez(this.resul)==false) {
            resultado="El discriminante no se puede resolver ya que es negativo, por lo cual la ecuación no tiene solución.";
        } else {
            resul=resolverRaiz(this.resul);
            double resul2=resul;
            this.b*=-1;
            resul=(this.b+resul)/2*a;
            resultado="x1 = "+resul+", ";
            resul2=(this.b-resul2)/2*a;
            resultado+="x2 = "+resul2;
        }
        return resultado;
    }
}
