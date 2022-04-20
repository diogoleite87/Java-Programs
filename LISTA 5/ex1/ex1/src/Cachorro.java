public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, double peso) {

        super(nome, peso);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal: Cachorro\n" +
                "Raça: " + raca + "\n" +
                "Nome: " + getNome() + "\n" +
                "Peso: " + getPeso();
    }
}
