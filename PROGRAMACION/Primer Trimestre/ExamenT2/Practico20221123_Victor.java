import java.util.Scanner;
public class Practico20221123_Victor { //Victor Stala
	public static void main(String[]args) {
		//Variables
		int numeroInvitado;
		byte confirmacionSalida=0, contadorPrimo;
		long acumuladorFactorial; 
		boolean factorialExcesivo=false;
		//Desarrollo
		
		//Bucles para preguntar numeros, NO negativos, NO primos, factorial suyo NO mayor que billón(mil millones). Salida al exactamente introducir -1. Pedir confirmación para salir.
		do { //Bucle que engloba todo, pide confirmación para salir.
			do { //Bucle que pide el numero y realiza la comprobación.
				System.out.println("---------------------------------------------------------------------------------------------------------------"); //Añado guiones para diferenciar una nueva inserción de datos.
				System.out.print("Buenos días, le doy la bienvenida a Pensión de los números. Dígame su número. Si prefiere salir, diga -1: ");
				numeroInvitado=new Scanner(System.in).nextInt();
				System.out.print("\nVoy a proceder a verificarle según mi criterio, ya que dirijo el lugar; le aviso que mis requisitos son: ");
				System.out.print("\n\t1.No ser un numero primo.");
				System.out.print("\n\t2.Tu factorial no puede exceder mil millones.");
				System.out.println("\n\t3.No ser negativo ante la vida.\n");
				
				//EN ORDEN VOY A COMPROBAR SI SON 0, 8, O 12, SI SON NEGATIVOS, SI SON PRIMOS Y SI SU FACTORIAL EXCEDE 1 BILLON. SI LAS COMPROBACIONES SON FALSAS, ES BIENVENIDO.
				//Rechazamos los valores 0, 8 y 12, ya están dentro.
				if(numeroInvitado==0)
					System.out.println("El Sr.0 soy yo, no es válido su numero.\n");
				else {
					if(numeroInvitado==8 || numeroInvitado==12) 
						System.out.println("Ya está dentro de la pensión, no es válido su numero.\n");
					else {
					 	//Descartamos los numeros negativos.
						if(numeroInvitado<0)
							System.out.println("Lo siento, usted no cumple los requisitos.\n");
						//Comprobamos si es primo.
						else { 
							contadorPrimo=0; //Reiniciamos a 0 por cada numero introducido en la primera petición
							for(long i=1;i<=numeroInvitado;i++) {
								if(numeroInvitado%i==0)
									contadorPrimo++; //Sumamos 1 al ser resto 0. Si al final del bucle for contadorPrimo<=2, el numero es primo, else NO es primo.
							}//Fin bucle for
							if(contadorPrimo<=2)
								System.out.println("Lo siento, usted no cumple los requisitos.\n");
							//Comprobamos su factorial.
							else { 
								acumuladorFactorial=1; //Reiniciamos a 1 por cada numero introducido en la primera petición, lo mismo con el boolean reniciado a false.
								factorialExcesivo=false;
								for(long i=1;i<=numeroInvitado;i++) {
									acumuladorFactorial*=i;
									//Comprobamos si excede de 1mil millones. Tengo en cuenta el valor billon como mil millones, no 1 billion de América.
									if(acumuladorFactorial>=1000000000) {
										factorialExcesivo=true;
										break; //Rompemos la iteración al haber encontrado que supera el valor de mil millones.
									}
								}//Fin bucle for
								if(factorialExcesivo==true)
									System.out.println("Lo siento, usted no cumple los requisitos.\nPruebe a alojarse en el Number Astoria.\n");
								else {
									System.out.println("Bienvenido a la pensión, pase.\n");
								}
							}//Fin else
						}//Fin else
					}//Fin else
				}//Fin else
			} while(numeroInvitado!=-1); //Fin del bucle que solicita el numero y calcula.
			//Solicitamos la confirmación de salida.
			if(numeroInvitado==-1) { 
				System.out.print("Has elegido salir, estas seguro? (0=NO, 1=SI):");
				confirmacionSalida=new Scanner(System.in).nextByte();
			}
		} while(confirmacionSalida!=1); //Fin del bucle global, al haber confirmado la salida.
		
		System.out.println("\nUsted ha salido, tenga un buen día.");
		//Fin del ejercicio solicitado.
	}
}
