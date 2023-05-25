package Victor;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Cuadras_Victor {
    //Atributos
    protected final String CIF;
    protected String nombre,lugarResidencia;
    protected ArrayList<Caballos_Victor> listaCaballos;
    protected int carrerasGanadas;
    //Constructores
    public Cuadras_Victor(){
        this.CIF = "12345";
        this.nombre = "Cuadra San Jose";
        this.lugarResidencia = "Almeria";
        this.listaCaballos = new ArrayList<Caballos_Victor>();
        this.carrerasGanadas = 0;
    }
    public Cuadras_Victor(String CIF, String nombre, String lugarResidencia, ArrayList<Caballos_Victor> listaCaballos) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.lugarResidencia = lugarResidencia;
        this.listaCaballos = listaCaballos;
        this.carrerasGanadas = 0;
    }
    public Cuadras_Victor(Cuadras_Victor cuadra){
        this.CIF = cuadra.CIF;
        this.listaCaballos = cuadra.listaCaballos;
        this.lugarResidencia = cuadra.lugarResidencia;
        this.nombre = cuadra.nombre;
        this.carrerasGanadas = cuadra.carrerasGanadas;
    }
    /*
     * Getter y Setter de la lista de los caballos para modificarla.
     */
    public ArrayList<Caballos_Victor> getListaCaballos() {
        return listaCaballos;
    }
    public void setListaCaballos(ArrayList<Caballos_Victor> listaCaballos) {
        this.listaCaballos = listaCaballos;
    }
    /*
     * Metodos
     */
    public void agregarCaballo(Caballos_Victor caballo){
        this.listaCaballos.add(caballo);
    }
    public void eliminarCaballo(int pos){
        this.listaCaballos.remove(pos);
    }
    public void sumarCarreraGanada(){
        this.carrerasGanadas++;
    }
    @Override
    public String toString() {
        return "Cuadra: " + "\nCIF=" + CIF + "\nNombre=" + nombre + "\nLugar de residencia=" + lugarResidencia + "\nLista de caballos: (" + listaCaballos + ")";
    }
    
}
