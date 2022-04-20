public class IncrementalSingleton {

    private static int count = 0;
    private static IncrementalSingleton instance;

    private int numero;

    public IncrementalSingleton() {
        numero = ++count;
    }

    public static IncrementalSingleton GetInstance () {
        if (instance == null) {
            instance = new IncrementalSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "\nIncrementalSingleton{" +
                "numero=" + numero +
                '}';
    }
}
