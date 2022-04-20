package grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeoriaGrafo {

    List<Vertice> vertices;
    List<Aresta> arestas;

    public TeoriaGrafo() {

        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public Vertice addVertice (int num) {

        Vertice v = new Vertice(num);
        this.vertices.add (v);
        return v;
    }

    public Aresta addAresta (Vertice origem, Vertice destino) {

        Aresta e = new Aresta (origem, destino);

        origem.addAdjacente(destino);
        destino.addAdjacente(origem);

        this.arestas.add(e);
        return e;
    }


    public String toString() {
        String listaAdjacencia = "";

        System.out.println("\nLista de Adjacencia:\n");

        for (Vertice vertice : this.vertices) {
            listaAdjacencia += vertice.num + " -> ";
            for (Vertice adjacente: vertice.adjacentes ) {
                listaAdjacencia += adjacente.num + ", ";
            }

            listaAdjacencia += "\n";
        }

        return listaAdjacencia;
    }

}
