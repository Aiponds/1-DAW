/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victor;

/**
 *
 * @author Victor
 */
public class PruebaMamiferos {
    public static void main(String[] args) {
        //creamos dos objetos mamifero
        Mamiferos mamifero1 = new Mamiferos(Sexo.hembra,"De tierra");
        Mamiferos mamifero2 = new Mamiferos(Sexo.macho, "De agua");
        //1. Crea un objeto de la clase Mamifero y usa .clone() para obtener una copia.
        Mamiferos mamiferoClone = null;
        try {
            mamiferoClone = (Mamiferos) mamifero1.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException){
            System.out.println("fallado.");
        }
        //2. Crea un objeto de la clase Mamifero y usa el constructor copia para obtener una copia del objeto. 
        Mamiferos mamiferoCopia = new Mamiferos(mamifero2);
        System.out.println("Mamifero 1: "+mamifero1.toString());
        System.out.println("Mamifero 2: "+mamifero2.toString());
        System.out.println("Mamifero Copiado: "+mamiferoCopia.toString());
        System.out.println("Mamifero Clonado: "+mamiferoClone.toString());
        // Modifica los atributos en ambos, observa lo que pasa.
        System.out.println("Modifica los atributos en ambos, observa lo que pasa...");
        mamifero1.sexo=Sexo.hermafrodita;
        mamiferoClone.tipo="De tierra";
        mamifero2.sexo=Sexo.hembra;
        mamiferoCopia.tipo="De tierra";
        System.out.println("Mamifero 1: "+mamifero1.toString());
        System.out.println("Mamifero 2: "+mamifero2.toString());
        System.out.println("Mamifero Copiado: "+mamiferoCopia.toString());
        System.out.println("Mamifero Clonado: "+mamiferoClone.toString());
    }
}
