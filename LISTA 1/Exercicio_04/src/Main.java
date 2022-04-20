import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float matriz[][] = new float[12][4];
        float soma[] = new float[12];
        float valorFinal = 0;
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < matriz.length; i++){
            System.out.println("Insira a renda relativa ao mes " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Semana " + (j+1) + " = R$  ");
                matriz[i][j] = ler.nextFloat();
                valorFinal += matriz[i][j];
                soma[i] += matriz[i][j];
            }
        }

        System.out.println("Total de venda relativo a cada mes: ");

        for (int i = 0; i < 12; i++) {
            System.out.println("Todal do mes[" + (i+1) + "] = R$  " + soma[i]);
        }

       System.out.println("Vendas de cada semana relativa ao mes: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Mes[" + (i + 1) + "]       ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  |  ");
            }
            System.out.println(" ");
        }

        System.out.println("Total vendido em todo o ano = R$  " + valorFinal);

    }

}
