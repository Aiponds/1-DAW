/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jairo;

/**
 *
 * @author Jairo
 */
import java.util.*;
public class Principal_Jairo {
 

    
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        boolean compararDia = false, compararMes = false,compararAnio = false;
        int menuOpcion = 0,menuOpcion2= 0,menuOpcion3 = 0;
        String siNo = " ";
        String siNo2 = " ";
        String siNo3 = " ";
        boolean confirmarSalida = false;
        boolean confirmarSalida2 = false;
        boolean confirmarSalida3 = false;
        boolean confirmarSalida5 = false;
        boolean confirmarSalida6 = false;
        int dia,mes,anio,anio2,diaComparar,mesComparar,anioComparar,anio3;
        boolean fechaValida = false;
        int diasComparar= 0;
        int mesesComparar = 0;
        int aniosComparar = 0;
        int horasComparar = 0;
        int minutosComparar = 0;
        int minutos = 0;
        int horas = 0;
        Calendario fechaUsusario = new Calendario(0,0,0);
        final String rojo = "\033[31m";   //  color rojo
        final String verde = "\033[32m"; //  color verde
        final String reset = "\033[0m";  // reset del color
 
        do {
            System.out.println("¡Bienvenido al calendario de google!");
            System.out.println(rojo + "Para comenzar a navegar por él debes seleccionar una fecha:" + reset);
            System.out.println(verde + "1. (ACTUALIZADO) Fecha por defecto (Actual: 12.05.2023)" + reset);
            System.out.println(rojo + "2. (ACTUALIZADO) Introducir mi propia fecha" + reset);
            System.out.println(verde + "3. (NUEVO) Usar calendarioExacto con horas y minutos ACTUALES " + reset);
            System.out.println(rojo + "4. (NUEVO) Usar calendarioExacto con mis propias horas y minutos " + reset);
            System.out.println(verde+ "5. Salir" + reset);

            try{
                menuOpcion = teclado.nextInt();
            }catch(Exception e){
                System.out.println("Opción inválida");
                break;
            }
        
            switch (menuOpcion) {
               
                case 1:   
                    Calendario fechaActual = new Calendario(); // Crear fecha respecto la actual
                    do{
                        System.out.println(fechaActual.toString());
                        System.out.println("¡Perfecto ya tenemos tu fecha! ahora ¿Qué deseas hacer?");
                        System.out.println("1. Incrementar Día en 1");
                        System.out.println("2. Incrementar Mes en 1");
                        System.out.println("3. Incrementar Año en lo que el usuario elija");
                        System.out.println("4. Comparar fechas");
                        System.out.println("5. Salir");
                        try{
                        menuOpcion3 = teclado.nextInt();
                        }catch(Exception e){
                            System.out.println("Opción inválida");
                        }
                        switch (menuOpcion3){
                            case 1: 
                                System.out.println(fechaActual.toString());     //Incrementamos días del objeto con constructor por defecto
                                fechaActual.incrementarDia();
                                System.out.println("Incrementamos....");
                                System.out.println(fechaActual.toString());
                            break;
                            case 2:
                                System.out.println(fechaActual.toString());     //Incrementamos mes del objeto con constructor por defecto
                                fechaActual.incrementarMes();
                                System.out.println("Incrementamos.....");
                                System.out.println(fechaActual.toString());
                            break;
                            case 3:
                                System.out.println("¿En cuanto quieres incrementar los años?");
                                anio3 = teclado.nextInt();
                                System.out.println(fechaActual.toString());          //Incrementamos años del objeto con constructor por defecto
                                fechaActual.incrementarAnio(anio3);
                                System.out.println("Incrementamos....");
                                System.out.println(fechaActual.toString());
                                

                            break;
                            case 4:
                                System.out.println("Vamos a comparar la fecha actual con la que introduzcas: "); //Comparamos 2 objetos
                                System.out.println("Dia: ");
                                diasComparar = teclado.nextInt();
                                System.out.println("Mes: ");
                                mesesComparar = teclado.nextInt();
                                System.out.println("Año: ");
                                aniosComparar = teclado.nextInt();
                                Calendario fechaComparar = new Calendario(diasComparar,mesesComparar,aniosComparar);
                                fechaActual.iguales(fechaComparar);
                                //iguales
                            break;
                            case 5:
                                System.out.println("¿Estas seguro de que quieres salir?");          //Salida
                                siNo3 = teclado.nextLine();
                                siNo3 = teclado.nextLine();
                                if (siNo3.equals("S") || siNo3.equals("s")) {
                                    confirmarSalida3 = true;
                                }
                            break;
                            default:
                        }

                    }while (confirmarSalida3 == false);
                break;
                case 2:                    // Crear fecha segun usuario
                    do{
                    System.out.println("Introduce la fecha");
                    System.out.println("Día: ");
                    dia = teclado.nextInt();
                    System.out.println("Mes: ");
                    mes = teclado.nextInt();
                    System.out.println("Año: ");
                    anio = teclado.nextInt();
                    if (dia > 31){
                        fechaValida = false;
                    }else if (mes > 12){
                        fechaValida = false;
                    }else if (anio == 0) {          // Comprobacion de que la fecha introducida es válida
                        fechaValida = false;
                    }else{
                        fechaValida =true;   
                    }
                    if (fechaValida == false) {
                        System.out.println("Fecha no válida vuelve a intentarlo");
                    }
                    }while (fechaValida == false);
                    System.out.println("Fecha válida");
                    Calendario fechaUsuario = new Calendario(dia,mes,anio);
                    System.out.println(fechaUsuario.toString());
                    do{
                        System.out.println("¡Perfecto ya tenemos tu fecha! ahora ¿Qué deseas hacer?"); // Menú cuando es valida
                        System.out.println("1. Incrementar Día en 1");
                        System.out.println("2. Incrementar Mes en 1");
                        System.out.println("3. Incrementar Año en lo que el usuario elija");
                        System.out.println("4. Comparar fechas");
                        System.out.println("5. Salir");
                        
                        menuOpcion2 = teclado.nextInt();
                     
                        switch (menuOpcion2){
                            case 1:
                                System.out.println(fechaUsuario.toString());    // Incrementamos dias en el objeto creado por usuario
                                fechaUsuario.incrementarDia();
                                System.out.println("Incrementamos...");
                                System.out.println(fechaUsuario.toString());
                            break;
                            case 2:
                                System.out.println(fechaUsuario.toString());    // Incrementamos mes en el objeto creado por usuario
                                fechaUsuario.incrementarMes();
                                System.out.println("Incrementamos...");
                                System.out.println(fechaUsuario.toString());

                            break;
                            case 3:
                                System.out.println("¿En cuanto quieres incrementar los años?");  // Incrementamos años en el objeto creado por usuario
                                anio2 = teclado.nextInt();
                                fechaUsuario.incrementarAnio(anio);
                            break;
                            case 4:
                                System.out.println("Vamos a comparar la fecha actual con la que introduzcas: "); //Comparamos 2 objetos
                                System.out.println("Dia: ");
                                diasComparar = teclado.nextInt();
                                System.out.println("Mes: ");
                                mesesComparar = teclado.nextInt();
                                System.out.println("Año: ");
                                aniosComparar = teclado.nextInt();
                                Calendario fechaComparar = new Calendario(diasComparar,mesesComparar,aniosComparar);
                                fechaUsuario.iguales(fechaComparar);
                            break;
                            case 5:
                                System.out.println("¿Estas seguro de que quieres salir? (S/N)");
                                siNo2 = teclado.nextLine();
                                siNo2 = teclado.nextLine();
                                if (siNo2.equals("S") || siNo2.equals("s")) {
                                    confirmarSalida2 = true;
                                 break;
                                }
                            break;
                            default:
                        }

                    }while (confirmarSalida2 == false);
                break;
                case 3: // Crear fecha exacta respecto la actual
                   CalendarioExacto calendarioDefault = new CalendarioExacto (37,13,12,5,2023);
                   do{
                        System.out.println("¡Perfecto ya tenemos tu fecha! ahora ¿Qué deseas hacer?"); // Menú cuando es valida
                        System.out.println("1. Incrementar Día en 1");
                        System.out.println("2. Incrementar Mes en 1");
                        System.out.println("3. Incrementar Año en lo que el usuario elija");
                        System.out.println("4. Comparar fechas");
                        System.out.println("5. Incrementar horas");
                        System.out.println("6. Incrementar minutos");
                        System.out.println("7. Salir");
                        
                        menuOpcion2 = teclado.nextInt();
                     
                        switch (menuOpcion2){
                            case 1:
                                calendarioDefault.incrementarDias();
                                System.out.println("Incrementamos...");
                            break;
                            case 2:
                                calendarioDefault.incrementarMes();
                                System.out.println("Incrementamos...");

                            break;
                            case 3:
                                System.out.println("¿En cuanto quieres incrementar los años?");  // Incrementamos años en el objeto creado por usuario
                                anio2 = teclado.nextInt();
                                calendarioDefault.incrementarAnio(anio2);
                            break;
                            case 4:
                                System.out.println("Vamos a comparar la fecha actual con la que introduzcas: "); //Comparamos 2 objetos
                                System.out.println("Hora: ");
                                horasComparar = teclado.nextInt();
                                System.out.println("Minutos: ");
                                minutosComparar = teclado.nextInt();
                                CalendarioExacto fechaComparar = new CalendarioExacto(minutosComparar,horasComparar,diasComparar,mesesComparar,aniosComparar);
                                calendarioDefault.iguales(fechaComparar);
                            break;
                            case 5:
                                calendarioDefault.incrementarHoras(); // incrementamos horas
                            break;
                            case 6:
                                calendarioDefault.incrementarMinutos(); // incrementamos minutos
                            break;
                            case 7:
                                System.out.println("¿Estas seguro de que quieres salir? (S/N)");
                                siNo2 = teclado.nextLine();
                                siNo2 = teclado.nextLine();
                                if (siNo2.equals("S") || siNo2.equals("s")) {
                                    confirmarSalida5 = true;
                                 break;
                                }
                            break;
                            default:
                        }

                    }while (confirmarSalida5 == false);
                    
                    
                    
                break;
                case 4: // Crear fecha exacta respecto la introducida por el usuario
                    do{
                    System.out.println("Introduce la fecha");
                    System.out.println("Día: ");
                    dia = teclado.nextInt();
                    System.out.println("Mes: ");
                    mes = teclado.nextInt();
                    System.out.println("Año: ");
                    anio = teclado.nextInt();
                    System.out.println("Horas: ");
                    horas = teclado.nextInt();
                    System.out.println("Minutos: ");
                    minutos = teclado.nextInt();
                    if (dia > 31){
                        fechaValida = false;
                    }else if (mes > 12){
                        fechaValida = false;
                    }else if (anio == 0) {          // Comprobacion de que la fecha introducida es válida
                        fechaValida = false;
                    }else if(horas > 24) {
                        fechaValida = false;
                    }else if(minutos > 60) {
                        fechaValida = false;
                    }else{
                        fechaValida =true;   
                    }
                    if (fechaValida == false) {
                        System.out.println("Fecha no válida vuelve a intentarlo");
                    }
                    }while (fechaValida == false);
                    CalendarioExacto calendarioUsuario = new CalendarioExacto(minutos,horas,dia,mes,anio);
                    System.out.println("Perfecto ya tenemos tu fecha: ");
                                       do{
                        System.out.println("¡Perfecto ya tenemos tu fecha! ahora ¿Qué deseas hacer?"); // Menú cuando es valida
                        System.out.println("1. Incrementar Día en 1");
                        System.out.println("2. Incrementar Mes en 1");
                        System.out.println("3. Incrementar Año en lo que el usuario elija");
                        System.out.println("4. Comparar fechas");
                        System.out.println("5. Incrementar horas");
                        System.out.println("6. Incrementar minutos");
                        System.out.println("7. Salir");
                        
                        menuOpcion2 = teclado.nextInt();
                     
                        switch (menuOpcion2){
                            case 1:
                                calendarioUsuario.incrementarDias();
                                System.out.println("Incrementamos...");
                            break;
                            case 2:
                                calendarioUsuario.incrementarMes();
                                System.out.println("Incrementamos...");

                            break;
                            case 3:
                                System.out.println("¿En cuanto quieres incrementar los años?");  // Incrementamos años en el objeto creado por usuario
                                anio2 = teclado.nextInt();
                                calendarioUsuario.incrementarAnio(anio2);
                            break;
                            case 4:
                                System.out.println("Vamos a comparar la fecha actual con la que introduzcas: "); //Comparamos 2 objetos
                                System.out.println("Hora: ");
                                horasComparar = teclado.nextInt();
                                System.out.println("Minutos: ");
                                minutosComparar = teclado.nextInt();
                                CalendarioExacto fechaComparar = new CalendarioExacto(minutosComparar,horasComparar,diasComparar,mesesComparar,aniosComparar);
                                calendarioUsuario.iguales(fechaComparar);
                            break;
                            case 5:
                                calendarioUsuario.incrementarHoras(); // incrementamos horas
                            break;
                            case 6:
                                calendarioUsuario.incrementarMinutos(); // incrementamos minutos
                            break;
                            case 7:
                                System.out.println("¿Estas seguro de que quieres salir? (S/N)");
                                siNo2 = teclado.nextLine();
                                siNo2 = teclado.nextLine();
                                if (siNo2.equals("S") || siNo2.equals("s")) {
                                    confirmarSalida6 = true;
                                 break;
                                }
                            break;
                            default:
                        }

                    }while (confirmarSalida6 == false);
                    
                break;
                
                case 5: 
                        System.out.println("¿Estas seguro de que quieres salir? (S/N)");
                        siNo = teclado.nextLine();
                        siNo = teclado.nextLine();
                        if (siNo.equals("S") || siNo.equals("s")) {
                            confirmarSalida = true;
                        }
            }
        }while (confirmarSalida == false);
        System.out.println("Programa finalizado.");
    }
}

