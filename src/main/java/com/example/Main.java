
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] focos = new int[5][5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite a quantidade de focos na posição [" + i + "][" + j + "]: ");
                focos[i][j] = scanner.nextInt();
            }
        }


        int maiorFoco = focos[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (focos[i][j] > maiorFoco) {
                    maiorFoco = focos[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // 4. Exibição do resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println("A região com maior quantidade de focos é a Posição [" + linhaMaior + "][" + colunaMaior + "].");
        System.out.println("Quantidade de focos nessa região: " + maiorFoco);

        scanner.close();
    }
}

