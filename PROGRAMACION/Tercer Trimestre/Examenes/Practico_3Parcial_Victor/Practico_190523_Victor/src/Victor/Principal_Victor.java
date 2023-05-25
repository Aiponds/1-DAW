package Victor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal_Victor {
    static final String ROJO = "\u001B[31m";
    static final String VERDE = "\u001B[32m";
    static final String AZUL = "\u001B[36m";
    static final String AMARILLO = "\u001B[33m";
    static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        usarMenu();
    }
    public static void usarMenu() {
        char opcion;
        boolean salir=false;
        int pos, pos2;
        ArrayList<Carreras_Victor> listaCarreras = new ArrayList<Carreras_Victor>();
        ArrayList<Cuadras_Victor> listaCuadras = new ArrayList<Cuadras_Victor>();
        do {
            opcionesMenu();
            System.out.print("Opcion: ");
            opcion = pedirLetra();
            switch (opcion) {
                case '0': //Salir
                    salir=confirmarSalida();
                    break;
                case '1': //Alta de cuadra
                    listaCuadras.add(insertarCuadra());
                    break;
                case '2': //Alta de caballo en una cuadra
                    if(!listaCuadras.isEmpty()){
                        System.out.println("Indica a que cuadra quieres dar de alta un caballo (0-"+(listaCuadras.size()-1)+"):");
                        pos = pedirNum();
                        try {
                            listaCuadras.get(pos).agregarCaballo(insertarCaballo());
                            System.out.println(VERDE+"Caballo añadido con éxito.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO+"Posición fuera del rango permitido."+RESET);
                        }
                        System.out.println(listaCuadras.toString());
                    }else {
                        System.out.println(ROJO+"\nNo hay cuadras creadas aún."+RESET);
                    }
                    break;
                case '3': //Alta de carrera
                    listaCarreras.add(insertarCarrera());
                    break;
                case '4': //Listado de carreras y ganadores
                    if(!listaCarreras.isEmpty()){
                        System.out.println(AZUL+"LISTADO DE CARRERAS Y SUS GANADORES: "+RESET+listaCarreras.toString());
                    }else {
                        System.out.println(ROJO+"\nNo hay carreras creadas aún."+RESET);
                    }
                    break;
                case '5': //Consulta de cuadra con mas carreras ganadas.
                    cuadraConMasVictorias(listaCarreras, listaCuadras);
                    System.out.println("En construcción, cuenta las victorias pero falta por mostrar el mayor por falta de tiempo.");
                    break;
                case '6': //Eliminar cuadra
                    if (!listaCuadras.isEmpty()) {
                        System.out.println("Indica que cuadra quieres eliminar (0-"+(listaCuadras.size()-1)+"):");
                        pos = pedirNum();
                        try {
                            listaCuadras.remove(pos);
                            System.out.println(VERDE+"Cuadra eliminada con éxito.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO+"Posición fuera del rango permitido."+RESET);
                        }
                    } else {
                        System.out.println(ROJO+"\nNo hay cuadras creadas aún."+RESET);
                    }
                    break;
                case '7': //Eliminar caballo
                    if(!listaCuadras.isEmpty()){
                        System.out.println("Indica a que cuadra le quieres eliminar un caballo (0-"+(listaCuadras.size()-1)+"):");
                        pos = pedirNum();
                        try {
                            if(!listaCuadras.get(pos).getListaCaballos().isEmpty()){
                                System.out.println("Indica que caballo quieres borrar (0-"+(listaCuadras.get(pos).getListaCaballos().size()-1)+"):");
                                pos2 = pedirNum();
                                listaCuadras.get(pos).eliminarCaballo(pos2);
                                System.out.println(VERDE+"Caballo eliminado con éxito.");
                            }else {
                                System.out.println(ROJO+"\nNo hay caballos en la cuadra."+RESET);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO+"Posición fuera del rango permitido."+RESET);
                        }
                        System.out.println(listaCuadras.toString());
                    }else {
                        System.out.println(ROJO+"\nNo hay cuadras creadas aún."+RESET);
                    }
                    break;
                case '8': //Eliminar carrera
                    if (!listaCarreras.isEmpty()) {
                        System.out.println("Indica que carrera quieres eliminar (0-"+(listaCarreras.size()-1)+"):");
                        pos = pedirNum();
                        try {
                            listaCarreras.remove(pos);
                            System.out.println(VERDE+"Carrera eliminada con éxito.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(ROJO+"Posición fuera del rango permitido."+RESET);
                        }
                    } else {
                        System.out.println(ROJO+"\nNo hay carreras creadas aún."+RESET);
                    }
                    break;
                default:
                    System.out.println(ROJO+"\nOpción no válida."+RESET);
            }
        }while(salir!=true);
    }
    public static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("\nSeguro que quieres salir? s=salir");
        c = pedirLetra();
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
    public static char pedirLetra() {
        return new Scanner(System.in).next().charAt(0);
    }
    public static String pedirCadena(){
        return new Scanner(System.in).nextLine();
    }
    public static int pedirNum() {
        int num;
        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println(ROJO+"\nError! Introduce un número entero."+RESET);
            return pedirNum();
        }
    }
    public static void opcionesMenu(){
        System.out.println(AZUL+"###########################################################"+RESET);
        System.out.println(AMARILLO+"#        Bienvenido al menú de Carreras y Caballos        #");
        System.out.println(AMARILLO+"# ------------------------------------------------------- #");
        System.out.println(AMARILLO+"# 1.Alta de cuadra        2.Alta de caballo en una cuadra #");
        System.out.println(AMARILLO+"# 3.Alta de carrera     4.Listado de carreras y ganadores #");
        System.out.println(AMARILLO+"# 5.Consulta de cuadra con más carreras ganadas           #");
        System.out.println(AMARILLO+"# 6.Eliminar cuadra 7.Eliminar caballo 8.Eliminar carrera #");
        System.out.println(AMARILLO+"#                       0.Salir                           #");
        System.out.println(AZUL+"###########################################################"+RESET);
    }
    public static Cuadras_Victor insertarCuadra(){
        String CIF,nombre, lugarResidencia;
        int cantCaballos;
        ArrayList<Caballos_Victor> listaCaballos = new ArrayList<Caballos_Victor>();
        //String CIF, String nombre, String lugarResidencia, ArrayList<Caballos_Victor> listaCaballos
        System.out.println("Voy a proceder a dar de alta a una cuadra.");
        System.out.println("Introduce el CIF de la cuadra: ");
        CIF = pedirCadena();
        System.out.println("Introduce el nombre de la cuadra: ");
        nombre = pedirCadena();
        System.out.println("Introduce el lugar de residencia de la cuadra: ");
        lugarResidencia = pedirCadena();
        System.out.println("Cuantos caballos tiene tu cuadra?: ");
        cantCaballos = pedirNum();
        for (int i = 0; i < cantCaballos; i++) {
            System.out.println("Caballo "+(i+1));
            listaCaballos.add(insertarCaballo());
        }
        return (new Cuadras_Victor(CIF,nombre,lugarResidencia,listaCaballos));
    }
    public static Caballos_Victor insertarCaballo(){
        String nombreCaballo, nombreJinete;
        System.out.println("Introduce el nombre del caballo: ");
        nombreCaballo = pedirCadena();
        System.out.println("Introduce el nombre del jinete: ");
        nombreJinete = pedirCadena();
        return (new Caballos_Victor(nombreCaballo,nombreJinete));
    }
    public static Carreras_Victor insertarCarrera(){
        String caballoGanador,lugar,fecha;
        int cantCaballos;
        boolean ganadorValido=true;
        ArrayList<Caballos_Victor> caballosParticipantes = new ArrayList<Caballos_Victor>();
        System.out.println("Voy a proceder a dar de alta a una carrera.");
        System.out.println("Introduce cuantos caballos participan: ");
        cantCaballos = pedirNum();
        for (int i = 0; i < cantCaballos; i++) {
            System.out.println("Caballo "+(i+1));
            caballosParticipantes.add(insertarCaballo());
        }
        System.out.println("Introduce el lugar: ");
        lugar = pedirCadena();
        System.out.println("Introduce la fecha: ");
        fecha = pedirCadena();
        System.out.println("Introduce el caballo ganador (Tiene que estar entre los caballos participantes): ");
        caballoGanador = pedirCadena();
        return (new Carreras_Victor(caballoGanador,lugar,fecha,caballosParticipantes));
    }
    public static void cuadraConMasVictorias(ArrayList<Carreras_Victor> listaCarreras, ArrayList<Cuadras_Victor> listaCuadras){
        //Voy a buscar en las cuadras los nombres de los caballos ganadores y si lo encuentra le suma 1 victoria. Luego muestro el que mas victorias acumule.
        String caballoGanador, caballo;
        for (int i = 0; i < listaCarreras.size(); i++) {
            caballoGanador = listaCarreras.get(i).getCaballoGanador();
            caballo = listaCuadras.get(i).getListaCaballos().get(i).getNombreCaballo();
            if(caballoGanador.equals(caballo)){
                listaCuadras.get(i).sumarCarreraGanada();
            }
        }
    }
}
