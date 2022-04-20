package fabrica.carros.factory;

public class Cliente {

    private String str;

    public Cliente(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }
}
