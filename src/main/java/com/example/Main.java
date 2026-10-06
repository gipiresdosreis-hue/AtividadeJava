package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] valores = { 4, 7, 8, 11, 16, 20 };
        int contador  = 0;
        for (int i = 0; i < valores.length; i ++){
            if (valores[i] % 2 ==0 ){
                contador++;
            }
        }

        System.out.println("A quantidade de números pares é :  " + contador  );

        entrada.close();
    }
}
