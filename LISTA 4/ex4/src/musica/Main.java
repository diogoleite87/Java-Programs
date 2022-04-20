package musica;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String palavra;
        String conjuntoPalavras = "";
        int duracao, caracteristica, parar;
        ArrayList<Musica> listaFrases = new ArrayList<Musica>();
        Scanner ler = new Scanner(System.in);

        do {
            do {

                System.out.print("Digite a palavra que deseja adicionar na frase: ");
                palavra = ler.nextLine();

                System.out.print("Digite o intervalo da palavra: ");
                duracao = ler.nextInt();

                conjuntoPalavras += palavra + "(" + duracao + "s) ";

                System.out.println("Deseja adicionar mais alguma palavra:\n 1 - Sim \n 2 - Não");
                parar = ler.nextInt();

            } while (parar != 2);

            System.out.println("Deeseja inserir alguma caracteristica na frase escrita: \n 1 - Refrao\n 2 - BIS \n 3 - Nada");
            caracteristica = ler.nextInt();

            Musica frase = new Musica(conjuntoPalavras, caracteristica);
            listaFrases.add(frase);

            conjuntoPalavras = "";

            System.out.println("Deseja adicionar mais alguma frase:\n 1 - Sim \n 2 - Não");
            parar = ler.nextInt();

        } while (parar != 2);


        for (int i = 0; i < listaFrases.toArray().length; i++) {
            System.out.println(listaFrases.get(i));
        }
    }
}
