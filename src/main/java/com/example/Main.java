import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] producao = new int[4][12];


        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a produção do Pomar " + (i + 1) + ":");

            for (int j = 0; j < 12; j++) {
                System.out.print("Mês " + (j + 1) + ": ");
                producao[i][j] = scanner.nextInt();
            }
        }

        int maiorProducao = 0;
        int pomarMaior = 0;


        for (int i = 0; i < 4; i++) {
            int totalAnual = 0;

            for (int j = 0; j < 12; j++) {
                totalAnual += producao[i][j];
            }

            System.out.println("Produção anual do Pomar " + (i + 1) + ": " + totalAnual);

            if (totalAnual > maiorProducao) {
                maiorProducao = totalAnual;
                pomarMaior = i + 1;
            }
        }

        System.out.println("O Pomar " + pomarMaior +
                " obteve a maior produção anual: " + maiorProducao);

        scanner.close();
    }
}


