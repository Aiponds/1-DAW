package Victor;

/**
 *
 * @author Victor
 */
public class Perros extends Mamiferos {
    private String raza;
    //constructores
    public Perros(){
        super();
        this.raza="pastor aleman";
    }
    public Perros(Sexo sexo, String raza){
        super();
        this.sexo=sexo;
        this.raza=raza;
    }
    //metodos
    @Override
    public String toString(){
        return "\nSexo: "+this.sexo+"\n"+
                "Raza: "+this.raza+"\n"+
                "Tipo: "+this.tipo+"\n";
                
    }
    public void ladrar(){
        System.out.println("Guau guau");
    }
    public void grunir(){
        System.out.println("grrrrr....");
    }
    @Override
    public void comer(String comida){
        comida=comida.toLowerCase();
        if(comida!="pienso"){
            System.out.println("No me gusta esta comida");
        } else {
            System.out.println("Que rico!");
        }
    }
    
    public void juegaCon(Perros otroPerro){
        if(this.sexo==Sexo.hembra && otroPerro.sexo==Sexo.hembra){
            System.out.println("Que bien nos lo pasamos!");
        } else {
            System.out.println("No son los dos hembras y no juegan juntos.");
        }
    }
}
