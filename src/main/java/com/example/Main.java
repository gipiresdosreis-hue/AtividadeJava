import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matrizChuva = new int[7][4];


                for (int dia = 0; dia < 7; dia++) {
                    for (int area = 0; area < 4; area++) {
                        System.out.print("Digite a chuva do Dia " + (dia + 1) + " para a Área " + (area + 1) + ": ");
                        matrizChuva[dia][area] = scanner.nextInt();
                    }
                }


                for (int area = 0; area < 4; area++) {
                    int totalArea = 0;
                    for (int dia = 0; dia < 7; dia++) {
                        totalArea += matrizChuva[dia][area];
                    }
                    System.out.println("Total de chuva na Área " + (area + 1) + ": " + totalArea + " mm");
                }

                scanner.close();
            }
        }

