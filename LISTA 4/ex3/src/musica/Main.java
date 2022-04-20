package musica;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nota;
        int duracao, parar;
        ArrayList<Melodia> listaMelodias = new ArrayList<Melodia>();
        Scanner ler = new Scanner(System.in);

        do {
            System.out.print("Digite a nota musical que deseja adicionar: ");
            nota = ler.nextLine();

            System.out.print("Digite a duração do intervalo de tempo da nota musical que deseja adicionar: ");
            duracao = ler.nextInt();


            Melodia musica = new Melodia(nota, duracao);
            listaMelodias.add(musica);

            System.out.println("Deseja adicionar mais uma nota musical?\n 1 - Sim\n 2 - Não");
            parar = ler.nextInt();
            ler.nextLine();

        } while (parar != 2);


        for (int i = 0; i < listaMelodias.toArray().length; i++) {
            System.out.println(listaMelodias.get(i));
        }
    }
}
