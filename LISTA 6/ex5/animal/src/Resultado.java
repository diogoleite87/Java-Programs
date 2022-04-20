public class Resultado implements Animal, Ferramentas{


    private String nomeEspecie ; // nome da especie
    private int quantidade ; // quantidade de animais da especie
    private String nomeAnimal; // nome do animal

    public Resultado(String nomeEspecie, int quantidade, String nomeAnimal) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        return new Animal[0];
    }

    @Override
    public String[] classificaEspecies(Animal[] completo) {
        return new String[0];
    }
}
