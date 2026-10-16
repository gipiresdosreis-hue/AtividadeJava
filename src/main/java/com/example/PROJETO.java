package com.example;


public class PROJETO {

        public static int calcularPotencia(int base, int expoente) {
            int resultado = 1;

            for (int i = 1; i <= expoente; i++) {
                resultado = resultado * base;
            }

            return resultado;
        }

        public static void main(String[] args) {
            int resultado = calcularPotencia(2, 3);

            System.out.println("O resultado da potência é: " + resultado);
        }
    }
