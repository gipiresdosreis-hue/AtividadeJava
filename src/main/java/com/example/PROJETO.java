package com.example;

import java.util.Scanner;

public class PROJETO {

        static Scanner entrada = new Scanner(System.in);
        static String[][] usuarios = new String[100][3];
        static int quantidade = 0;

        public static void main(String[] args) {
            int opcao;

            do {
                System.out.println(" MENU DE USUÁRIOS");
                System.out.println("1 - Cadastrar Usuário");
                System.out.println("2 - Consultar Usuários");
                System.out.println("3 - Atualizar Usuário");
                System.out.println("4 - Deletar Usuário");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarUsuario();
                        break;

                    case 2:
                        consultarUsuarios();
                        break;

                    case 3:
                        atualizarUsuario();
                        break;

                    case 4:
                        deletarUsuario();
                        break;

                    case 0:
                        System.out.println("Programa encerrado!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

            entrada.close();
        }

        public static void cadastrarUsuario() {
            if (quantidade >= usuarios.length) {
                System.out.println("Limite de usuários atingido!");
                return;
            }

            System.out.print("Digite o nome: ");
            usuarios[quantidade][0] = entrada.nextLine();

            System.out.print("Digite a idade: ");
            usuarios[quantidade][1] = entrada.nextLine();

            System.out.print("Digite o e-mail: ");
            usuarios[quantidade][2] = entrada.nextLine();

            quantidade++;

            System.out.println("Usuário cadastrado com sucesso!");
        }

        public static void consultarUsuarios() {
            if (quantidade == 0) {
                System.out.println("Nenhum usuário cadastrado.");
                return;
            }

            System.out.println(" USUÁRIOS CADASTRADOS");
            System.out.printf("%-5s %-20s %-10s %-30s%n",
                    "Nº", "NOME", "IDADE", "E-MAIL");

            for (int i = 0; i < quantidade; i++) {
                System.out.printf("%-5d %-20s %-10s %-30s%n",
                        i + 1,
                        usuarios[i][0],
                        usuarios[i][1],
                        usuarios[i][2]);
            }
        }

        public static void atualizarUsuario() {
            if (quantidade == 0) {
                System.out.println("Nenhum usuário para atualizar.");
                return;
            }

            consultarUsuarios();

            System.out.print("Digite o número do usuário que deseja atualizar: ");
            int numero = entrada.nextInt();
            entrada.nextLine();

            if (numero < 1 || numero > quantidade) {
                System.out.println("Número inválido!");
                return;
            }

            int indice = numero - 1;

            System.out.print("Digite o novo nome: ");
            usuarios[indice][0] = entrada.nextLine();

            System.out.print("Digite a nova idade: ");
            usuarios[indice][1] = entrada.nextLine();

            System.out.print("Digite o novo e-mail: ");
            usuarios[indice][2] = entrada.nextLine();

            System.out.println("Usuário atualizado com sucesso!");
        }

        public static void deletarUsuario() {
            if (quantidade == 0) {
                System.out.println("Nenhum usuário para deletar.");
                return;
            }

            consultarUsuarios();

            System.out.print("Digite o número do usuário que deseja deletar: ");
            int numero = entrada.nextInt();
            entrada.nextLine();

            if (numero < 1 || numero > quantidade) {
                System.out.println("Número inválido!");
                return;
            }

            int indice = numero - 1;

            for (int i = indice; i < quantidade - 1; i++) {
                usuarios[i] = usuarios[i + 1];
            }

            quantidade--;
            usuarios[quantidade] = new String[3];

            System.out.println("Usuário deletado com sucesso!");
        }
    }


