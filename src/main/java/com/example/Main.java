import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] fertilidade = new double[6][6];


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Digite o índice de fertilidade da posição [" + i + "][" + j + "]: ");
                fertilidade[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("MÉDIA DE FERTILIDADE POR LINHA");
        for (int i = 0; i < 6; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 6; j++) {
                somaLinha += fertilidade[i][j];
            }
            double mediaLinha = somaLinha / 6.0;
            System.out.printf("Média da Linha %d: %.2f%n", (i + 1), mediaLinha);
        }

        scanner.close();
    }
}