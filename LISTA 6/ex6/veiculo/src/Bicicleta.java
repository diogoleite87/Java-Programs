public class Bicicleta extends Veiculo{


    @Override
    public float acelerar(float velocidade) {
        System.out.print("\nAcelerando...");
        System.out.print("\nVelocidade: " + velocidade);
        return 0;
    }

    @Override
    public void parar() {
        System.out.print("\nParando Bicicleta...");
        System.out.print("\nBicileta parada!");
    }
}
