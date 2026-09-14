
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String resposta;

        for (int produto = 1; produto <= 15; produto++) {

            System.out.print("Informe o produto  " + produto + ": " );
            resposta = entrada.nextLine();
        }
        System.out.print("Todos os produtos foram conferidos com sucesso: " );

        entrada.close();
    }
}




