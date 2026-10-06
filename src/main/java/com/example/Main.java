package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = {8, 7, 9, 10, 6};
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            soma = soma + valores[i];
        }

        media = (double) soma / 5;

        System.out.println("A soma é de: " + soma + " e a média é de: " + media);

        entrada.close();
    }
}

