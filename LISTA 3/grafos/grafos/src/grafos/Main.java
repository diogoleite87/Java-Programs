package grafos;

public class Main {

    public static void main(String[] args) {

        TeoriaGrafo test = new TeoriaGrafo();

        Vertice a = test.addVertice(1);
        Vertice b = test.addVertice(2);
        Vertice c = test.addVertice(3);
        Vertice d = test.addVertice(4);
        Vertice e = test.addVertice(5);

        Aresta ba = test.addAresta(b, a); //2, 1
        Aresta cb = test.addAresta(c, b); //3, 2
        Aresta db = test.addAresta(d, b); //4, 2
        Aresta dc = test.addAresta(d, c); //4, 3
        Aresta ae = test.addAresta(e, a); //5, 1
        Aresta eb = test.addAresta(e, b); //5, 2
        Aresta ed = test.addAresta(e, d); //5, 4




        System.out.println(test);
    }
    
}
