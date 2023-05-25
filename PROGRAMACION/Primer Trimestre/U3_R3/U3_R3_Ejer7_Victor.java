public class U3_R3_Ejer7_Victor  {
	public static void main(String[]args) { //Victor Stala
		/* 
		7. Escribir un programa en Java que multiplique los 20 primeros numeros naturales.
		*/
		//Variables
		long acumulador=1;
		//Desarrollo
		for(long i=1;i<21;i++)
			acumulador*=i;
		System.out.println(acumulador);
	}//Fin Main
}//Fin class