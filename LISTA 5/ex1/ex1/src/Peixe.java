public class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(String nome, double peso) {

        super(nome, peso);
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Animal: Peixe\n" +
                "Tipo de Habitat: " + tipoHabitat + "\n" +
                "Nome: " + getNome() + "\n" +
                "Peso: " + getPeso();
    }
}
