package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        int aux;
        double total = 0;
        ArrayList<Invoice> lista = new ArrayList<Invoice>();

        do {
            System.out.print("Digite o numero do item: ");
            int numItem = ler.nextInt();

            System.out.print("Digite a descrição do item: ");
            ler.nextLine();
            String descricao = ler.nextLine();

            System.out.print("Digite a quantidade comprada do item: ");
            int quantidade = ler.nextInt();

            System.out.print("Digite o preco unitario do item: ");
            double preco = ler.nextDouble();

            Invoice item = new Invoice(numItem, descricao, quantidade, preco);
            lista.add(item);

            System.out.println("Deseja cadastrar outro item? \n 1 - Sim \n 2 - Nao");
            aux = ler.nextInt();


        } while (aux == 1);

        System.out.println("Itens adicionados: \n");

        for (int x = 0; x < lista.toArray().length; x++){
            System.out.println("Numero do item: " + lista.get(x).getNumItemFaturado());
            System.out.println("Descricao do item: " + lista.get(x).getDescicaoItem());
            System.out.println("Quantidade do item: " + lista.get(x).getQuantidadeItem());
            System.out.println("Preco unitario do item: R$" + lista.get(x).getPrecoItem());
            System.out.println("Total do item: R$" + lista.get(x).getInvoiceAmount()  + "\n\n");

        }

        for (int x = 0; x < lista.toArray().length; x++) {
            total += lista.get(x).getInvoiceAmount();
        }

        System.out.println("Total da fatura: R$" + total);

    }

}
