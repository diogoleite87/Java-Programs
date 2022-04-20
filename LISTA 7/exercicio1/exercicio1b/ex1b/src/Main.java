import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String aux, nome, id;
        int escolha;
        double preco;
        Scanner ler = new Scanner(System.in);
        Set<Produto> listaProduto = new HashSet<Produto>();


        System.out.print("Escolha uma opção:" +
                "\n 1 - Adicionar produto;" +
                "\n 2 - Imprimir lista produto;" +
                "\n 3 - Finalizar: ");

        aux = ler.nextLine();
        escolha = Integer.parseInt(aux);

        while (escolha != 3) {

            if (escolha == 1) {
                System.out.print("Insira um ID: ");
                id = ler.nextLine();
                System.out.print("Insira o nome: ");
                nome = ler.nextLine();
                System.out.print("Insira o preço: R$");
                aux = ler.nextLine();
                preco = Double.parseDouble(aux);

                Produto produto = new Produto(id, nome, preco);

                if (listaProduto.contains(produto)) {
                    System.out.print("\nAviso: Produto/ID ja inserido anteriormente!\n");
                } else {
                    listaProduto.add(produto);
                    System.out.print("\nProduto inserido com sucesso!\n");
                }

            } else if (escolha == 2) {
                for (Produto produto : listaProduto) {
                    System.out.print(produto);
                }
            }  else {
                System.out.print("\nAviso: Opção invalida, digite novamente!\n");
            }

            System.out.print("\nEscolha uma opção:" +
                    "\n 1 - Adicionar produto;" +
                    "\n 2 - Imprimir lista produtos;" +
                    "\n 3 - Finalizar: ");

            aux = ler.nextLine();
            escolha = Integer.parseInt(aux);

        }

        System.out.print("------------------------");
        System.out.println("Lista final de produtos: ");
        for (Produto produto : listaProduto) {
            System.out.print(produto);
        }
    }

}
