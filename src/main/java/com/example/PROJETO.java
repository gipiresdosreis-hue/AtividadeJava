package com.example;


public class PROJETO {


        public static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }

        public static void main(String[] args) {
            double resultado = calcularIMC(60.0, 1.65);

            System.out.println("O IMC é: " + resultado);
        }
    }

