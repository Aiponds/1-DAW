/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8_1;

/**
 *
 * @author Victor
 */
public class HoraExacta extends Hora {
    private int segundo;
    public HoraExacta(){
        super();
        this.segundo=0;
    }
    public HoraExacta(int hora, int minuto, int segundo){
        super(hora, minuto);
        this.segundo=segundo;
        rango();
    }
    public void setSegundo(int valor){
        if(valor<=59 && valor>=0){
            this.segundo+=valor;
        }
        rango();
    }
    @Override
    public void inc(){
        this.segundo+=1;
        rango();
    }
    private void rango(){
        if(this.segundo>59){
            this.segundo=0;
            this.minuto++;
        }
        if(this.minuto>59){
            this.minuto=0;
            this.hora++;
        } 
        if(this.hora>23){
            this.hora=0;
        }
    }
    @Override
    public String toString(){
        String cad;
        cad = minuto<10 ? "Hora: "+this.hora+":0"+this.minuto : "Hora: "+this.hora+":"+this.minuto;
        cad = segundo<10 ? cad+":0"+this.segundo : cad+":"+segundo;
        return cad;
    }
}
