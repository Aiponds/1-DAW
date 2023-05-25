package Victor;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal_Victor {
    static final String ROJO="\u001B[31m";
    static final String VERDE="\u001B[32m";
    static final String RESET="\u001B[0m";
    public static void main(String[] args) {
        // TODO code application logic here
        accionesFechas();
    }
    public static void accionesFechas(){
        byte dia,mes;
        int anyo;
        //Desarrollo
        System.out.println("Creamos un calendario con la fecha de hoy dia del exámen.");
        Calendario fechaHoy = new Calendario();
        System.out.println(fechaHoy.mostrar());
        
        System.out.println("\nIncrementamos un dia a la fecha y mostramos los cambios...");
        fechaHoy.incrementarDia();
        System.out.println(fechaHoy.mostrar());
        
        System.out.println("\nIncrementamos un mes a la fecha y mostramos los cambios...");
        fechaHoy.incrementarMes();
        System.out.println(fechaHoy.mostrar());
        
        //Pedimos una fecha al usuario por teclado.
        Calendario fechaOtra=fechaUsuario();
        System.out.println(fechaOtra.mostrar());
        
        System.out.println("\nIncrementamos un dia a tu fecha y mostramos los cambios...");
        fechaOtra.incrementarDia();
        System.out.println(fechaOtra.mostrar());
        
        System.out.println("\nComprobamos si las anteriores dos fechas son iguales.");
        fechasIguales(fechaHoy, fechaOtra);
    }
    public static void fechasIguales(Calendario fecha1, Calendario fecha2){
        if(fecha1.iguales(fecha2)){
            System.out.println(VERDE+"Las fechas "+ fecha1.mostrar()+" y "+fecha2.mostrar()+" son IGUALES."+RESET);
        } else {
            System.out.println(ROJO+"Las fechas "+ fecha1.mostrar()+" y "+fecha2.mostrar()+" son DISTINTAS."+RESET);
        }
    }
    public static Calendario fechaUsuario(){
        byte dia,mes;
        int anyo;
        System.out.println("\nCreamos otro calendario con otra fecha distinta.\nSi te pasas de los rangos de una fecha normal, la ajustaré a la siguiente posible fecha.");
        System.out.print("Introduce un dia: ");
        dia = new Scanner(System.in).nextByte();
        System.out.print("Introduce un mes: ");
        mes = new Scanner(System.in).nextByte();
        System.out.print("Introduce un año: ");
        anyo = new Scanner(System.in).nextInt();
        Calendario fecha = new Calendario(anyo,mes,dia);
        return fecha;
    }
}
