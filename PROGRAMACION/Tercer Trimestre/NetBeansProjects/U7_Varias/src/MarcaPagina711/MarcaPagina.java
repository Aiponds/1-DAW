package MarcaPagina711;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class MarcaPagina {
    private int pagina;
    
    public MarcaPagina(){
        this.pagina=1;
    }
    public MarcaPagina(int pagina){
        this();
        this.pagina=pagina;
    }
    public int getPagina() {
        return this.pagina;
    }
    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
    public void verPagina(){
        System.out.println("El marcapaginas esta en la pagina "+getPagina());
    }
    public void incrementar(int incremento){
        setPagina(getPagina()+incremento);
    }
    public void empezar(){
        setPagina(1);
    }
    
    
    
}
