import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int matriz90[][] = new int[3][3];

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha " + (i + 1) + ": ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Coluna " + (j + 1) + " = ");
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Sua matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz90[i][j] = matriz[3- j - 1][i];
            }

        }

        System.out.println("Sua matriz com giro de 90: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz90[i][j] + " ");
            }
            System.out.println();
        }

    }
}
