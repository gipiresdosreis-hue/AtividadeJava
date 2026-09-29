import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] talhoes = new double[12];
        double soma = 0;

        System.out.println("Informe a quantidade de hortaliças de cada talhão:");


        for (int i = 0; i < 12; i++) {
            System.out.print("Talhão " + (i + 1) + ": ");
            talhoes[i] = entrada.nextDouble();

            soma = soma + talhoes[i];
        }


        System.out.println("Quantidade de hortaliças de cada talhão:");

        for (int i = 0; i < 12; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + talhoes[i]);
        }


        System.out.println("O total geral é: " + soma);

        entrada.close();
    }
}





