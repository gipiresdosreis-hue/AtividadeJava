package com.example;


public class PROJETO {

        public static long calcularFatorial(int numero) {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            return fatorial;
        }

        public static void main(String[] args) {
            long resultado = calcularFatorial(5);

            System.out.println("O fatorial é: " + resultado);
        }
    }
