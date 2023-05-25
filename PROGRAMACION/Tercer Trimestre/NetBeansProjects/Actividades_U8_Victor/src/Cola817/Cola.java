package Cola817;

import Lista814y815.Lista;
import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class Cola extends Lista {
    public Cola(){
        super();
    }
    public void encolar(Integer nuevo){
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
        this.tabla[this.tabla.length-1] = nuevo;
    }
    public void desencolar(){
        if (this.tabla.length > 0) {
            this.tabla = Arrays.copyOfRange(tabla, 1, this.tabla.length);
        }
    }
}
