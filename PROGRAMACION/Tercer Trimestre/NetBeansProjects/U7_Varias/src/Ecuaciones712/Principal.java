/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecuaciones712;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String[] args) {
        int a,b,c;
        String resul;
        System.out.print("Introduce valor de A: ");
        a = new Scanner(System.in).nextInt();
        System.out.print("Introduce valor de B: ");
        b = new Scanner(System.in).nextInt();
        System.out.print("Introduce valor de C: ");
        c = new Scanner(System.in).nextInt();
        Ecuacion ec1 = new Ecuacion(a,b,c);
        resul=ec1.resolverEcuacion();
        System.out.println(resul);
    }
    
}
