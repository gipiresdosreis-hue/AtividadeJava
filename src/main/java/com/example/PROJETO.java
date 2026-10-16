package com.example;


public class PROJETO {

    public static int maiorNumero(int num1, int num2, int num3) {
        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        return maior;
    }

    public static void main(String[] args) {
        int resultado = maiorNumero(10, 25, 7);

        System.out.println("O maior número é: " + resultado);
    }
}
