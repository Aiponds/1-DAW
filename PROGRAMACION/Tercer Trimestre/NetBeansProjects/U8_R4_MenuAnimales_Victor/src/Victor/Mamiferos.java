package Victor;

/**
 *
 * @author Victor
 */
public class Mamiferos extends Animales implements Cloneable {
    protected String tipo;
    //Constructores
    public Mamiferos(){
        super();
        this.tipo = "De tierra";
    }
    public Mamiferos(Sexo sexo, String tipo){
        super(sexo);
        this.tipo = tipo;
    }
    public Mamiferos(Mamiferos obj){
        this.sexo = obj.sexo;
        this.tipo = obj.tipo;
    }
    public void nadar(){
        if(this.tipo=="De tierra"){
            System.out.println("No puedo nadar mucho");
        } else {
            System.out.println("Puedo nadar!");
        }
    }
    public void correr(){
        if(this.tipo=="De tierra"){
            System.out.println("Te corro 100 metros lisos rapidamente");
        } else {
            System.out.println("Me pones en tierra y no rindo");
        }
    }
    public void duerme(){
        super.duerme();
    }
    public void comer(String comida){
        comida=comida.toLowerCase();
        if(this.tipo=="De agua" && comida=="algas"){
            System.out.println("Que rico!");
        } else if(this.tipo=="De agua"){
            System.out.println("No me gusta esa comida.");
        } else if(this.tipo=="De tierra" && comida=="algas") {
            System.out.println("No me gusta esa comida.");
        } else {
            System.out.println("Que rico!");
        }
    }

    @Override
    public String toString() {
        return " -sexo ->"+this.sexo+" -tipo -> "+this.tipo;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
