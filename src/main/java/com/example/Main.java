package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] valores = { 10, 20, 30, 40, 50};
        int soma = 0;
        for (int i = 0; i < valores.length; i ++){
            soma = soma + valores[i];
        }


        System.out.println("A soma é de: " + soma );

        entrada.close();
    }
}
