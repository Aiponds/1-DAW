import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] colors = {"\033[31m", "\033[32m", "\033[33m", "\033[34m", "\033[35m", "\033[36m"};
        String ANSI_RESET = "\033[0m";

        String[][] slotMachine = new String[3][3];
        int balance = 1000;
        boolean play = true;

        while (play && balance > 5) {
            balance -= 5;
            System.out.println("Tirada actual: ");

            // Mostrar el resultado de la tirada en la consola
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    int symbolIndex = random.nextInt(symbols.length);
                    slotMachine[row][col] = symbols[symbolIndex];

                    int colorIndex = symbolIndex % colors.length;
                    System.out.print(colors[colorIndex] + slotMachine[row][col] + ANSI_RESET + " ");
                }
                System.out.println();
            }

            // Comprobar si hay una combinación ganadora en la misma fila o columna
            for (int row = 0; row < 3; row++) {
                if (slotMachine[row][0].equals(slotMachine[row][1]) && slotMachine[row][1].equals(slotMachine[row][2])) {
                    balance += 50;
                    System.out.println("¡Has ganado 50 euros!");
                    break;
                }
            }
            
            for (int col = 0; col < 3; col++) {
                if (slotMachine[0][col].equals(slotMachine[1][col]) && slotMachine[1][col].equals(slotMachine[2][col])) {
                    balance += 50;
                    System.out.println("¡Has ganado 50 euros!");
                    break;
                }
            }

            System.out.println("Balance actual: " + balance + " euros");
            System.out.println();

            // Preguntar al usuario si quiere realizar otra tirada
            System.out.print("¿Quieres hacer otra tirada? (s/n): ");
            String answer = scan.nextLine();
            if (answer.equals("n")) {
                play = false;
            }
        }

        System.out.println("Gracias por jugar! Tu balance final es de 0 euros.");
    }
}