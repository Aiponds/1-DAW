package Ejercicio8_1;

/**
 *
 * @author Victor
 */
public class Hora {
    protected int hora;
    protected int minuto;
    
    public Hora(){
        this.hora=0;
        this.minuto=0;
    }
    public Hora(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
        rango();
    }
    public void inc(){
        this.minuto+=1;
        rango();
    }
    private void rango(){
        if(this.minuto>59){
            this.minuto=0;
            this.hora++;
        } 
        if(this.hora>23){
            this.hora=0;
        }
    }
    public boolean setMinutos(int valor){
        this.minuto+=valor;
        if(this.minuto>59){
            this.minuto-=valor;
            return false;
        } else {
            return true;
        }
    }
    public boolean setHora(int valor){
        this.hora+=valor;
        if(this.hora>23){
            this.hora-=valor;
            return false;
        } else {
            return true;
        }
    }
    @Override
    public String toString(){
        String cad;
        cad = minuto<10 ? "Hora: "+this.hora+":0"+this.minuto : "Hora: "+this.hora+":"+this.minuto;
        return cad;
    }
}
