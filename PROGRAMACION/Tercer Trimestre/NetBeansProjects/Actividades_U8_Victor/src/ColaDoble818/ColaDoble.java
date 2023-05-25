package ColaDoble818;

import Cola817.Cola;
import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class ColaDoble extends Cola {
    public ColaDoble() {
        super();
    }
    public void encolarPrincipio(Integer nuevo){
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
        System.arraycopy(this.tabla, 0, this.tabla, 1, this.tabla.length-1);
        this.tabla[0] = nuevo;
    }
    public Integer desencolarFinal(){
        return super.eliminar(this.tabla.length-1);
    }
}
