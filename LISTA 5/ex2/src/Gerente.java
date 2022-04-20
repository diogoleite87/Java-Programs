public class Gerente extends Empregado{

    private String nomeGerencia;


    public Gerente(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo, salario, matricula);

    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nMatricula: " + getMatricula() +
                "\nNome da Gerencia: " + nomeGerencia +
                "\nValor do Inss: R$" + valorInss();
    }
}
