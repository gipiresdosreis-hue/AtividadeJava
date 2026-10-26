
package com.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PROJETO {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        File arquivolegal = new File("arquivolegal.txt");

        if (arquivolegal.exists()) {
            System.out.println("O arquivo existe. Iniciando a leitura...");

            try (FileReader leitor = new FileReader(arquivolegal)) {
                int letra;

                while ((letra = leitor.read()) != -1) {
                    System.out.print((char) letra);
                }
                System.out.println("");
                System.out.println("Arquivo lido com sucesso!");

            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }

        } else {
            try {
                if(arquivolegal.createNewFile()){
                    System.out.println("Arquivo criado com sucesso");
                }
            } catch (IOException e){
                System.out.println("Não foi possível criar o arquivo");
            }

            System.out.println("Arquivo não encontrado.");
        }

    }
}


