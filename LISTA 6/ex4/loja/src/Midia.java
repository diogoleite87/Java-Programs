import java.util.Scanner;

public class Midia implements Interface{

    private int codigo;
    private double preco;
    private String nome;
    Scanner ler = new Scanner(System.in);

    public Midia() {

    }

    public Midia(int c, double p, String s) {
        this.codigo = c;
        this.preco = p;
        this.nome = s;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void printDados() {
        String dados = getTipo() + getDetalhes();
        System.out.print(dados);
    }

    @Override
    public String getTipo() {
        return "\nTipo: Midia";
    }

    @Override
    public String getDetalhes() {
        return "\nCodigo: " + getCodigo() +
                "\nPreço: R$" + getPreco() +
                "\nNome: " + getNome();
    }

    @Override
    public void inserirDados() {
        System.out.print("Digite o nome: ");
        setNome(ler.nextLine());
        System.out.print("Digite o codigo: ");
        setCodigo(ler.nextInt());
        System.out.print("Digite o preço: R$");
        setPreco(ler.nextDouble());
    }

}
