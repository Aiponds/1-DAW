/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cifrado717;

/**
 *
 * @author Victor
 */
public class Cifrado {
    private String codigo = "abcdefghijklmnñopqrstuvwxyz";
    public String codificar(String texto, int n){
        char c1,c2;
        int pos, posCodigo;
        StringBuilder textoModificado = new StringBuilder(texto);
        for (int i = 0; i < texto.length(); i++) {
            c1 = texto.charAt(i);
            // buscamos la letra de texto en codigo
            pos = codigo.indexOf(c1);
            posCodigo = pos-n;
            posCodigo = posCodigo<0 ? Math.abs(posCodigo) : posCodigo;
            if (pos != -1) { // si la letra está en el código
                c2 = codigo.charAt(posCodigo); // calculamos la nueva letra
                textoModificado.setCharAt(i, c2); // reemplazamos la letra original por la nueva
            }
        }
        texto = textoModificado.toString();
        return texto;
    }
}
