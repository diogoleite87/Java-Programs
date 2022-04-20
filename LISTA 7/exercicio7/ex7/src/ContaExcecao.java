public class ContaExcecao extends Exception{

    private String message;
    private double saldoDisponivel;

    public ContaExcecao(String mensagem, double saldo) {
        this.message = mensagem;
        this.saldoDisponivel = saldo;
    }

    @Override
    public String getMessage() {
        String complemento;
        complemento = "\nSaldo disnponivel para saque: " + getSaldoDisponivel();
        return message + complemento;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
}
