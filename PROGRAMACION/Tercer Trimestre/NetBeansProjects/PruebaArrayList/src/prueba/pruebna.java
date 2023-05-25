/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Victor
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pruebna {
    public static void main(String[] args) {
        ArrayList<Objeto> listaObjetos = new ArrayList<>();
        String nombre;

        // Crear y agregar objetos al ArrayList al mismo tiempo
        for (int i = 0; i < 3; i++) {
            System.out.println("agregar nombre: ");
            nombre = new Scanner(System.in).nextLine();
            listaObjetos.add(new Objeto(nombre));
        }
        // Imprimir los objetos en el ArrayList
        Collections.sort(listaObjetos);
        System.out.println(listaObjetos.toString());
    }
}
class Objeto implements Comparable<Objeto>{
    private String nombre;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Objeto{" + "nombre=" + nombre + '}';
    }
    
    @Override
    public int compareTo(Objeto objeto) {
        return this.nombre.compareTo(objeto.nombre);
    }
}

