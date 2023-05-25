/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colores713;

/**
 *
 * @author Victor
 */
public class Colores {
    private String[] paleta;
    public Colores(){
        this.paleta = new String[]{"rojo","verde","amarillo","rosa","morado","lima","purpura"};
    }
    @Override
    public String toString() {
        String cad="";
        for (int i = 0; i < this.paleta.length; i++) {
            cad=cad+this.paleta[i]+"\n";
        }
        return cad;
    }
    public void agregarColor(String color) {
        String[] nuevaPaleta = new String[this.paleta.length + 1];
        for (int i = 0; i < this.paleta.length; i++) {
            nuevaPaleta[i] = this.paleta[i];
        }
        nuevaPaleta[nuevaPaleta.length - 1] = color;
        this.paleta = nuevaPaleta;
    }
    public String[] azar(int n){
        String[] nColores = new String[n];
        int[] numerosGenerados = new int[n];
        int numGenerados = 0;

        for (int i = 0; i < nColores.length; i++){
            int aleatorio = (int)(Math.random() * n + 1);
            boolean generado = false;
            for (int j = 0; j < numGenerados; j++) {
                if (numerosGenerados[j] == aleatorio) {
                    generado = true;
                    break;
                }
            }
            if (generado) {
                i--;
            } else {
                numerosGenerados[numGenerados] = aleatorio;
                numGenerados++;
                nColores[i] = this.paleta[aleatorio - 1];
            }
        }
        return nColores;
    }

}
