public class Calculator {

    public Calculator() {

    }

    double div(double a, double b) throws InvalidOperationException {
        if (b == 0) {
            InvalidOperationException e = new InvalidOperationException("Nao existe divisão por denominador 0!");
            throw e;
        }
        return a / b;
    }

    double log10(double a) throws InvalidOperationException{
        return Math.log10(a);
    }
}
