package Victor;

/**
 *
 * @author Victor
 */
public class Dientes {
    protected String tipo,estado;

    public Dientes() {
        this.tipo = "Colmillo";
        this.estado = "Bueno";
    }
    public Dientes(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }
    public boolean estaSano(){
        return this.estado=="Bueno";
    }
}
