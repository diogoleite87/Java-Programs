public class Vendedor extends Empregado{

    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo, salario, matricula);

    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Vendedor: " +
                "\nNome: " + getNome() +
                "\nSalario: " + getSalario() +
                "\nValor das Vendas: R$" + valorVendas +
                "\nQuantidade de Vendas: " + qntVendas;
    }
}
