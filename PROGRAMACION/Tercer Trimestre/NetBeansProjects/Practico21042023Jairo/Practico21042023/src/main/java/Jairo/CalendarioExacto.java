/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jairo;
/**
 *
 * @author Jairo
 */
class CalendarioExacto {
    
    private Calendario Calendario;
    
    int minutos;
    
    int horas;
    

    public CalendarioExacto(){
    Calendario calendarioExacto = new Calendario (12,5,2023);
    this.horas = 12;
    this.minutos = 28;
    }
    public CalendarioExacto(int minutos, int horas, int dia, int mes,int anio){
        
    Calendario calendarioExacto = new Calendario(dia,  mes, anio );   
    this.horas = horas;
    this.minutos = minutos;
    
    }
    
    public int getHoras(){ 
    return horas;    
    }
    public int setHoras(int horas){ 
    this.horas = horas;   
    return horas;
    }
    public int getMinutos(){ 
    return minutos;    
    }
    public int setMinutos(int minutos){ 
    this.minutos = minutos;   
    return minutos;
    }
    @Override
    public String toString(){  // mostramos todo
        
        return "Día" + Calendario.getDia() +" Mes " + Calendario.getMes() + " Año" + Calendario.getAnio() + "Minutos: " + this.minutos + " Horas: " + this.horas;
    }
    public void mostrarInfo(){
        System.out.println("Día" + Calendario.dia +" Mes " + Calendario.getMes() + " Año" + Calendario.getAnio() + "Minutos: " + this.minutos + " Horas: " + this.horas);
    
    }
       public int incrementarHoras(){ // incrementamos horas en 1
        this.horas ++;
        comprobarHoras();
        return this.horas;
    }
       public int incrementarMinutos(){ // incrementamos minutos en 1
        this.minutos ++;
        comprobarMinutos();
        return this.minutos;
    }
        private int comprobarHoras(){    // comprobamos horas si supera 24, vuelve a 0 y suma 1 dia
        switch (this.horas){
            case 24:
                this.horas = 0;
                Calendario.dia ++;
            break;
            default:
        }
        return this.horas;
    }
       private int comprobarMinutos(){    // comprobamos minutos si supera 60 suma 1 hora, vuelve a 0
        switch (this.minutos){
            case 24:
                this.minutos = 0;
                this.horas ++;
            break;
            default:
        }
        return this.minutos;
    }
       public int incrementarDias(){ // incrementamos dias en 1
        Calendario.incrementarDia();
        return Calendario.dia;
    }
        public int incrementarMes(){ // incrementamos mes en 1
        Calendario.incrementarMes();
        return Calendario.mes;
    }
       public int incrementarAnio(int cantidad){ // incrementamos años en 1
        Calendario.incrementarAnio(cantidad);
        return Calendario.anio;
    }
          public void iguales(CalendarioExacto comparar){
        if (this.horas == comparar.horas && this.minutos == comparar.minutos){
            System.out.println("La hora es igual");
        }else{
            System.out.println("La hora no es igual");
        }
          }
    
    
}
