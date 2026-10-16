package org.example;


import java.util.Scanner;

public class Main {

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (verificarPar(numero)) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }



        entrada.close();
    }
}




