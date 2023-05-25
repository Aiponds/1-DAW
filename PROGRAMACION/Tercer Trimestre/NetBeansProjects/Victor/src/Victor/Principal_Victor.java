package Victor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal_Victor {
    /*
     * ARREGLADO:
     * 1. Comprobación del bisiesto fallaba, ver en Calendario linea 82.
     * 2. Comprobación de fecha válida, ver en CalendarioExacto linea 58.
     * 3. Meter metodo anyoBisiesto() en Calendario, en vez de CalendarioExacto.
     * Arreglar implementacion iguales() en la clase hija, debe ser super.
     */
    static final String ROJO="\u001B[31m";
    static final String VERDE="\u001B[32m";
    static final String AMARILLO="\u001B[33m";
    static final String AZUL="\u001B[34m";
    static final String RESET="\u001B[0m";
    public static void main(String[] args) {
        // TODO code application logic here
        usarMenu();
    }
    public static void opcionesMenu(){
        System.out.println(AZUL+"#############################################");
        System.out.println(AMARILLO+"# 1.Mostrar fechas           2. Crear fecha #");
        System.out.println(AMARILLO+"# 3.Incrementar dia       4.Incrementar mes #");
        System.out.println(AMARILLO+"# 5.Incrementar año      6.Incrementar hora #");
        System.out.println(AMARILLO+"# 7.Incrementar minuto 8.Comprobar bisiesto #");
        System.out.println(AMARILLO+"# 9.Comparar 2 fechas               "+VERDE+"0.Salir "+AMARILLO+"#");
        System.out.println(AZUL+"#############################################"+RESET);
    }
    public static void usarMenu() {
        //Variables
        ArrayList<CalendarioExacto> listaFechas = new ArrayList<CalendarioExacto>();
        char opcion;
        int pos,pos2;
        boolean salir=false;
        //Desarrollo
        System.out.println(VERDE+"Antes del programa, creo dos fechas...");
        CalendarioExacto fechaInicio = new CalendarioExacto(2000,(byte)3,(byte)10,(byte)11,(byte)59);
        CalendarioExacto fechaHoy = new CalendarioExacto();
        //Las agregamos a la lista.
        listaFechas.add(fechaHoy);
        listaFechas.add(fechaInicio);
        System.out.println("Muestro las fechas...");
        System.out.println(listaFechas.toString());
        System.out.println(VERDE+"Antes del programa, modifico una fecha...");
        listaFechas.get(1).setAnyo(2077);
        System.out.println("Muestro las fechas...");
        System.out.println(listaFechas.toString());
        do {
            opcionesMenu();
            System.out.print("Opcion: ");
            opcion = new Scanner(System.in).next().charAt(0);
            switch (opcion) {
                case '0':
                    salir=confirmarSalida();
                    break;
                case '1': //Mostrar fechas
                    System.out.println(AMARILLO+"LA LISTA DE FECHAS\n"+RESET+listaFechas.toString());
                    break;
                case '2': //Crear fecha
                    CalendarioExacto fecha = fechaUsuario();
                    listaFechas.add(fecha);
                    
                    break;
                case '3': //Incrementar dia
                    System.out.print("Introduce la posicion de la fecha que quieras modificar el dia: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        listaFechas.get(pos).incrementarDia();
                        System.out.println(VERDE+"Se ha incrementado el dia correctamente...");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '4': //Incrementar mes
                    System.out.print("Introduce la posicion de la fecha que quieras modificar el mes: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        listaFechas.get(pos).incrementarMes();
                        System.out.println(VERDE+"Se ha incrementado el mes correctamente...");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '5': //Incrementar año
                    System.out.print("Introduce la posicion de la fecha que quieras modificar el año: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        listaFechas.get(pos).incrementarAnyo(1);
                        System.out.println(VERDE+"Se ha incrementado el año correctamente...");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '6': //Incrementar hora
                    System.out.print("Introduce la posicion de la fecha que quieras modificar la hora: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        listaFechas.get(pos).incrementarHora();
                        System.out.println(VERDE+"Se ha incrementado la hora correctamente...");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '7': //Incrementar minuto
                    System.out.print("Introduce la posicion de la fecha que quieras modificar el minuto: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        listaFechas.get(pos).incrementarMinuto();
                        System.out.println(VERDE+"Se ha incrementado el minuto correctamente...");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '8': //Comprobar año bisiesto
                    System.out.print("Introduce la posicion de la fecha que quieras comprobar si es año bisiesto: ");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        System.out.println("Es año bisiesto?: "+listaFechas.get(pos).anyoBisiesto());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                case '9': //Comparar dos fechas y horas.
                    System.out.print("Introduce la posicion de la primera fecha que quieras comparar:");
                    try {
                        pos = new Scanner(System.in).nextInt();
                        System.out.print("Introduce la posicion de la segunda fecha que quieras comparar:");
                        pos2 = new Scanner(System.in).nextInt();
                        System.out.println("Es la "+listaFechas.get(pos).toString()+" igual a "+listaFechas.get(pos2).toString()+ " ?: "+listaFechas.get(pos).iguales(listaFechas.get(pos2)));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ROJO+"Posición fuera del rango."+RESET);
                    } catch (InputMismatchException e) {
                        System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
                    }
                    break;
                default:
                    System.out.println(ROJO+"No válido."+RESET);
            }
        }while(salir!=true);
        System.out.println("Has salido del programa...");
    }
    public static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("Seguro que quieres salir? s=salir");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
    public static void fechasIguales(CalendarioExacto fecha1, CalendarioExacto fecha2){
        if(fecha1.iguales(fecha2)){
            System.out.println(VERDE+"Las fechas "+ fecha1.toString()+" y "+fecha2.toString()+" son IGUALES."+RESET);
        } else {
            System.out.println(ROJO+"Las fechas "+ fecha1.toString()+" y "+fecha2.toString()+" son DISTINTAS."+RESET);
        }
    }
    public static CalendarioExacto fechaUsuario(){
        byte dia,mes,hora,minuto;
        int anyo;
        System.out.println("\nIntroduce una fecha y hora.\nSi te pasas de los rangos de una fecha y hora normal, la ajustaré a la siguiente posible fecha y hora.");
        try {
            System.out.print("Introduce un dia: ");
            dia = new Scanner(System.in).nextByte();
            System.out.print("Introduce un mes: ");
            mes = new Scanner(System.in).nextByte();
            System.out.print("Introduce un año: ");
            anyo = new Scanner(System.in).nextInt();
            System.out.print("Introduce una hora: ");
            hora = new Scanner(System.in).nextByte();
            System.out.print("Introduce un minuto: ");
            minuto = new Scanner(System.in).nextByte();
            CalendarioExacto fecha = new CalendarioExacto(anyo,mes,dia,hora,minuto);
            System.out.println(VERDE+"Se creado la fecha correctamente...");
            return fecha;
        } catch (InputMismatchException e) {
            System.out.println(ROJO+"Fallo en la inserción (CARACTER NO VALIDO)"+RESET);
            System.out.println("Se ha creado una fecha por defecto.");
            CalendarioExacto fecha = new CalendarioExacto();
            return fecha;
        }
    }
}
