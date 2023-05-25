import java.util.*;
public class Practico_9032023_Victor {
	static String[][] agenda = new String[300][2]; //Declaramos la agenda estatica.
	public static final String ANSI_CYAN="\u001B[36m"; //constante del color cyan.
	public static final String ANSI_RED="\u001B[31m"; //constante de color rojo.
	public static final String ANSI_YELLOW="\u001B[33m"; //constante de color amarillo.
	public static final String ANSI_RESET="\u001B[0m"; //constante RESET
	public static void main(String[]args) { //Victor Stala
		/*Implementar una agenda de contactos que guarde NOMBRE, NUMERO. Permitir visualizar agenda, buscar un nombre, insertar un nuevo contacto, modificar
		* el contacto o eliminarlo. La agenda tiene de tamaño 300 y está ordenada alfabeticamente.
		*/
		//Desarrollo
		//Entrar en la agenda.
		agendaContactos();
		System.out.println(ANSI_RESET);
	}
	public static void agendaContactos() {
		//Variables
		boolean salir=false;
		char opcion;
		//Desarrollo
		//Rellenar la agenda con datos vacios.
		rellenarAgenda();
		//Datos para que no esté completamente vacia de inicio y pueda realizar pruebas rapidas sobre la agenda.
		agenda[0][0]="Victor";
		agenda[0][1]="657844055";
		agenda[1][0]="Pablo";
		agenda[1][1]="123456789";
		//Iniciar un menú para las opciones VISUALIZAR, BUSCAR, INSERTAR, MODIFICAR y BORRAR y que sea iterativo.
		do{
			textoAgenda();
			opcion=new Scanner(System.in).next().charAt(0);
			System.out.println();
			switch(opcion) {
				case '1' : {
					visualizarAgenda();
				}
				break;
				case '2' : {
					buscarNombreAgenda();
				}
				break;
				case '3' : {
					insertarContactosAgenda();
				}
				break;
				case '4' : {
					editarContactoAgenda();
				}
				break;
				case '5' : {
					eliminarContactoAgenda();
				}
				break;
				case '6' : {
					salir=confirmarSalida(salir);
				}
				break;
				default : {
					System.out.println("Opcion no valida. Vuelve a intentarlo.");
				}
			}
		}while(salir!=true);
		System.out.println("Has salido de la agenda telefonica. Adios.");
	}
	public static void textoAgenda() {
		System.out.println("\n\n"+ANSI_CYAN);
		System.out.println("###############################");
		System.out.println("#     Agenda de contactos     #");
		System.out.println("-------------------------------");
		System.out.println("#  1.VISUALIZAR  2.BUSCAR     #");
		System.out.println("#  3.INSERTAR    4.MODIFICAR  #");
		System.out.println("#  5.BORRAR      6.SALIR      #");
		System.out.println("###############################");
		System.out.print("OPCION: ");
	}
	public static void rellenarAgenda() {
		//autorelleno los campos del array como "null" para luego filtrar los desocupados y poder visualizar/introducir datos mejor.
		for(int i=0;i<agenda.length;i++) {
			for(int j=0;j<agenda[i].length;j++) {
				agenda[i][j]="null";
			}
		}
	}
	public static void visualizarAgenda() {
		//Mostrar en columna descendiente los contactos.
		System.out.println(ANSI_YELLOW+"AGENDA TELEFONICA");
		System.out.println("-------------------------");
		for(int i=0;i<agenda.length;i++) {
			if(agenda[i][0]!="null") {
					System.out.println();
				}
			for(int j=0;j<agenda[i].length;j++) {
				if(agenda[i][j]!="null") {
					System.out.print(agenda[i][j]);
					System.out.print("\t");
				}
			}
		}
	}
	public static void buscarNombreAgenda() {
		String nombre=new String("");
		String aux=new String("");
		System.out.print("Introduce el nombre que quieres buscar: ");
		nombre=new Scanner(System.in).nextLine();
		System.out.println(ANSI_YELLOW+"BUSQUEDA DEL CONTACTO: ");
		System.out.println("-------------------------------");
		for(int i=0;i<agenda.length;i++) {
			aux=agenda[i][0];
			//Si el nombre del contacto coincide, lo muestra.
			if(aux.equals(nombre)) {
				System.out.print(agenda[i][0]+" ");
				System.out.print(agenda[i][1]);
			}
		}
	}
	public static void insertarContactosAgenda() {
		String nombre=new String("");
		int numero=0;
		boolean valido=true;
		for(int i=0;i<agenda.length;i++) {
			//encuentra el primer campo "null" disponible para insertar datos en el.
			if(agenda[i][0]=="null") {
				System.out.println("Introduce el nombre del contacto: ");
				nombre=new Scanner(System.in).nextLine();
				agenda[i][0]=nombre;
				do {
					try {
						System.out.println("Introduce el numero del contacto: ");
						numero=new Scanner(System.in).nextInt();
					}catch(InputMismatchException e) {
						System.out.println(ANSI_RED+"Numero no valido.");
						valido=false;
					}
				}while(valido!=true);
				agenda[i][1]=Integer.toString(numero);
				System.out.println(ANSI_YELLOW+"Contacto aniadido exitosamente.");
				break;
			}
		}
	}
	public static void eliminarContactoAgenda() {
		String nombre=new String("");
		String aux=new String("");
		System.out.print("Introduce el nombre del contacto que quieres eliminar: ");
		nombre=new Scanner(System.in).nextLine();
		for(int i=0;i<agenda.length;i++) {
			aux=agenda[i][0];
			if(aux.equals(nombre)) {
				agenda[i][0]="null";
				agenda[i][1]="null";
				System.out.println(ANSI_YELLOW+"Contacto eliminado exitosamente.");
				break;
			}
		}
	}
	public static void editarContactoAgenda() {
		String nombre=new String("");
		String aux=new String("");
		int opcion=0;
		int numero=0;
		boolean valido=true;
		System.out.print("Introduce el nombre del contacto que quieres modificar: ");
		nombre=new Scanner(System.in).nextLine();
		do{ //Asegurar que la opcion es 1 o 2 y capturar excepciones.
			try {
				System.out.println("1. Cambiar nombre | 2. Cambiar numero.");
				opcion=new Scanner(System.in).nextInt();
				if((opcion!=1)&&(opcion!=2)) {
					System.out.println(ANSI_RED+"Opcion no valida");
					valido=false;
				} else {
					valido=true;
				}
			}catch(InputMismatchException a) {
				System.out.println(ANSI_RED+"Opcion no valida");
				valido=false;
			}
		}while(valido!=true);
		//cambiar el dato
		for(int i=0;i<agenda.length;i++) {
			aux=agenda[i][0];
			if(aux.equals(nombre)) {
				if(opcion==1) {
					System.out.print(ANSI_CYAN+"Nuevo nombre: ");
					nombre=new Scanner(System.in).nextLine();
					agenda[i][0]=nombre;
					System.out.println(ANSI_YELLOW+"Opcion realizada correctamente.");
					continue;
				} if(opcion==2) {
					do {
						try {
							System.out.println(ANSI_CYAN+"Nuevo numero: ");
							numero=new Scanner(System.in).nextInt();
						}catch(InputMismatchException e) {
							System.out.println(ANSI_RED+"Numero no valido.");
							valido=false;
						}
					}while(valido!=true);
					agenda[i][1]=Integer.toString(numero);
					System.out.println(ANSI_YELLOW+"Opcion realizada correctamente.");
				}
			}
			
		}
	}
	public static boolean confirmarSalida(boolean salir) {
		char salida;
		System.out.print(ANSI_YELLOW+"Has elegido salir, estas seguro? (s/n): ");
		salida=new Scanner(System.in).next().charAt(0);
		salida=Character.toLowerCase(salida);
		if(salida=='s') {
			salir=true;
		} else {
			salir=false;
		}
		return salir;
	}
}