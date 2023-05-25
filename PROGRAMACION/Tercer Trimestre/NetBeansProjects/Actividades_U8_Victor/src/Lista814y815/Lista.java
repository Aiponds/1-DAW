package Lista814y815;

import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class Lista {
    protected Integer[] tabla;

    public Lista() {
        this.tabla = new Integer[0];
    }
    public Integer[] getTabla() {
        return tabla;
    }
    public void setTabla(Integer[] tabla) {
        this.tabla = tabla;
    }
    public void insertarPrincipio(Integer nuevo){
        /*
         * Coge el array 'tabla', crea una copia y desplaza todos sus valores 1 posicion hacia la derecha, dejando la posición 0 libre. 
         * Introducimos el nuevo valor en la pos 0.
         */
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
        System.arraycopy(this.tabla, 0, this.tabla, 1, this.tabla.length-1);
        this.tabla[0] = nuevo;
    }
    public void insertarFinal(Integer nuevo){
        /*
         * Para el array 'tabla' incrementamos el tamaño en 1.
         * Ponemos el nuevo valor en la última posición.
         */
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
        this.tabla[this.tabla.length-1] = nuevo;
    }
    public void insertarFinal(Lista otraLista){
        /*
         * Crea un nuevo array con la suma de los dos tamaños.
         * Copia el segundo array al final del primer array.
         */
        int tamInicial = this.tabla.length;
        this.tabla = Arrays.copyOf(this.tabla, (tamInicial+otraLista.tabla.length));
        System.arraycopy(otraLista.tabla, 0, this.tabla, tamInicial, otraLista.tabla.length);
    }
    public void insertar(int posicion, Integer nuevo){
        /*
         * Incrementa el tamaño del array en 1.
         * Copia el array desde la posicion 1 hacia la derecha todo, dejando un hueco en 'posicion' y metiendo el valor 'nuevo' ahí.
         */
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length+1);
        System.arraycopy(this.tabla, posicion, this.tabla, posicion+1, this.tabla.length - posicion - 1);
        this.tabla[posicion] = nuevo;
    }
    public Integer eliminar(int indice){
        // Se elimina el elemento correspondiente a indice y se devuelve
        Integer eliminado = null;
        if (indice >=0 && indice < this.tabla.length) {
            eliminado = this.tabla[indice];
        }
        for (int i = indice + 1; i < this.tabla.length; i++){
            this.tabla[i - 1] = this.tabla[i];
        }
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length -1);
        return eliminado;
    }
    public Integer get(int indice){
        /*
         * Buscamos el valor asociado a la 'indice' posición.
         * Se comprueba si es valida la busqueda y se devuelve.
         */
        Integer resultado = null;
        if (indice >=0 && indice < this.tabla.length) { // índice válido
            resultado = this.tabla[indice];
        }
        return resultado;
    }
    public int buscar(Integer claveBusqueda){
        int indice=-1;
        for (int i = 0; i < this.tabla.length && indice == -1; i++) {
            if(this.tabla[i].equals(claveBusqueda)){
                indice = i;
            }
        }
        return indice;
    }
    public int numeroElementos(){
        return this.tabla.length;
    }
    @Override
    public String toString(){
        return (Arrays.toString(this.tabla));
    }
    public boolean equals(Lista otraLista){
        return Arrays.equals(this.tabla, otraLista.tabla);
    }
}
