package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] valores = { 12, 45, 8, 90, 23};
        int maior = valores[0];
        for (int i = 0; i < valores.length; i ++){
            if (valores[i] > maior ){
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é :  " + maior  );

        entrada.close();
    }
}
