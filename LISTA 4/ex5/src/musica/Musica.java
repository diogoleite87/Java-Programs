package musica;

import java.util.ArrayList;

public class Musica {

    private String frase;
    private String melodia;
    private int caracteristica;


    public Musica(String frase, int caracteristica, String melodia) {

        if (caracteristica == 1) {
            this.frase = frase + "\n !! Refrao !!";
            this.melodia = melodia + " ";
        } else if (caracteristica == 2) {
            this.frase = frase + "\n !! (BIS) !!";
            this.melodia = melodia + " ";
        } else {
            this.frase = frase;
            this.melodia = melodia + " ";
        }
    }


    @Override
    public String toString() {
        return frase + "\n" + "Melodia da frase: " + melodia +"\n";
    }
}
