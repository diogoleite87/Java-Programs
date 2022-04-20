import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tamanho = 50;

        Scanner ler = new Scanner(System.in);

        int estoque[] = new int[tamanho];
        int quantidadeIdeal[] = new int[tamanho];
        String nomePlanta[] = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Cadastre o tipo de planta " + (i+1) + ": ");
            System.out.print("Nome: ");
            nomePlanta[i] = ler.next();
            System.out.print("Quantidade ideal: ");
            quantidadeIdeal[i] = ler.nextInt();
            System.out.print("Estoque: ");
            estoque[i] = ler.nextInt();
        }

        System.out.println("");
        System.out.println("Lista de plantas que estão com estoque inferior ao ideal: ");
        System.out.println("");

        for (int i = 0; i < tamanho; i++) {
            if (quantidadeIdeal[i] > estoque[i]) {
                System.out.println("Planta " + (i+1) + ":");
                System.out.println("Nome: " + nomePlanta[i]);
                System.out.println("Estoque atual: " + estoque[i]);
                System.out.println("Estoque ideal: " + quantidadeIdeal[i]);
                System.out.println("Sera necessario repor: " + (quantidadeIdeal[i] - estoque[i]));
                System.out.println("");
            }
        }
    }
}
