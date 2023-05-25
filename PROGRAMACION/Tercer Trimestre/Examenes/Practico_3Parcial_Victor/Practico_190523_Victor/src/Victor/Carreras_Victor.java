package Victor;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Carreras_Victor {
    //Atributos
    private String caballoGanador, lugar, fecha;
    private ArrayList<Caballos_Victor> caballosParticipantes;
    //Constructores
    public Carreras_Victor(){
        this.caballoGanador = "Juan";
        this.lugar = "Jerez";
        this.fecha = "19/05/23";
        this.caballosParticipantes = new ArrayList<Caballos_Victor>();
    }
    public Carreras_Victor(String caballoGanador, String lugar, String fecha, ArrayList<Caballos_Victor> caballosParticipantes) {
        this.caballoGanador = caballoGanador;
        this.lugar = lugar;
        this.fecha = fecha;
        this.caballosParticipantes = caballosParticipantes;
    }
    public Carreras_Victor(Carreras_Victor carrera){
        this.caballoGanador = carrera.caballoGanador;
        this.lugar = carrera.lugar;
        this.fecha = carrera.fecha;
        this.caballosParticipantes = carrera.caballosParticipantes;
    }
    /*
     * Metodos
     */
    @Override
    public String toString() {
        return "Carrera: " + "\nCaballo Ganador=" + caballoGanador + "\nLugar=" + lugar + "\nFecha=" + fecha + "\nLista de caballos participantes: (" + caballosParticipantes + ")";
    }
    public String getCaballoGanador() {
        return caballoGanador;
    }
}
