import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] setor= new double[12];


        System.out.println("Informe o valor de consumo de agua de cada um dos doze setores: " );


        for (int i = 0; i < 10; i++) {
            System.out.print("Consumo de agua " + (i + 1) + ": ");
            setor[i] = entrada.nextDouble();
        }

        System.out.println("Setor que consumiu mais agua :");

        double maior = setor[0];

        for (int i = 1; i < 10; i++) {
            if (setor[i] > maior) {
                maior = setor[i];
            }
        }

        System.out.println(maior);

        entrada.close();
    }
}






