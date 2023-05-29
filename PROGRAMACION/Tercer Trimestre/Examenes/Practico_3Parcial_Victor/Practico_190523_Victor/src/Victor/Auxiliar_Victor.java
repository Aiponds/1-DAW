package Victor;

/**
 *
 * @author Victor
 */
public class Auxiliar_Victor{
    public static void main(String[] args) {
        
    }
    static ArrayList<Clase> miArrayList = new ArrayList<Clase>();
    static Scanner teclado = new Scanner(System.in);
    public static void insertarXCantidadEnArray(){
        int cantidadObjetosACrear = 5;
        String dato1, dato2;
        for (int i = 0; i < cantidadObjetosACrear; i++) {
            System.out.println("Inserta dato1");
            dato1=teclado.nextLine();
            System.out.println("Inserta dato2");
            dato2=teclado.nextLine();
            miArrayList.add(new ConstructorClase(dato1,dato2));
        }
    }
}
