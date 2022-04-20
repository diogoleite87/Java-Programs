public class Main {

    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta();
        Automovel automovel = new Automovel();

        automovel.acelerar(80);
        automovel.parar();
        automovel.trocarOleo(80);

        bicicleta.acelerar(30);
        bicicleta.parar();
    }
}
