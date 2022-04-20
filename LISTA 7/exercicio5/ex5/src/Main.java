import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Eu sei dividir");

        int a = 0, b = 0;
        double r = 0;

        divisao(a, b, r);
    }

    public static double resultado(int a, int b, double r) {
        return a/b;
    }
    public static void divisao(int a, int b, double r) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Informe o primeiro valor: ");
            a = teclado.nextInt();
            System.out.print("Informe o segundo valor: ");
            b = teclado.nextInt();
            System.out.println("Resultado da divisão: " + resultado(a, b, r));

        } catch (ArithmeticException e) {
            System.out.println("Não existe divisão por denominador 0!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dados invalida. Insira novamente!");
            divisao(a, b, r);
        } catch (Exception e) {
            System.out.println("Erro inesperado!");
        }

    }
}
