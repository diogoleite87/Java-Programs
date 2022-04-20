package grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vertice {

    int num;
    List<Vertice> adjacentes;

    public Vertice (int num) {

        this.num = num;
        this.adjacentes = new LinkedList<Vertice>();
    }

    public void addAdjacente (Vertice a) {

        this.adjacentes.add (a);
    }
}
