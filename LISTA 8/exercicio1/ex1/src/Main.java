public class Main {

    public static void main(String[] args) {

        AlunoSingleton diogo = AlunoSingleton.GetInstance("Diogo", 8072);
        AlunoSingleton rafael = AlunoSingleton.GetInstance("Rafael", 8070);

        System.out.println(diogo);
        System.out.println(rafael);
    }
}
