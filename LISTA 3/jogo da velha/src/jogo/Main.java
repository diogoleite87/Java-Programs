package jogo;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        int x, y;


        while (!jogo.getFimDoJogo()) {

            System.out.println(jogo);

            do {
                System.out.println("Jogador 1 \nEscolha uma coordenada: ");
                System.out.print("Cordenada x: ");
                x = ler.nextInt();

                System.out.print("Cordenada y: ");
                y = ler.nextInt();

                jogo.Jogador1(x, y);
            } while (!jogo.getCampoValido());

            jogo.setContador(1);
            jogo.verificaVitoria();
            if (jogo.getFimDoJogo()) {
                break;
            }


            System.out.println(jogo);

            do {
                System.out.println("Jogador 2 \nEscolha uma coordenada: ");
                System.out.print("Cordenada x: ");
                x = ler.nextInt();

                System.out.print("Cordenada y: ");
                y = ler.nextInt();

                jogo.Jogador2(x, y);
            } while (!jogo.getCampoValido());

            jogo.setContador(1);
            jogo.verificaVitoria();
            if (jogo.getFimDoJogo()) {
                break;
            }

        }

        System.out.println("Obrigado por jogar! \nTabela final: \n");
        System.out.println(jogo);
    }

}
