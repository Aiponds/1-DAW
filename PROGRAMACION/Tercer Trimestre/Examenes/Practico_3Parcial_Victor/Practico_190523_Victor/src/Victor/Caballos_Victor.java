package Victor;

/**
 *
 * @author Victor
 */
public class Caballos_Victor {
    //Atributos
    protected String nombreCaballo, nombreJinete;
    //Constructores
    public Caballos_Victor(){
        this.nombreCaballo = "Juan";
        this.nombreJinete = "Paco";
    }
    public Caballos_Victor(String nombreCaballo, String nombreJinete) {
        this.nombreCaballo = nombreCaballo;
        this.nombreJinete = nombreJinete;
    }
    public Caballos_Victor(Caballos_Victor caballo){
        this.nombreCaballo = caballo.nombreCaballo;
        this.nombreJinete = caballo.nombreJinete;
    }
    /*
     * Getter del nombre del caballo.
     */
    public String getNombreCaballo() {
        return nombreCaballo;
    }
    /*
     * Metodos
     */
    @Override
    public String toString() {
        return "\nCaballo: " + "\nNombre del caballo=" + nombreCaballo + "\nNombre del Jinete=" + nombreJinete;
    }
    
}
