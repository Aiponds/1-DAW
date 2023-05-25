/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 4 bombilals
        System.out.println("4 Bombillas creadas...");
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();
        Bombilla bombilla4 = new Bombilla();
        
        // Encendemos dos bombillas
        System.out.println("Bombillas 1 y 2 encendidas...");
        bombilla1.cambiarEstado();
        bombilla2.cambiarEstado();
        
        System.out.println("Bombilla 1: "+bombilla1.getEstado());
        System.out.println("Bombilla 2: "+bombilla2.getEstado());
        System.out.println("Bombilla 3: "+bombilla3.getEstado());
        System.out.println("Bombilla 4: "+bombilla4.getEstado());
        
        System.out.println("Interruptor general apagado...");
        bombilla1.cambiarEstadoGeneral();
        
        System.out.println("Bombilla 1: "+bombilla1.getEstado());
        System.out.println("Bombilla 2: "+bombilla2.getEstado());
        System.out.println("Bombilla 3: "+bombilla3.getEstado());
        System.out.println("Bombilla 4: "+bombilla4.getEstado());
        
        System.out.println("Ponemos una bombilla nueva y encendemos...");
        Bombilla bombilla5 = new Bombilla();
        bombilla5.cambiarEstado();
        
        System.out.println("Bombilla 1: "+bombilla1.getEstado());
        System.out.println("Bombilla 2: "+bombilla2.getEstado());
        System.out.println("Bombilla 3: "+bombilla3.getEstado());
        System.out.println("Bombilla 4: "+bombilla4.getEstado());
        System.out.println("Bombilla 5: "+bombilla5.getEstado());
        
        bombilla1.cambiarEstadoGeneral();
        System.out.println("Interruptor general encendido...");
        System.out.println("Bombilla 1: "+bombilla1.getEstado());
        System.out.println("Bombilla 2: "+bombilla2.getEstado());
        System.out.println("Bombilla 3: "+bombilla3.getEstado());
        System.out.println("Bombilla 4: "+bombilla4.getEstado());
        System.out.println("Bombilla 5: "+bombilla5.getEstado());
    }
    
}
