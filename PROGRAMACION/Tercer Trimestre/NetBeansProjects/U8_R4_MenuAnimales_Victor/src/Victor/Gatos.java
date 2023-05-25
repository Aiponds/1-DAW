/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victor;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Gatos extends Mamiferos {
    //Atributos
    private String raza;
    private ArrayList<Dientes> dentadura;
    //Constructores
    public Gatos(){
        super();
        this.sexo = Sexo.hembra;
        this.raza = "Siames";
        
    }
    public Gatos(Sexo sexo, String raza){
        super();
        this.sexo = sexo;
        this.raza = raza;
        
    }
    
    //Metodos
    @Override
    public String toString(){
        return "\nSexo: "+this.sexo+"\n"+
                "Raza: "+this.raza+"\n"+
                "Tipo: "+this.tipo+"\n";                
    }
    public void maullar(){
        System.out.println("Miau miau miau");
    }
    public void ronronear(){
        System.out.println("purrrrrr....");
    }
    @Override
    public void comer(String comida){
        comida=comida.toLowerCase();
        if(comida!="pescado"){
            System.out.println("No me gusta esta comida");
        } else {
            System.out.println("Que rico!");
        }
    }
    public void juegaCon(Gatos otroGato){
        if((this.sexo==Sexo.hembra)&&(otroGato.sexo==Sexo.hembra)){
            System.out.println("Las dos gatas juegan");
        } else {
            System.out.println("Los gatos no son ambos hembras y no juegan.");
        }
    }
}
