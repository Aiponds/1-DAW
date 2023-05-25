import java.util.Scanner;
public class Practico20221123_VictorEnClase { //Victor Stala
    static boolean numValido=true;
	public static void main(String[]args) {
		//Variables
        byte opcion=1;
        int numeroInvitado;
        char letra;
        boolean salir=false;
        
		//Desarrollo
		
		do {
            mostrar();
            opcion=new Scanner(System.in).nextByte();
            switch(opcion) {
                case 1: { //Vamos a validar el numero
                    //EN ORDEN VOY A COMPROBAR SI SON 0, 8, O 12, SI SON NEGATIVOS, SI SON PRIMOS Y SI SU FACTORIAL EXCEDE 1 BILLON. SI LAS COMPROBACIONES SON FALSAS, ES BIENVENIDO.
                    System.out.print("\nIntroduce tu numero: ");
                    numeroInvitado = new Scanner(System.in).nextInt();
                    negativo(numeroInvitado);
                    numDentro(numeroInvitado);
                    primo(numeroInvitado);
                    factorial(numeroInvitado);

                    if(numValido==true) {
                        System.out.println("\n\tBienvenido a la Pensión de los numeros, pase.");
                    } else {
                        System.out.println("\n\tUsted no puede entrar a la pensión de los numeros.");
                    }

                }
                break;
                case 2: { //Confirmación de salida
                    System.out.print("Seguro que quieres salir? s/n: ");
                    letra=new Scanner(System.in).nextLine().charAt(0);
                    if(letra=='s') {
                        System.out.println("Has decidido salir. Adios!");
                        salir=true;
                    }
                    
                }
                break;
                default: {
                    System.out.println("Opcion no valida: ");
                }
                break;
            }//Fin del menu            
        }while(salir==false);
	}
    public static void mostrar(){
        System.out.println("\nBienvenido a la Pension de los Numeros:");
        System.out.println("\t1.Pedir una habitacion.");
        System.out.println("\t2.Salir");
        System.out.print("Cual es la opcion elegida?: ");
    }
    public static void negativo(int num){
        numValido=num<0 ? false : true;
    }
    public static void numDentro(int num){
        if(num==0 || num==8 || num==12)
            numValido=false;
    }
    public static void primo(int num) {
        int contadorPrimo=0; //Reiniciamos a 0 por cada numero introducido en la primera petición
		for(long i=1;i<=num;i++) {
			if(num%i==0)
				contadorPrimo++; //Sumamos 1 al ser resto 0. Si al final del bucle for contadorPrimo<=2, el numero es primo, else NO es primo.
		}
        if (num==1) {
            numValido=true;
        } else if(contadorPrimo<=2)
            numValido=false;
    }
    public static void factorial(int num) {
        long acumuladorFactorial=1; //Reiniciamos a 1 por cada numero introducido en la primera petición, lo mismo con el boolean reniciado a false.
		boolean factorialExcesivo=false;
		for(long i=1;i<=num;i++) {
			acumuladorFactorial*=i;
			//Comprobamos si excede de 1mil millones. Tengo en cuenta el valor billon como mil millones, no 1 billion de América.
			if(acumuladorFactorial>=1000000000) {
				factorialExcesivo=true;
				break; //Rompemos la iteración al haber encontrado que supera el valor de mil millones.
			}
		}//Fin bucle for
		if(factorialExcesivo==true)
            numValido=false;
    }
}
