/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victor;

/**
 *
 * @author Victor
 */
public class Gatos extends Mamiferos {
    //Atributos
    private String raza;
    //Constructores
    public Gatos(){
        super();
        this.sexo = Sexo.hembra;
        this.raza = "Siames";
    }
    public Gatos(Sexo sexo){
        super();
        this.sexo = sexo;
    }
    public Gatos(String raza){
        super();
        this.raza = raza;
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
    public void peleaCon(Gatos otroGato){
        if((this.sexo==Sexo.macho)&&(otroGato.sexo==Sexo.macho)){
            System.out.println("Se pelean los dos gatos machos");
        } else {
            System.out.println("Los gatos no son los dos machos y no se pelean");
        }
    }

    void juegaCon(Gatos get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
