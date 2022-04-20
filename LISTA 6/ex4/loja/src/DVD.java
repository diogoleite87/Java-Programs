import java.util.Scanner;

public class DVD extends Midia implements Interface{

    private int nFaixas;
    Scanner ler = new Scanner(System.in);

    public DVD() {

    }

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "\nTipo: DVD";
    }

    @Override
    public String getDetalhes() {
        return "\nImagem do album" + super.getDetalhes() +
                "\nNumero de faixas: " + nFaixas;
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        System.out.print("Digite o numero de faixas: ");
        setnFaixas(ler.nextInt());
    }

}
