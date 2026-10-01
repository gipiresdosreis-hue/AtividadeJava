package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade = 0;
        double saldo = 0.0;
        int opcao = 0;
        double deposito = 0.0;
        double saque = 0.0;

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Informe seu saldo inicial: ");
        saldo = entrada.nextDouble();

        System.out.println("===== BANCO JAVA =====");

        do {

            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Mostrar informações");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = entrada.nextInt();

            if (opcao == 1) {

                System.out.println("Você selecionou a opção de consultar saldo.");
                System.out.println("Seu saldo atual é de R$ " + saldo);

            } else if (opcao == 2) {

                System.out.println("Você selecionou a opção de realizar um depósito.");
                System.out.println("Qual valor deseja depositar?");

                deposito = entrada.nextDouble();

                if (deposito <= 0) {
                    System.out.println("Valor inválido para depósito.");
                } else {
                    saldo = saldo + deposito;

                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                }

            } else if (opcao == 3) {

                System.out.println("Você selecionou a opção de sacar.");
                System.out.println("Qual o valor que deseja sacar?");

                saque = entrada.nextDouble();

                if (saque <= 0) {
                    System.out.println("Valor inválido para saque.");
                } else if (saque > saldo) {
                    System.out.println("Saldo indisponível para saque.");
                } else {
                    saldo = saldo - saque;

                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                }

            } else if (opcao == 4) {

                System.out.println("Suas informações bancárias:");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Saldo: R$ " + saldo);

            } else if (opcao == 5) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida.");

            }

        } while (opcao != 5);

        entrada.close();
    }
}
