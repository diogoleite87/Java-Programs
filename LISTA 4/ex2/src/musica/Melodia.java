package musica;

public class Melodia {

    private Modificador modificador;
    private String nota;

    public Melodia(int tipo) {
        if (tipo == 1) {
            this.nota = "DO";
        } else if (tipo == 2) {
            this.nota = "RÉ";
        } else if (tipo == 3) {
            this.nota = "MI";
        } else if (tipo == 4) {
            this.nota = "FA";
        } else if (tipo == 5) {
            this.nota = "SOL";
        } else if (tipo == 6) {
            this.nota = "LA";
        } else {
            this.nota = "SI";
        }
    }


    public Modificador getModificador() {
        return this.modificador;
    }

    public void setModificador(Modificador modificador) {
        this.modificador = modificador;
    }

    @Override
    public String toString() {

        String aux;

        if (getModificador().getTipo() == 1){
            aux = "Modicador Sustenido: " + getModificador().getMod() + "\n";
        } else if (getModificador().getTipo() == 2) {
            aux = "Modicador Bemol: " + getModificador().getMod() + "\n";
        } else {
            aux = "Nao possui modificador\n";
        }
        return
                "\nNota: " + nota + '\n' + aux +
                "Duração da nota: " + getModificador().getDuracao() + "s\n";
    }
}
