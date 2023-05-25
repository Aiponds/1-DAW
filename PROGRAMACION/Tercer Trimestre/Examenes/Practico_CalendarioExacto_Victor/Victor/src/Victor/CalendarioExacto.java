package Victor;

/**
 *
 * @author Victor
 */
public class CalendarioExacto extends Calendario {
    //Atributos
    private byte hora, minuto;
    //Constructores
    public CalendarioExacto(){
        super();
        this.hora=12;
        this.minuto=0;
    }
    public CalendarioExacto(int anyo, byte mes, byte dia, byte hora, byte minuto ){
        super(anyo,mes,dia);
        this.hora=hora;
        this.minuto=minuto;
        tiempoValido();
    }
    public CalendarioExacto(CalendarioExacto calendario){
        super(calendario);
        this.hora=calendario.hora;
        this.minuto=calendario.minuto;
        tiempoValido();
    }
    /*
     * Metodos
     */
    public void incrementarHora(){
        this.hora+=1;
        rangoHoras();
    }
    public void incrementarMinuto(){
        this.minuto+=1;
        rangoMinutos();
    }
    public boolean anyoBisiesto(){
        return (this.anyo%4==0);
    }
    public boolean iguales(CalendarioExacto fecha){
        return (this.dia==fecha.dia && this.mes==fecha.mes && this.anyo==fecha.anyo && this.hora==fecha.hora && this.minuto==fecha.minuto);
    }
    private void rangoHoras(){
        if(this.hora>23){
            this.hora=0;
            super.incrementarDia();
        }
    }
    private void rangoMinutos(){
        if (this.minuto>59){
            this.minuto=0;
            incrementarHora();
        }
    }
    private void tiempoValido(){
        this.hora = this.hora<0 ? this.hora=0 : this.hora;
        this.minuto = this.minuto<0 ? this.minuto=0 : this.minuto;
        rangoHoras();
        rangoMinutos();
    }
    @Override
    public String toString(){
        /*
         * Realizo comprobaciones para darle buen formato, en vez de 1/1/2023 9:3 será 01/01/2023 09:03
         */
        String fechaExacta="\nFechaExacta : ";
        if(this.dia<10){
            fechaExacta=fechaExacta+"0"+this.dia+"/";
        } else {
            fechaExacta=fechaExacta+this.dia+"/";
        }
        if(this.mes<10){
            fechaExacta=fechaExacta+"0"+this.mes+"/";
        } else {
            fechaExacta=fechaExacta+this.mes+"/";
        }
        fechaExacta=fechaExacta+this.anyo+" ";
        if(this.hora<10){
            fechaExacta=fechaExacta+"0"+this.hora+":";
        } else {
            fechaExacta=fechaExacta+this.hora+":";
        }
        if(this.minuto<10){
            fechaExacta=fechaExacta+"0"+this.minuto+"\n";
        } else {
            fechaExacta=fechaExacta+this.minuto+"\n";
        }
        return fechaExacta;
    }
}
