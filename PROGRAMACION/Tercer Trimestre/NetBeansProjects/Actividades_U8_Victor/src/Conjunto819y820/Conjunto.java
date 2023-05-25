package Conjunto819y820;

import Lista814y815.Lista;
import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class Conjunto extends Lista {
    public Conjunto() {
        super();
    }
    @Override
    public void insertarPrincipio(Integer nuevo){
        /*
         * Coge el array 'tabla', crea una copia y desplaza todos sus valores 1 posicion hacia la derecha, dejando la posición 0 libre. 
         * Introducimos el nuevo valor en la pos 0.
         */
        if (comprobar(nuevo)) {
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
            System.arraycopy(this.tabla, 0, this.tabla, 1, this.tabla.length-1);
            this.tabla[0] = nuevo;
        } else {
            System.out.println("No se ha podido realizar la inserción.");
        }
    }
    @Override
    public void insertarFinal(Integer nuevo){
        /*
         * Para el array 'tabla' incrementamos el tamaño en 1.
         * Ponemos el nuevo valor en la última posición.
         */
        if (comprobar(nuevo)) {
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
            this.tabla[this.tabla.length-1] = nuevo;
        } else {
            System.out.println("No se ha podido realizar la inserción.");
        }
    }
    @Override
    public void insertar(int posicion, Integer nuevo){
        /*
         * Incrementa el tamaño del array en 1.
         * Copia el array desde la posicion 1 hacia la derecha todo, dejando un hueco en 'posicion' y metiendo el valor 'nuevo' ahí.
         */
        if (comprobar(nuevo)) {
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
            System.arraycopy(this.tabla, posicion, this.tabla, posicion+1, this.tabla.length - posicion - 1);
            this.tabla[posicion] = nuevo;
        } else {
             System.out.println("No se ha podido realizar la inserción.");
        }    
    }
    public boolean comprobar(Integer busqueda){
        int indice=-1;
        for (int i = 0; i < this.tabla.length && indice == -1; i++) {
            if(this.tabla[i].equals(busqueda)){
                indice = i;
            }
        }
        return indice!=-1;
    }
    @Override
    public boolean equals(Lista otraLista){
        return Arrays.equals(this.tabla, otraLista.getTabla());
    }
}
