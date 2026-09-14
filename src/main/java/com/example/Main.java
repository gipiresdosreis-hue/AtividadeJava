package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdCliente = 0;

        int nota = 0;
        System.out.print("Informe a nota da avaliação : ");
       
       qtdCliente = entrada.nextInt();


        while (qtdCliente < 10) {
            qtdCliente++;
            System.out.println("Cliente " + qtdCliente + " informe sua nota");
            nota = entrada.nextInt();
            

        }
        System.out.println("Quantidade de clientes que avaliaram : " + qtdCliente);

        
    }
}
