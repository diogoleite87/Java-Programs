package musica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Melodia> listaMelodias = new ArrayList<Melodia>();
        Scanner ler = new Scanner(System.in);
        int n, tipo, mod;

        do{

            System.out.print("Digite qual nota deseja inserir: \n" +
                    "1 - DO\n" +
                    "2 - RE\n" +
                    "3 - MI\n" +
                    "4 - FA\n" +
                    "5 - SOL\n" +
                    "6 - LA\n" +
                    "7 - SI\n");
            tipo = ler.nextInt();

            Melodia musica = new Melodia(tipo);
            musica.setModificador(new Modificador());

            System.out.println("Deseja inserir um modificador:\n" +
                    "1 - Sustenido\n" +
                    "2 - Bemol\n" +
                    "3 - Não");
            mod = ler.nextInt();
            musica.getModificador().setTipo(mod);

            if (mod == 1 || mod == 2) {
                System.out.print("Insira o valor do modificador: ");
                musica.getModificador().setMod(ler.nextFloat());
            }

            System.out.print("Digite a duraçao da nota em segundos: ");
            musica.getModificador().setDuracao(ler.nextFloat());

            listaMelodias.add(musica);

            System.out.print("Deseja inserir mais uma nota:\n" +
                    "1 - Sim\n" +
                    "2 - Não");

            n = ler.nextInt();

        } while (n == 1);

        for (int i = 0; i < listaMelodias.toArray().length; i++) {
            System.out.print(listaMelodias.get(i));
        }
    }
}
