

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe se a peça numero " + i  + " foi produzida: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("Sim")) {
                System.out.println("Peça " + i + " produzida");
            } else {
                System.out.println("Peça não produzida");
            }
        }

        System.out.println("Todas as peças foram registradas!");

        scanner.close();
    }
}

