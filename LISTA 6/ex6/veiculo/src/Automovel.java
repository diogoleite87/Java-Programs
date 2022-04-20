public class Automovel extends Veiculo{


    @Override
    public float acelerar(float velocidade) {
        System.out.print("\nAcelerando...");
        System.out.print("\nVelocidade: " + velocidade);
        return 0;
    }

    @Override
    public void parar() {
        System.out.print("\nParando automovel....");
        System.out.print("\nAutomovel parado!");
    }

    public void trocarOleo(float litros) {
         System.out.print("\nEsvaziando Oleo...");
         System.out.print("\nAdicionando: " + litros + "L de Oleo");
         System.out.print("\nOleo trocado!");
    }
}
