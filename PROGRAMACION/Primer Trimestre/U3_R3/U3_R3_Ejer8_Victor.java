public class U3_R3_Ejer8_Victor  {
	public static void main(String[]args) { //Victor Stala
		/* 
		8. Escribir un program aen Java que sume los cuadrados de los cien primeros numeros naturales, mostrando el resultado en pantalla.
		*/
		//Variables
		int acumulador=1;
		//Desarrollo
		for(int i=1;i<101;i++)
			acumulador+=(i*i);
		System.out.println(acumulador);
	}//Fin Main
}//Fin class