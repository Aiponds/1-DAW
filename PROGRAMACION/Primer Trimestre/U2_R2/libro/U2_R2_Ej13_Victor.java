import java.util.Scanner;
public class U2_R2_Ej13_Victor { //Victor Stala
    public static void main(String[]args) {
        /*
        En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
        El numero de animales que alimentar (todos la misma especie) es numAnimales,
        y sabemos que cada animal come una media de kilosPorAnimal.
        Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente
        para cada animal. En caso negativo, ha de calcular cual es la racion que corresponde a cada uno de los animales.
        Nota: Evitar que la aplicacion realice divisiones por cero.
        */
        //Variables
        Scanner teclado=new Scanner(System.in);
        int numAnimales;
        float comidaDiaria, comidaNecesaria, kilosPorAnimal, racion;
        //Desarrollo
        //Pedimos todos los datos:
        System.out.println("Voy a determinar si disponemos de alimento suficiente para cada animal.\nIntroduce el numero de animales: ");
        numAnimales=teclado.nextInt();
        System.out.println("Introduce la media de kilos por animal: ");
        kilosPorAnimal=teclado.nextFloat();
        System.out.println("Introduce la comida que tenemos: ");
        comidaDiaria=teclado.nextFloat();

        //Calculamos la comida que necesitamos
        comidaNecesaria=numAnimales*kilosPorAnimal;
        //Comprobamos si tenemos la suficiente comida para hoy, si no tenemos comida o a cuantos kgs le toca a cada animal.
        if(comidaDiaria>=comidaNecesaria)
            System.out.println("Disponemos de la comida necesaria para alimentar a todos hoy.");
        else {
            if(comidaDiaria==0)
                System.out.println("No hay comida para racionarla entre los animales.");
            else {
                racion=comidaDiaria/numAnimales;
                System.out.println("A cada animal le toca comer "+racion+" kgs de comida.");
            }
        }
    }
}