public class U6_R4_Ej_Strings_StringBuilder_Victor {
    public static void main(String[]args) {
        //Variables
        
        //Desarrollo
        ejStrings();
        System.out.println("--------------------------");
        ejStringBuilder();
        
    }//fin main

    static void ejStrings() {
        //Variables
        String cadena=new String("Hoy es lunes y tengo clase de programación a última hora");
        String subCadena=new String();
        String subCadena2=new String();
        int posHora, posY;
        boolean contieneJueves;
        boolean empiezaJ;
        boolean acabaA;
        //Desarrollo
        //- Concatenar " con mi tutor"
        cadena.concat(" con mi tutor");
        //- Recuperaremos un substring de la cadena desde la posición 0 a la 3 --- "Hoy"
        subCadena=cadena.substring(0, 3);
        System.out.println(subCadena);
        //- Recuperaremos un substring de la cadena desde la posición 7 hasta el final --- "lunes y tengo clase de programacion a ultima hora"
        subCadena2=cadena.substring(7, (cadena.length()));
        System.out.println(subCadena2);
        //- Recuperaremos la posición en la que se encuentra la palabra "hora" buscando desde la posición 15 -
        posHora=cadena.indexOf("hora", 15);
        System.out.println("''Hora'' en posicion: "+posHora);
        //- Recuperaremos la posición en la que se encuentra el carácter "y". - 2
        posY=cadena.indexOf('y');
        System.out.println("''y'' en posicion: "+posY);
        //- Recuperaremos true o false si la cadena incluye a la palabra "jueves" - false
        contieneJueves=cadena.contains("jueves");
        System.out.println("Contiene jueves: "+contieneJueves);
        //- Recuperaremos true o false si la cadena empieza por "J" - false
        empiezaJ=cadena.startsWith("J");
        System.out.println("Empieza por J: "+empiezaJ);
        //- Recuperaremos true o false si la cadena acaba por "a" - true
        acabaA=cadena.endsWith("a");
        System.out.println("Acaba por a: "+acabaA);
        //- Reemplazaremos la palabra "tengo" por "hubo"
        cadena=cadena.replace("tengo", "hubo");
        //Finalmente, mostraremos la variable cadena mediante un System.out.println()
        System.out.println(cadena);
    }//fin ejStrings

    static void ejStringBuilder() {
        //Variables
        StringBuilder cadena2=new StringBuilder("martes");
        //Desarrollo
        cadena2.insert(0,"Hoy es ");
        cadena2.insert(cadena2.length()," a última hora");
        cadena2.insert(0,"¡");
        cadena2.replace(0, 4, "Ya");
        System.out.println(cadena2);

    }
} 