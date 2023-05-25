package Pila816;

import Lista814y815.Lista;
import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class Pila extends Lista {
    public Pila() {
        super();
    }
    public void apilar(Integer nuevo){
       this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
       this.tabla[this.tabla.length-1] = nuevo;
    }
    public void desapilar() {
        if (this.tabla.length > 0) {
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
        }
    }

    
}
