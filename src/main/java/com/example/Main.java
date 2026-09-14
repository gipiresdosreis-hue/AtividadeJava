
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorProduto = 0;
        double soma = 0;
        int contador = 0;
        String continuar;

        do {

            System.out.print("Informe o valor do produto: ");

            valorProduto = entrada.nextDouble();

            soma = soma + valorProduto;

            contador++;

            System.out.print("Deseja continuar? (s/n): ");

            entrada.nextLine(); // Limpa o buffer do Scanner

            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("s")
                || continuar.equalsIgnoreCase("sim"));

        System.out.println("Voce comprou " + contador + " itens.");
        System.out.println("A soma dos produtos é: " + soma);

        entrada.close();
    }
}


