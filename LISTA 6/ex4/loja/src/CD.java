import java.util.Scanner;

public class CD extends Midia implements Interface {

    private int nMusicas;
    Scanner ler = new Scanner(System.in);

    public CD() {

    }

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "\nTipo: CD";
    }

    @Override
    public String getDetalhes() {
        return "\nTocando musica 1/" + getnMusicas() + super.getDetalhes() +
                "\nNumero de musicas: " + nMusicas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.print("Digite o numero de musicas: ");
        setnMusicas(ler.nextInt());
    }
}
