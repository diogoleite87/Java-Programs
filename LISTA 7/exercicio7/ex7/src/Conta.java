public class Conta {

    private double limite;
    private double saldo;

    public Conta() {

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) throws ContaExcecao{
        if (this.saldo < valor) {
            ContaExcecao e = new ContaExcecao("O usuario nao possui saldo para o saque solicitado!", this.saldo);
            throw e;
        } else {
            this.saldo -= valor;
        }
    }
}
