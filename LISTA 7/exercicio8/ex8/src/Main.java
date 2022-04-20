import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        teste();
    }

    public static void teste() throws RuntimeException{
        try {
            new java.io.FileInputStream("homem-aranha-semvoltapracasa.mp4");
        } catch (RuntimeException | FileNotFoundException e) {
            System.out.println("Arquivo nao existe!");
            e.printStackTrace();
        }
    }

}
