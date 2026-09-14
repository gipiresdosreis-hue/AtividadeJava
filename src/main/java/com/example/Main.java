
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String resposta;

        for (int contador = 1; contador <= 10; contador++) {

            System.out.print("Há o participante " + contador + "? (sim/não): ");
            resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Participante " + contador + " registrado!");
            }
        }

        entrada.close();
    }
}




