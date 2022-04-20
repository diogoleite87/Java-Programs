package poligono;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n;
        Scanner ler = new Scanner(System.in);
        ArrayList<Poligono> listaPontos = new ArrayList<Poligono>();

        System.out.print("Digite o numero de coordenadas: ");
        n = ler.nextInt();

        for (int i = 0; i < n; i++){

            Poligono poli = new Poligono();
            poli.setPonto(new Ponto());

            System.out.print("\nDigite o ponto X: ");
            poli.getPonto().setX(ler.nextInt());

            System.out.print("Digite o ponto Y: ");
            poli.getPonto().setY(ler.nextInt());

            listaPontos.add(poli);
        }

        for (int i = 0; i < n; i++){
            System.out.println(listaPontos.get(i));
        }
    }
}
