import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int escolha;
        Scanner ler = new Scanner(System.in);
        ArrayList<Midia> lista = new ArrayList<Midia>();

        System.out.print("Deseja adicionar:\n 1 - CD\n 2 - DVD\nDigite 1 ou 2: ");
        escolha = ler.nextInt();

        do {
            if (escolha == 1) {
                Midia cd = new CD();
                cd.inserirDados();
                lista.add(cd);
            } else if (escolha == 2) {
                Midia dvd = new DVD();
                dvd.inserirDados();
                lista.add(dvd);
            } else {
                System.out.print("Entrada Invalida!");
            }

            System.out.print("Deseja inserir mais algo: \n 1 - CD\n 2 - DVD\n 3 - Não\nDigite 1, 2 ou 3: ");
            escolha = ler.nextInt();
        } while (escolha != 3);


        for (int i = 0; i < lista.toArray().length; i++) {
            lista.get(i).printDados();
            System.out.print("\n--------------------");
        }
    }

}
