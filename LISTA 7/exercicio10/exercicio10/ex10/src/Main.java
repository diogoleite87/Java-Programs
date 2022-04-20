import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int escolha;
        double a = 0, b = 0;
        double r = 0;
        boolean verificacao = false;

        try {
            System.out.print("Escolha uma operação: \n 1 - Divisão\n 2 - Log10\n  --> ");
            escolha = ler.nextInt();
            if (escolha == 1) {
                Calculator div = new Calculator();
                System.out.print("Insira o numerador: ");
                a = ler.nextDouble();
                System.out.print("Insira o denominador: ");
                b = ler.nextDouble();
                r = div.div(a, b);
                verificacao = true;
            } else if (escolha == 2) {
                Calculator log10 = new Calculator();
                System.out.print("Insira o numero: ");
                a = ler.nextDouble();
                r = log10.log10(a);
                verificacao = true;
            } else {
                InvalidOperationException e = new InvalidOperationException("Escolha invalida!");
                throw e;
            }
        } catch (InvalidOperationException e) {
            System.out.println("\nA operação falhou!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dados invalida!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro inesperado");
            e.printStackTrace();
        }

        if (verificacao) {
            System.out.println("Resultado: " + r);
        } else {
            System.out.println("Nenhum resultado foi obtido.");
        }

    }

}
