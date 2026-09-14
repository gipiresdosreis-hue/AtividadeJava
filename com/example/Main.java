package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double total = 0;

        for (int venda = 1; venda <= 5; venda++) {

            System.out.print("Digite o valor da venda: ");
            double valor = entrada.nextDouble();

            total = total + valor;
        }

        System.out.println("Total das vendas: R$ " + total);
    }
}

