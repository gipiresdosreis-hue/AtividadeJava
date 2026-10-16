
import java.util.Scanner;

public class PROJETO {

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean resultado = verificarPar(numero);

        if (resultado) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }

        entrada.close();
    }
}
