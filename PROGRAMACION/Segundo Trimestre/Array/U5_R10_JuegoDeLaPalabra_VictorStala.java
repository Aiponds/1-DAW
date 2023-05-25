import java.lang.reflect.Array;
import java.util.*;
public class U5_R10_JuegoDeLaPalabra_VictorStala {
    public static final String RED = "\u001B[41m";
    public static final String GREEN = "\u001B[42m";
    public static final String YELLOW = "\u001B[43m";
    public static final String WHITE = "\u001B[47m\u001B[30m";
    public static final String RESET = "\u001B[0m";
    static String[] palabras = {"coche","nieve","hueso","titan","flujo","disco","razon","hongo","jaula","atril","ganso","negro","botar","bruja","errar","girar","grasa","secar","tonto","monja","bonus","cotar","oveja","caido","burro","falsa","trama","ciego","pongo","ayuda","calla","hecho","prima","coger","patas","lucha","igual","tabla","vejez","aries","cante","ocaso","ideal","simio","bueno","crema","china","acabo","tinta","espia","dulce","zorro","tarde","saber","suiza","burra","jaleo","jurco","tarta","abeja","samba","lista","envio","gusto","valla","latir","finca","pulpa","alpes","calva","goteo","solar","fruta","circo","metal","falta","signo","libre","peaje","sushi","corta","gemir","acaso","trago","forro","mirar","coral","zurdo","pieza","dobla","cerca","llena","lituo","lindo","albur","danza","koala","licra","orden","rubio","minal","crear","manta","gatas","labio","cobra","sauco","bolso","sanar","droga","veloz","gente","mimar","karma","cursi","virus","cabra","junio","latex","lunar","sigma","amiga","lapiz","clima","suave","cerco","lloro","trece","laser","polar","lugar","silla","misil","actor","arena","judas","sexto","aereo","casco","extra","vagon","vieja","falso","lejos","dogma","ruego","clave","jamas","plaza","antro","boxer","buceo","fuego","koine","menor","dieta","ligar","laico","media","cesta","liana","torre","digno","meter","flota","salir","aguja","pugna","cargo","forma","miedo","palma","cagon","pausa","estar","gallo","socio","mundo","rezar","sabio","doble","coito","villa","nuevo","marca","foton","marco","duelo","gorda","abril","traje","litro","muela","sismo","baile","bollo","picar","playa","suelo","tarro","chica","leche","feroz","sucio","kefir","firma","libro","ellos","manco","fumar","baila","gordo","caldo","gripe","llave","rosal","motel","pluma","grave","vital","lleno","sexta","aldea","faena","creer","santa","fauno","obvio","deuda","fecha","lecho","ataud","crack","podar","enero","rimar","audaz","tallo","congo","clavo","cutre","nadie","jueza","lider","diosa","flora","bingo","carne","sarza","barca","malla","beber","guapo","gamba","apoyo","atroz","saldo","matar","fuero","lucir","mania","salsa","zombi","legua","marzo","donde","oasis","rumba","rubia","justo","jugar","anime","doler","junto","cobro","melon","cable","atajo","poder","salmo","oreja","abrir","sudar","reloj","pulpo","libra","bravo","brazo","titar","rural","helio","rodeo","banco","hueco","tieso","zebra","tumor","reino","sudor","viejo","dicha","mueca","copia","mudar","regla","llaga","paseo","pinza","brava","jarro","pulga","chile","cueva","limbo","fobia","ladra","frita","corto","erizo","salon","bahia","serio","finta","cobre","tesla","pauta","anual","mecha","manso","flama","robar","metro","hogar","abuso","poner","raspa","poeta","kilim","vacio","telar","misio","torta","calvo","bucle","durar","coste","rollo","labor","santo","cerda","bomba","campo","acero","llama","farsa","burla","kopek","vapor","fauna","entre","cerdo","avena","sarro","vivir","vaina","padre","labia","celda","pared","parar","magno","hielo","botin","mayor","jamon","silva","vodka","corro","lemur","pecar","mojar","bufon","tigre","linea","error","ruedo","callo","video","rueda","jaque","dueto","subir","pleno","miope","dejar","cocer","femur","primo","multa","fusil","himno","tinto","soplo","juego","conde","grano","magia","agudo","matiz","brujo","pesca","oruga","cague","tecla","deseo","carga","cuero","golpe","conga","enano","barco","cisne","menos","arete","renta","pisar","ozono","medio","arpon","tibio","quema","casar","fresa","listo","rasgo","madre","cielo","tramo","tango","nieto","cacao","morir","legal","plano","cuida","besar","tarot","lento","ruido","litio","catar","calor","muera","comer","mareo","andar","pinta","marea","donar","piojo","bolsa","arroz","secta","limon","mosca","mente","kurdo","ganar","licor","calle","dolor","rasca","tesis","rugby","movil","rotar","adios","volar","canta","abono","humor","plomo","tribu","obeso","patio","feliz","nariz","firme","cajon","sabor","cerro","gorro","rasta","abajo","preso","negar","acida","chino","agrio","rocio","fuera","viaje","huevo","tarea","rublo","anden","broma","armar","ayuno","norte","boton","altar","papel","fruto","jurar","icono","rapto","fisco","rayar","hacer","selva","doblo","fluir","cacho","calma","serie","tinte","bajar","abano","polvo","reina","tapar","falto","japon","fenix","ostia","domar","polen","lamer","mural","costo","colar","favor","arepa","menta","palco","dicho","ileso","farol","limar","rumbo","asado","busco","corte","flaco","poema","medir","bajon","tirar","canto","olivo","frito","noche","ducha","busca","flote","tauro","tutor","orina","acera","hidra","culto","guiso","cenar","amigo","fallo","drama","macho","posar","nueve","pollo","siete","usado","rumor","junta","lucro","cagar","tocar","pizza","atras","radio","tomar","acabe","sorda","ruina","siglo","braza","nicho","pecho","banda","nueva","novio","boxeo","trono","aroma","pasta","arpia","prisa","mejor","chico"};
    static int contVictorias=0;
    public static void main(String[] args) {// Victor Stala
        /* WORDLE
        Menu{
        - Jugar
        - Salir
        } 
        Longitud de la palabra: 5 
        Colores{
        - Amarillo (esta pero en otro sitio)
        - Verde (esta en el sitio correcto)s
        - Rojo (no esta)
        } 
        */
        // Desarrollo
        menuWordle();
        System.out.println("Ha finalizado tu sesión. Gracias por jugar.");
    }//Fin Main

    public static void menuWordle() {
        //Variables
        char opcion;
        boolean salir=false;
        //Desarrollo
        do{
            opcion=textoMenu();
            switch(opcion){
                case '1': {
                    /*
                     * INICIA EL JUEGO, ACUMULA EL TOTAL DE VICTORIAS QUE SE VERA REFLEJADO EN EL MENU
                     */
                    juegoWordle();
                }
                break;
                case '2': {
                    /*
                     * CONFIRMA LA SALIDA DEL USUARIO
                     * 1. SI INTRODUCE 'S' o 's' SALE DEL PROGRAMA
                     * 2. SI INTRODUCE 'N' o 'n' SE QUEDA EN EL PROGRAMA
                     * 3. SI INTRODUCE CUALQUIER OTRO VALOR LA CONFIRMACION SE CIERRA Y DEVUELVE AL MENU
                     */
                    salir=confirmarSalida(opcion);
                }
                break;
                default: {
                    System.out.println("Opción no válida");
                }
            }
        }while(salir!=true);
    }//fin menuWordle

    public static boolean confirmarSalida(char opcion) {
        boolean salir=true;
        System.out.print("Estas seguro de que quieres salir? s/n: ");
        opcion=new Scanner(System.in).next().charAt(0);
        opcion=Character.toLowerCase(opcion);
        salir=opcion==('s') ? true : false;
        if((opcion!='s')&&(opcion!='n')) {
            System.out.println(RED+"La opcion de salida no es correcta."+RESET);
            salir=false;
        }
        return salir;
    }

    public static char textoMenu() {
        char opcion;
        System.out.println("\n"+RESET);
        System.out.println("#######################################");
        System.out.println("#  Bienvenido al Juego de la Palabra  #");
        System.out.println("#-------------------------------------#");
        System.out.println("#               1. Jugar              #");
        System.out.println("#               2. Salir              #");
        System.out.println("#          Llevas "+contVictorias+" victoria/s        #");
        System.out.println("#######################################");
        System.out.println();
        System.out.print("Opcion: ");
        opcion=new Scanner(System.in).next().charAt(0);
        return opcion;
    }

    public static void ayudaUsuario() {
        System.out.println("\n\n\n\n\nAdivina la palabra de 5 caracteres en 6 intentos.");
        System.out.println(RED+"No esta en la palabra"+RESET);
        System.out.println(YELLOW+"Posicion incorrecta"+RESET);
        System.out.println(GREEN+"Posicion correcta"+RESET);
    }

    public static void juegoWordle() {
        //VARIABLES PARA EL JUEGO.
        int numIntentos=0;
        int aciertos=0;
        String palabraUsuario=new String("");
        String aux=new String();
        //Generar un numero aleatorio para elegir una palabra al azar.
        int palabraElegida=(int)(Math.random()*(Array.getLength(palabras)));
        //Sacar la palabra elegida a un String aislado.
        String palabraSecreta=new String(palabras[palabraElegida]).toUpperCase();
        //Iniciar un array de 6x5 (num intentos y longitud de la palabra) en las que se va a intentar adivinar la palabra secreta. Rellenar con guiones.
        String[][] intentos = new String[6][5];
        for(int i=0;i<intentos.length;i++) {
            for(int j=0;j<intentos[i].length;j++) {
                intentos[i][j]=WHITE+"-"+RESET;
            }
        }
        //Desarrollo
        /*
         * INICIAMOS UN DO-WHILE QUE MOSTRARA LOS INTENTOS Y COMPROBARA LAS DOS CADENAS.
         */
        do {
            ayudaUsuario();
            mostarIntentos(intentos);
            palabraUsuario=pedirPalabra();
            //BUCLE QUE COMPROBARA LA PALABRA DEL USUARIO CON LA PALABRA SECRETA
            for(int j=0;j<intentos[numIntentos].length;j++) {
                //GUARDAR LA LETRA EN UN STRING AUXILIAR
                aux=palabraUsuario.substring(j,j+1);
                //SI EL CARACTER COINCIDE EN LAS DOS CADENAS PINTAMOS DE VERDE Y SUMAMOS UN ACIERTO ACUMULATIVO. SI ACIERTA TODAS DECLARA VENCEDOR.
                if((palabraUsuario.charAt(j)==palabraSecreta.charAt(j))) {
                    aux=GREEN+palabraUsuario.substring(j,j+1)+RESET;
                    intentos[numIntentos][j]=aux;
                    aciertos++;
                    //SI EL CARACTER EXISTE EN LA CADENA PERO NO COINCIDE PINTAMOS DE AMARILLO Y REINICIAMOS LOS ACIERTOS PARA QUE NO SALGA DEL BUCLE.
                } else if(palabraSecreta.indexOf(palabraUsuario.charAt(j))!=-1) {
                    aux=YELLOW+palabraUsuario.substring(j,j+1)+RESET;
                    intentos[numIntentos][j]=aux;
                    aciertos=0;
                    //SI EL CARACTER NO EXISTE EN LA CADENA PINTAMOS DE ROJO Y REINICIAMOS LOS ACIERTOS PARA QUE NO SALGA DEL BUCLE.
                } else {
                    aux=RED+palabraUsuario.substring(j,j+1)+RESET;
                    intentos[numIntentos][j]=aux;
                    aciertos=0;
                }
            }
            //SUMA AL NUMERO DE INTENTOS QUE CONDICIONA LOS INTENTOS DEL USUARIO.
            numIntentos++;
            /*SALE DEL BUCLE SI: 
             * 1. EL USUARIO FALLA LOS 6 INTENTOS
             * 2. EL USUARIO ACIERTA LAS 5 POSICIONES.
            */
        }while((aciertos<5)&&(numIntentos<6));
        /*
         * AL TERMINAR EL JUEGO, MUESTRA LA ULTIMA EJECUCCION 
         * EL JUEGO COMPRUEBA SI HA ACERTADO TODAS LAS POSICIONES
         * SI GANA, SUMA UNO AL CONTADOR DE VICTORIAS TOTALES
         * SI FALLA, LE INFORMA Y NO SUMA NADA.
         */
        mostarIntentos(intentos);
        //COMPROBACION
        if(aciertos>=5) {
            System.out.println("\n\n"+GREEN+"Has ganado! La palabra era "+palabraSecreta+RESET);
            contVictorias++;
        } else {
            System.out.println("\n\n"+RED+"Has perdido! La palabra era "+GREEN+palabraSecreta+RESET);
        }
    }//fin juegoWordle
    
    public static void mostarIntentos(String[][] intentos) {
        //BUCLE QUE MUESTRA POR CONSOLA TODOS LOS INTENTOS CON LOS COLORES Y LAS LETRAS RESPECTIVAS.
        for(int i=0;i<intentos.length;i++) {
            System.out.println();
            for(int j=0;j<intentos[i].length;j++) {
                System.out.print(intentos[i][j]);
            }
        }
    }

    public static String pedirPalabra() {
        String cad;
        boolean valido;
        int contador;
        //Desarrollo
        do {
            System.out.println();
            System.out.print("Introduce una palabra (5 letras): ");
            cad=new Scanner(System.in).nextLine().trim().toUpperCase();
    
            // Comprobar que la cadena tiene 5 caracteres
            valido=cad.length()!=5 ? false : true;
    
            // Comprobar que todos los caracteres son letras
            contador = 0;
            for (int i = 0; i < cad.length(); i++) {
                char c = cad.charAt(i);
                if (Character.isLetter(c)) {
                    contador++;
                }
            }
            valido=contador==5 ? true : false;
        } while (valido==false);
    
        return cad;
    }
}