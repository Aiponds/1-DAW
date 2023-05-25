package Ejercicio8_1;
import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        int hora, segundos;
        Hora r = new Hora(11,30);
        System.out.println(r);
        for (int i = 0; i < 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba una hora: ");
        hora = new Scanner(System.in).nextInt();
        r.setHora(hora);
        System.out.println(r);
        //probamos la clase horaexacta
        HoraExacta hr = new HoraExacta(11,15,23);
        System.out.println(hr);
        for (int i = 0; i < 61; i++) {
            hr.inc();
        }
        System.out.println(hr);
        System.out.println("Escriba los segundos: ");
        segundos = new Scanner(System.in).nextInt();
        hr.setSegundo(segundos);
        System.out.println(hr);
    }
}
