package ex3;

public class IntegerSet {

    private static final int TAMANHO = 101;

    private boolean array[];

    public IntegerSet() {
        this.array = new boolean[TAMANHO];
    }

    IntegerSet(boolean values[]) {
        this.array = values;
    }

    // retorna a intersecção deste Set com outro
    public IntegerSet intersecction(IntegerSet outro) {
        boolean intersect[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            intersect[i] = this.array[i] && outro.array[i];
        }
        return new IntegerSet(intersect);
    }

    // retorna a união deste Set com outro
    public IntegerSet union(IntegerSet outro) {
        boolean un[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            un[i] = this.array[i] || outro.array[i];
        }
        return new IntegerSet(un);
    }

    public void insertElement(int pos) {
        this.array[pos] = true;
    }

    public void deletElement(int pos) {
        this.array[pos] = false;
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAMANHO; i++) {
            if (this.array[i]) { // número i pertence ao set
                if (sb.length() == 0) {
                    sb.append(i);
                } else {
                    sb.append(" ").append(i);
                }
            }
        }
        return sb.length() == 0 ? "--" : sb.toString();
    }

    // verifica se este set é igual a outro
    public boolean isEqualsTo(IntegerSet outro) {
        for (int i = 0; i < TAMANHO; i++) {
            if (this.array[i] != outro.array[i]) {
                // achei um elemento diferente, os sets não são iguais
                return false;
            }
        }
        return true;
    }
}