package Victor;

/**
 *
 * @author Victor
 */
public class Animales {
   protected Sexo sexo;
   protected static int cantidadAnimales=0;
   //CONSTRUCTORES
   public Animales(){
       this.sexo = Sexo.macho;
       this.cantidadAnimales++;
   }
   public Animales(Sexo sexo){
       this();
       this.sexo = sexo;
   }
   //GETTERS Y SETTERS
   public Sexo getSexo(){
       return this.sexo;
   }
   public int getCantidadAnimales(){
       return this.cantidadAnimales;
   }
   public void setSexo(Sexo sexo){
       this.sexo = sexo;
   }
   //METODOS
   public void duerme(){
       System.out.println("Zzzzzz");
   }
}
