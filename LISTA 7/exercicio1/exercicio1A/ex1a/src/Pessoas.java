import java.util.Objects;

public class Pessoas {

    private String nome;

    public Pessoas (String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        Pessoas p = (Pessoas)obj;
        if (this.getNome().equals(p.getNome())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
