import java.util.*;

public class Main {

    public static void main(String[] args) {

        int menorNumero, maiorNumero, numeroVezes;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {

            int numero = random.nextInt(99);
            numeros.add(numero);
        }

        System.out.print("Numeros sorteados: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(numeros.get(i) + ", ");
        }

        maiorNumero = Collections.max(numeros);
        menorNumero = Collections.min(numeros);
        numeroVezes = Collections.frequency(numeros, menorNumero);

        System.out.println("\nMenor numero: " + menorNumero);
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("O menor numero aparece: " + numeroVezes + " vezes");

        Collections.sort(numeros);

        System.out.print("Numeros em ordem: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(numeros.get(i) + ", ");
        }
    }
}
