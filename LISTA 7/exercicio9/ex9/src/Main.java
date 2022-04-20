public class Main {

    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            someMethod(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Um erro ocorreu main!");
            e.printStackTrace();
        }
    }

    public static void someMethod(int a, int b) throws ArithmeticException{

        try {
            someMethod2(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Um erro ocorreu someMethod1!");
            ArithmeticException erro = new ArithmeticException();
            e.printStackTrace();
            throw erro;
        }
    }

    public static void someMethod2(int a, int b) throws ArithmeticException{

        double teste;

        try {
            teste = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Um erro ocorreu someMethod2!");
            ArithmeticException erro = new ArithmeticException();
            e.printStackTrace();
            throw erro;
        }
    }
}
