package Victor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class PruebaAnimales {
    static ArrayList<Gatos> listaGatos = new ArrayList<Gatos>();
    public static void main(String[] args) {
        gatosCreados();
        usarMenu();
    }
    private static void gatosCreados(){
        Gatos garfield = new Gatos(Sexo.macho, "Persa");
        listaGatos.add(garfield);
        Gatos luca = new Gatos(Sexo.macho, "De calle");
        listaGatos.add(luca);
        Gatos daisy = new Gatos(Sexo.hembra, "Egipcio");
        listaGatos.add(daisy);
        Gatos lautaro = new Gatos(Sexo.hembra, "Maltés");
        listaGatos.add(lautaro);
        Gatos michi = new Gatos(Sexo.macho, "Persa");
        listaGatos.add(michi);
        Gatos grian = new Gatos(Sexo.macho, "British");
        listaGatos.add(grian);
    }
    private static void usarMenu() {
        char opcion,c;
        int pos,pos2;
        boolean salir=false;
        String raza;
        Sexo sexo;
        do {
            opcionesMenu();
            System.out.print("Opcion: ");
            opcion = new Scanner(System.in).next().charAt(0);
            switch (opcion) {
                case '0':
                    salir=confirmarSalida();
                    break;
                case '1': //visualizar gatos
                    System.out.println("Lista de todos los gatos: \n"+listaGatos.toString());
                    break;
                case '2': //añadir gato
                    Gatos gato = gatoUsuario();
                    listaGatos.add(gato);
                    break;
                case '3': //eliminar gato
                    try {
                        System.out.println("Dime la posicion de la cual quieras eliminar un gato (0-"+(listaGatos.size()-1)+"): ");
                        pos = new Scanner(System.in).nextInt();
                        listaGatos.remove(pos);
                    } catch (InputMismatchException e) {
                        System.out.println("Caracter insertado erróneo.");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Fuera del rango establecido.");
                    }
                    break;
                case '4': //modificar gato
                    try {
                        System.out.println("Dime la posicion de la cual quieras eliminar un gato (0-"+(listaGatos.size()-1)+"): ");
                        pos = new Scanner(System.in).nextInt();
                        System.out.print("Introduce la raza: ");
                        raza = new Scanner(System.in).nextLine();
                        System.out.print("Introduce el sexo (0=macho, 1=hembra, 2=hemafrodita): ");
                        c = new Scanner(System.in).next().charAt(0);
                        if(c=='1'){
                            sexo = Sexo.macho;
                        } else if(c=='2'){
                            sexo = Sexo.hembra;
                        } else if(c=='3'){
                            sexo = Sexo.hermafrodita;
                        } else {
                            sexo = Sexo.macho;
                        }
                        Gatos gato2 = new Gatos(sexo,raza);
                        listaGatos.set(pos, gato2);
                    } catch (InputMismatchException e) {
                        System.out.println("Caracter inválido");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Fuera del rango establecido.");
                    }
                    
                    break;
                case '5': //consultar posicion
                    try {
                        System.out.println("Dime la posicion de la cual quieras consultar el gato (0-"+(listaGatos.size()-1)+"): ");
                        pos = new Scanner(System.in).nextInt();
                        System.out.println(listaGatos.get(pos).toString());;
                    } catch (InputMismatchException e) {
                        System.out.println("Caracter insertado erróneo.");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Fuera del rango establecido.");
                    }
                    break;
                case '6': //que juegan dos gatos
                    try {
                        System.out.println("Dime la posicion del primer gato (0-"+(listaGatos.size()-1)+"): ");
                        pos = new Scanner(System.in).nextInt();
                        System.out.println("Dime la posicion del segundo gato (0-"+(listaGatos.size()-1)+"): ");
                        pos2 = new Scanner(System.in).nextInt();
                        listaGatos.get(pos).juegaCon(listaGatos.get(pos2));
                    } catch (InputMismatchException e) {
                        System.out.println("Caracter insertado erróneo.");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Fuera del rango establecido.");
                    }
                    break;
                case '7': //que juegan todos los gatos
                    for (int i = 0; i < listaGatos.size(); i++) {
                        for (int j = i+1; j < listaGatos.size(); j++) {
                            listaGatos.get(i).juegaCon(listaGatos.get(j));
                        }
                    } 
                    break;
                default:
                    System.out.println("No válido.");
            }
        }while(salir!=true);
    }
    private static void opcionesMenu(){
        System.out.println("\nBienvenido al menú de los gatos:");
        System.out.println("0.Salir");
        System.out.println("1.Visualizar todos los gatos");
        System.out.println("2.Insertar gato");
        System.out.println("3.Eliminar un gato");
        System.out.println("4.Modificar datos de 1 gato");
        System.out.println("5.Consultar posicion determinada");
        System.out.println("6.Dos gatos juegan");
        System.out.println("7.Todos los gatos juegan con todos");
    }
    private static boolean confirmarSalida() {
        boolean salir;
        char c;
        System.out.println("Seguro que quieres salir? s=salir");
        c = new Scanner(System.in).next().charAt(0);
        c=Character.toLowerCase(c);
        salir = c=='s';
        return salir;
    }
    public static Gatos gatoUsuario(){
        String raza;
        Sexo sexo;
        char c;
        System.out.println("\nIntroduce los datos del gato.");
        try {
            System.out.print("Introduce la raza: ");
            raza = new Scanner(System.in).nextLine();
            System.out.print("Introduce el sexo (0=macho, 1=hembra, 2=hemafrodita): ");
            c = new Scanner(System.in).next().charAt(0);
            if(c=='1'){
                sexo = Sexo.macho;
            } else if(c=='2'){
                sexo = Sexo.hembra;
            } else if(c=='3'){
                sexo = Sexo.hermafrodita;
            } else {
                sexo = Sexo.macho;
            }
            Gatos gato = new Gatos(sexo,raza);
            System.out.println("Se creado el gato.");
            return gato;
        } catch (InputMismatchException e) {
            System.out.println("Fallo en la inserción (CARACTER NO VALIDO)");
            System.out.println("Se ha creado un gato por defecto.");
            Gatos gato = new Gatos();
            return gato;
        }
    }
}
