import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] temperatura = new double[10];


        System.out.println("Informe os valores das 10 temperaturas:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperatura[i] = entrada.nextDouble();
        }

        System.out.println("Temperaturas acima de 30 graus:");


        for (int i = 0; i < 10; i++) {
            if (temperatura[i] > 30) {
                System.out.println(temperatura[i] + " graus");
            }
        }

        entrada.close();
    }
}






