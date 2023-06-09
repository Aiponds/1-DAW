import java.util.Scanner;

public class Practico_StringAna {
	static String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
	static String mayusNum[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Def. de variables
		boolean salir = false;
		byte opcion = 1;
		char confirmacion = 's';

		// Desarrollo del programa

		do {
			mostrar();
			opcion = teclado.nextByte();
			switch (opcion) {
				case 1:
					pasarAMorse(pedirTexto());
					break;
				case 2:
					leerDeMorse(pedirTexto());
					break;
				case 0:
					System.out.println("Has elegido salir, estas seguro(s/n)");
					confirmacion = teclado.next().charAt(0);

					if (confirmacion == 's') {
						System.out.println("\t\t\tConfirmada tu salida.Bye!!");
						salir = true;
						break;
					}
					break;
				default:
					System.out.println("Opción no válida");
			}
		} while (!salir);
	}// fin del main

	public static void pasarAMorse(String cadena) {
		// Convertirmos una cadena a codigo Morse según tabla del ejercicio
		System.out.println("Traduciendo la frase: \"" + cadena + " \" al Morse, nos queda: ");
	}

	public static void leerDeMorse(String cadena) {
		System.out.println(morse[0]);
		// Traducimos un codigo Morse
	}

	public static String pedirTexto() {
		String frase = new String("");

		System.out.println("Dame el texto al traducir");
		frase = teclado.nextLine();
		return frase;
	}

	public static void mostrar() {
		System.out.println("\t\tBienvenido al Ejercicio Practico de Enero");
		System.out.println("1.Traducción a Morse");
		System.out.println("2.Interpretamos el Morse");
		System.out.println("3.Contamos palabras");
		System.out.println("0.Salir");
		System.out.println("¿Cuál es la opción elegida?");

	}

}
