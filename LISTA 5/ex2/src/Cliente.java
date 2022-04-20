public class Cliente extends Pessoa{

    private double valorDivida;
    private int anoNascim;

    public Cliente(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
//        this.valorDivida = valorDivida;
//        this.anoNascim = anoNascim;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "\nNome: " + getNome() +
                "\nIdade: " +  getIdade() +
                "\nSexo: " + getSexo() +
                "\nValor da Divida: R$" + getValorDivida() +
                "\nAno de Nascimento: " + getAnoNascim();
    }
}
