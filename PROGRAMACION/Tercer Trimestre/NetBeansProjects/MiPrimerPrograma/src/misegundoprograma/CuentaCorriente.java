/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misegundoprograma;

/**
 *
 * @author Victor
 */
public class CuentaCorriente {
    /*
    DATOS: DNI, NOMBRE TITULAR Y SALDO.
    PERMITIR:
    1. CREAR UNA CUENTA (DNI, NOMBRE TITULAR, SALDO=0)
    2. SACAR DINERO, EL METODO DEBE INDICAR SI HA SIDO POSIBLE LLEVAR A CABO LA OPERACION, SI EXISTE SALDO SUFICIENTE.
    3. INGRESAR DINERO
    4. MOSTRAR INFORMACION: MUESTRA LA INFORMACION DISPONIBLE DE LA CUENTA CORRIENTE.
    */
    final String dni;
    public String nombre;
    private double saldo;
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
    }
    private String getDni(){
        return this.dni;
    }
    private String getNombre(){
        return this.nombre;
    }
    private double getSaldo(){
        return this.saldo;
    }
    public void sacarDinero(double saldo){
        if(this.saldo<saldo) {
            System.out.println("No se pudo realizar la operacion de retirar el saldo especificado.");
        } else {
            this.saldo-=saldo;
        }
    }
    public void ingresarDinero(double saldo){
        this.saldo+=saldo;
    }
    public void mostrarInformacion(){
        System.out.println("\nNombre del titular: "+getNombre());
        System.out.println("DNI del titular: "+getDni());
        System.out.println("Saldo disponible: "+getSaldo());
    }
    
}//Fin de la clase.
