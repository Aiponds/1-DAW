public class U3_R3_Ejer13_Victor  {
	public static void main(String[]args) { //Victor Stala
		/* 
		13. Diseña un programa en java con un bucle for que muestre las tablas de multiplicar.
		*/
		//Variables
		
		//Desarrollo
		for(int i=10;i>0;i--) {
			System.out.println("Tabla del "+i+"------------------");
			for(int j=0;j<11;j++) {
			System.out.println("\t\t"+i+"x"+j+"="+j*i);
			}
		}
			
	}//Fin Main
}//Fin class