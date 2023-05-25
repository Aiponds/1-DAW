import java.util.Scanner;
public class practico250123_VictorStala {
	public static void main(String[]args){
		//Desarrollo del examen
		menu();
	}//Fin main
	
	public static void menu() {
		//Variables
		byte opcion;
		char salida='x';
		//Desarrollo del menu
		do {
			//Mostramos las opciones al usuario
			System.out.println();
			System.out.println("Bienvenido al menu del examen. Elige una opción.");
			System.out.println("\t0. Salir");
			System.out.println("\t1. Traducir una frase del español a Morse.");
			System.out.println("\t2. Traducir una frase del Morse a español.");
			System.out.println("\t3. Contar palabras de un caracter, dos caracteres, etc.");
			System.out.print("\tOpcion: ");
			opcion=new Scanner(System.in).nextByte();
			//Iniciamos el menú iterativo, salida confirmada con char.
			switch(opcion) {
				case 0 : {
					System.out.print("\nSeguro que quieres salir? (introduce 's' para salir.) :");
					salida=new Scanner(System.in).next().charAt(0);
					salida=Character.toLowerCase(salida);
				}
				break;
				case 1 : { //Diseñar una aplicacion que lea una frase en español y que codifique la frase en morse.
					fraseAMorse();
				}
				break;
				case 2 : { //Diseñar una aplicacion que lea una frase en morse y que decodifique la frase en español.
					fraseACastellano();
				}
				break;
				case 3 : { //Diseñar una aplicacion que imprima una tabla que indique el numero de palabras de  una letra, de dos letras, ... que aparezcan en el texto.
					palabrasTabla();
				}
				break;
				default : {
					System.out.println("\nOpcion no valida.");
				}
			}
		}while(salida!='s');
	}//Fin metodo menu
	
	public static void fraseAMorse() { //este funciona bien
		//Variables
		char aux;
		String frase=new String("");
		String cadenaAux=new String("");
		String fraseEnMorse=new String("");
		//Desarrollo
		//Pedir la frase
		System.out.println("Introduce una frase en español sin signos de puntuación, voy a traducirla a Morse: ");
		frase=new Scanner(System.in).nextLine();
		frase=frase.toUpperCase();
		frase=frase.trim();
		//BUSCAMOS LA LETRA EN EL DICCIONARIO DE LA CLAVE Y VAMOS ACUMULANDO EN UNA CADENA.
		for(int i=0;i<frase.length();i++) {
			aux=frase.charAt(i);
			if(aux==' ') {
				fraseEnMorse=fraseEnMorse+" ";
			} else {
				cadenaAux=tablaClave(aux);
				fraseEnMorse=fraseEnMorse+cadenaAux;
			}
		}
		System.out.println("\nLa frase "+frase+" en morse es: "+fraseEnMorse);
		
	}//Fin metodo frase a morse.
	
	public static void fraseACastellano() { //este traduce pero sin concordancia
		//Variables

		String frase=new String("");
		String fraseEnCastellano=new String("");
		//Desarrollo
		//Pedir la frase
		System.out.println("Introduce una frase en Morse, voy a traducirla al castellano: ");
		frase=new Scanner(System.in).nextLine();
		frase=frase.trim();
		//no habia mucho tiempo la verdad
		fraseEnCastellano=frase.replaceFirst(".-","A").replaceFirst("-...","B").replaceFirst("-.-.","C").replaceFirst("-..","D").replaceFirst(".","E").replaceFirst("..-.","F").replaceFirst("--.","G").replaceFirst("....","H").replaceFirst("..","I").replaceFirst(".---","J").replaceFirst("-.-","K").replaceFirst(".-..","L").replaceFirst("--","M").replaceFirst("-.","N").replaceFirst("---","O").replaceFirst(".--.","P").replaceFirst("--.-","Q").replaceFirst(".-.","R").replaceFirst("...","S").replaceFirst("-","T").replaceFirst("..-","U").replaceFirst("...-","V").replaceFirst(".--","W").replaceFirst("-..-","X").replaceFirst("-.--","Y").replaceFirst("--..","Z").replaceFirst(".----","0").replaceFirst("..---","1").replaceFirst("...--","2").replaceFirst("....-","3").replaceFirst(".....","4").replaceFirst("-....","5").replaceFirst("--...","6").replaceFirst("---..","7").replaceFirst("----.","8").replaceFirst("-----","9");
		System.out.println("La frase "+frase+" traducida al español es: "+fraseEnCastellano);
		
	}//Fin metodo frase a castellano.
	
	public static String tablaClave(char aux) {
		//Variables
		int pos=0;
		int pos2=0;
		String diccionario=new String("(A .-)(B -...)(C -.-.)(D -..)(E .)(F ..-.)(G --.)(H ....)(I ..)(J .---)(K -.-)(L .-..)(M --)( N -.)(O ---)(P .--.)(Q --.-)(R .-.)(S ...)(T -)(U ..-)(V ...-)(W .--)(X -..-)(Y -.--)(Z --..)(0 .----)(1 ..---)(2 ...--)(3 ....-)(4 .....)(5 -....)(6 --...)(7 ---..)(8 ----.)(9 -----)");
		String subCadenaTraducida=new String("");
		//Desarrollo
		//BUSCAR LA LETRA, POS+1 DESDE LA LETRA Y HASTA LA POS2 QUE ES PARENTESIS )
		pos=diccionario.indexOf(aux);
		pos2=diccionario.indexOf(")", pos);
		subCadenaTraducida=diccionario.substring((pos+1),(pos2));
		
		return subCadenaTraducida;
		
	}//fin metodo tablaClave
	
	public static void palabrasTabla() {
		//Variables
		int contador[];
		String frase=new String("");

		//Desarrollo
		System.out.println("Introduce una frase, voy a contar las palabras de una letra, dos letras, etc.");
		frase=new Scanner(System.in).nextLine();
		
		contador=new int[frase.length()-1];

		for(int i=0;i<frase.length();i++) {

		}
		
		
	}//fin metodo palabrasTabla
}//fin clase

















