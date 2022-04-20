import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double aux1;
        String aux2;
        String aux3;
        int aux4;

        System.out.print("Deseja adicionar:\n 1 - Peixe\n 2 - Cachorro\n");
        aux4 = ler.nextInt();

        if (aux4 == 1) {

            System.out.print("Insira o nome do peixe: ");
            aux2 = ler.nextLine();
            aux2 = ler.nextLine();
            System.out.print("Digite o peso do " + aux2 + ": ");
            aux1 = ler.nextDouble();
            System.out.print("Digite o tipo de Habitat do " + aux2 + ": ");
            aux3 = ler.nextLine();
            aux3 = ler.nextLine();
            Peixe peixe = new Peixe(aux2, aux1);
            peixe.setTipoHabitat(aux3);
            System.out.print(peixe);

        } else if (aux4 == 2) {

            System.out.print("Insira o nome do cachorro: ");
            aux2 = ler.nextLine();
            aux2 = ler.nextLine();
            System.out.print("Digite o peso do " + aux2 + ": ");
            aux1 = ler.nextDouble();
            System.out.print("Digite a raça do " + aux2 + ": ");
            aux3 = ler.nextLine();
            aux3 = ler.nextLine();
            Cachorro cachorro = new Cachorro(aux2, aux1);
            cachorro.setRaca(aux3);
            System.out.print(cachorro);
        } else {
            System.out.println("Entrada invalida, tente novamente!");
        }



    }
}
