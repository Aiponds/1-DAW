/**
 *
 * @author Victor
 */
public class PruebaWrappers_Victor {
    public static void main(String[] args) {
        //Investiga los metodos .parseInt() y .valueOf() en una de las clases envolventes. 
        //Desarrolla un código Java donde implementes un ejemplo de uso sencillo y claro.
        System.out.println("Creo una cadena con numeros enteros.");
        String cadNumerica = "3210";
        //Utilizo el método parseInt() para guardarlo en una variable int.
        int num = Integer.parseInt(cadNumerica);
        System.out.println("Cadena numerica pasada a int: "+num);
        //Utilizo el método valueOf() para guardarlo en una variable String.
        String cad = String.valueOf(num);
        System.out.println("Variable num pasada a String: "+cad);
    }
}
