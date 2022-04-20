import java.util.Objects;

public class Produto {

    private String id;
    private String nome;
    private double preco;

    public Produto (String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public boolean equals(Object obj) {
        Produto p = (Produto)obj;
        if (this.getId().equals(p.getId())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\nProduto: " +
                "\nID: " + id +
                "\nNome: " + nome +
                "\nPreço: R$" + preco +"\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
