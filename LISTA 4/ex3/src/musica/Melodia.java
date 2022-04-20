package musica;

import java.util.ArrayList;

public class Melodia {

    private String nome;
    private int duracao;


    public Melodia(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nNota: " + nome + "\n" + "Intervalo de tempo: " + duracao;
    }
}
