package Victor;
import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Calendario implements Serializable {
    /*
     * Atributos
     */
    private int anyo;
    private byte mes,dia;
    /*
     * Constructores ( Predeterminado y con todos los datos )
     */
    public Calendario(){
        this.anyo=2023;
        this.mes=4;
        this.dia=21;
    }
    public Calendario(int anyo, byte mes, byte dia){
        this();
        this.anyo=anyo;
        this.mes=mes;
        this.dia=dia;
        fechaValida(); //validar la fecha (no se si es valido meter metodos dentro del constructor pero me funciona).
    }
    /*
     * Metodos
     */
    public void incrementarDia(){
        //incrementamos un dia y comprobamos si sigue dentro del rango de la fecha posible.
        this.dia+=1;
        rangoDias();
    }
    public void incrementarMes(){
        //incrementamos un mes y comprobamos si sigue dentro del rango de la fecha posible.
        this.mes+=1;
        rangoMes();
    }
    public void incrementarAnyo(int cantidad){
        //incrementamos solo si realmente es un incremento la cantidad introducida.
        this.anyo = cantidad>0 ? this.anyo+=cantidad : this.anyo;
    }
    @Override
    public String toString(){
        return ("Fecha: "+this.dia+"/"+this.mes+"/"+this.anyo);
    }
    public boolean iguales(Calendario fecha){
        return (this.dia==fecha.dia && this.mes==fecha.mes && this.anyo==fecha.anyo);
    }
    private void rangoDias(){
        if(this.dia>28 && this.mes==2){
            this.dia=1;
            incrementarMes();
        } else if(this.dia>31 && (this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12)){
            this.dia=1;
            incrementarMes();
        } else if(this.dia>30 && (this.mes==4 || this.mes==6  || this.mes==9 || this.mes==11)){
            this.dia=1;
            incrementarMes();
        }
    }
    private void rangoMes(){
        if(this.mes>12){
          this.mes=1;
          incrementarAnyo(1);
        } 
    }
    private void fechaValida(){
        this.dia = this.dia<1 ? this.dia=1 : this.dia;
        this.mes = this.mes<1 ? this.mes=1 : this.mes;
        this.anyo = this.anyo==0 ? this.anyo=1 : this.anyo;
        rangoDias();
        rangoMes();
    }
}
