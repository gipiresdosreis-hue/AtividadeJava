import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] fazendas = new double[8];

        System.out.println("Informe a umidade do solo das oito áreas da fazenda:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Umidade da área " + (i + 1) + ": ");
            fazendas[i] = entrada.nextDouble();
        }

        System.out.println("\nÁreas com umidade inferior a 40%:");

        for (int i = 0; i < 8; i++) {
            if (fazendas[i] < 40) {
                System.out.println("Área " + (i + 1) + ": " + fazendas[i] + "%");
            }
        }

        entrada.close();
    }
}






