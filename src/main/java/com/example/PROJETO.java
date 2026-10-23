package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PROJETO {

        static Scanner entrada = new Scanner(System.in);


        public static void main(String[] args) {

            String caminhoarquivo = "C://Users//50033949859.SESISENAI.000//Downloads//controle_estoque(Sheet1) (1).csv";

            File arquivo = new File( caminhoarquivo);

            if (arquivo.exists()){
                System.out.println("O arquivo existe. Iniciando a leitura...");
                    try (BufferedReader arquivoBuffer = new BufferedReader( new FileReader(arquivo))){
                        String linha;
                        while((linha = arquivoBuffer.readLine()) != null){
                            String[] campos = linha.split(";");

                            for(String campo : campos) {
                                System.out.println(campo + " | ");
                            }
                        }
                        arquivoBuffer.close();
                    }catch (IOException erro) {
                        System.out.println("Erro na leitura do arquivo" + erro.getMessage() );
                    }
            }else {
                System.out.println("O arquivo não existe");
            }

        }
    }


