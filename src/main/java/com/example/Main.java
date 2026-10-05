package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] valores = {5,8,40,30,5};
        int soma =0;

        for (int i = 0; i < 5; i++){
            soma = soma + valores[i];
        }
        System.out.println("A soma é de: " + soma );



        entrada.close();
    }
}
