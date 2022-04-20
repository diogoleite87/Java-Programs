package musica;

import java.util.ArrayList;

public class Musica {

    private String frase;
    private int caracteristica;


    public Musica(String frase, int caracteristica) {

        if (caracteristica == 1) {
            this.frase = frase + "\n !! Refrao !! \n";
        } else if (caracteristica == 2) {
            this.frase = frase + "\n !! (BIS) !!\n";
        } else {
            this.frase = frase;
        }
    }

    @Override
    public String toString() {
        return frase;
    }
}
