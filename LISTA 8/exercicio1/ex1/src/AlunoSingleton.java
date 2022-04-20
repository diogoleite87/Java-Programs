public class AlunoSingleton {

    private static AlunoSingleton instance;
    private String nome;
    private int matricula;

    public AlunoSingleton(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public static AlunoSingleton GetInstance (String nome, int matricula) {
        if (instance == null) {
            instance = new AlunoSingleton(nome, matricula);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
