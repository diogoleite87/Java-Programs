import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String aux;
        int escolha;
        Scanner ler = new Scanner(System.in);
        Set<Pessoas> listaNomes = new HashSet<Pessoas>();

        System.out.print("Escolha uma opção:" +
                "\n 1 - Adicionar nome;" +
                "\n 2 - Remover um nome;" +
                "\n 3 - Apagar todos os nomes armazenados;" +
                "\n 4 - Verificar se o nome ja foi armazenado;" +
                "\n 5 - Finalizar: ");

        aux = ler.nextLine();
        escolha = Integer.parseInt(aux);

        while (escolha != 5) {


            if (escolha == 1) {
                System.out.print("\nInsira o nome: ");
                Pessoas nome = new Pessoas(ler.nextLine());

                if (listaNomes.contains(nome)) {
                    System.out.print("\nAviso: Nome ja inserido anteriormente!\n");
                } else {
                    listaNomes.add(nome);
                    System.out.print("\nNome inserido com sucesso!\n");
                }
            } else if (escolha == 2) {
                System.out.print("\nInsira o nome: ");
                Pessoas nome = new Pessoas(ler.nextLine());

                if (!listaNomes.contains(nome)) {
                    System.out.print("Aviso: Nome correspondente inexistente!");
                } else {
                    listaNomes.remove(nome);
                    System.out.print("\nNome removido com sucesso!\n");
                }
            } else if (escolha == 3) {

                listaNomes.removeAll(listaNomes);
                System.out.print("\nLista de nomes limpa com sucesso!\n");

            } else if (escolha == 4) {
                System.out.print("\nInsira o nome: ");
                Pessoas nome = new Pessoas(ler.nextLine());

                if (!listaNomes.contains(nome)) {
                    System.out.print("\nAviso: Nome inxeistente!\n");
                } else {
                    System.out.print("\nAviso: Nome existente!\n");
                }
            } else {
                System.out.print("\nOpção invalida, escolha outra opção!\n");
            }

            System.out.print("\nEscolha uma opção:" +
                    "\n 1 - Adicionar nome;" +
                    "\n 2 - Remover um nome;" +
                    "\n 3 - Apagar todos os nomes armazenados;" +
                    "\n 4 - Verificar se o nome ja foi armazenado;" +
                    "\n 5 - Finalizar e imprimir lista final: ");

            aux = ler.nextLine();
            escolha = Integer.parseInt(aux);
        }

        System.out.print("\n--------------------------\n");
        System.out.print("Lista de nomes: \n");

        for (Pessoas nome : listaNomes) {
            System.out.print(nome.getNome() + "\n");
        }

    }
}
