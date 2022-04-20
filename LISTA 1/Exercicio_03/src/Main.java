
import java.util.Scanner;

public class Main {

    private static int funcaoRecursiva(int n) {


        if(n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return (2 * funcaoRecursiva(n - 1) + 3 * funcaoRecursiva(n - 2));
        }
    }


    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("Digite o valor de 'N': ");
        n = ler.nextInt();

        int F = funcaoRecursiva(n);
        System.out.println("O resultado da função: " + F);

    }

}
