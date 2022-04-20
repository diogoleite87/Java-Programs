import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float Manicure[] = new float[5];
        float maos[] = new float[5];
        float pes[] = new float[5];
        float podologia[] = new float[5];

        for (int i = 0; i < Manicure.length; i++){

            System.out.println("Informe o faturamento da manicure " + (i+1) + " em R$: ");
            System.out.print("Serviço de pés = R$ ");
            pes[i] = ler.nextFloat();
            System.out.print("Serviço de mãos = R$ ");
            maos[i] = ler.nextFloat();
            System.out.print("Serviço de podologia = R$ ");
            podologia[i] = ler.nextFloat();
            Manicure[i] = pes[i] + maos[i] + podologia[i];
            Manicure[i] *= 0.5;

        }

        for (int i = 0; i < Manicure.length; i++) {
            System.out.println("A manicure " + (i+1) + " recebeu = R$ " + Manicure[i]);
        }

    }
}
