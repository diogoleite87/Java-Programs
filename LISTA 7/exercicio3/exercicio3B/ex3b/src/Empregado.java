public class Empregado {

    private String nome;
    private int id, data;
    private double salario;

    public Empregado (String nome, int id, int data, double salario) {
        this.nome = nome;
        this.id = id;
        this.data = data;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpregado{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", tempo serviço=" + data +
                ", salario=" + salario +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
