import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empregado> lista = new ArrayList<Empregado>();

        Empregado empregadoB = new Empregado("EmpregadoB", 7, 20, 500);
        lista.add(empregadoB);
        Empregado empregadoA = new Empregado("EmpregadoA", 5, 10, 900);
        lista.add(empregadoA);
        Empregado empregadoC = new Empregado("EmpregadoC", 8, 9, 700);
        lista.add(empregadoC);
        Empregado empregadoD = new Empregado("EmpregadoD", 2, 23, 1100);
        lista.add(empregadoD);

        System.out.print("\nEmpregados: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(lista.get(i));
        }

        Collections.sort(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getSalario() > o2.getSalario()) {
                    return 1;
                } else if (o1.getSalario() < o2.getSalario()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        System.out.print("\n\nEmpregados ordem crescente por salario: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(lista.get(i));
        }


        Collections.sort(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                return o1.getNome().toUpperCase().compareTo (o2.getNome().toUpperCase());
            }
        });

        System.out.print("\n\nEmpregados ordem alfabetica: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(lista.get(i));
        }


        Empregado menorSalario = Collections.min(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getSalario() > o2.getSalario()) {
                    return 1;
                } else if (o1.getSalario() < o2.getSalario()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        Empregado maiorSalario = Collections.max(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getSalario() > o2.getSalario()) {
                    return 1;
                } else if (o1.getSalario() < o2.getSalario()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("\n\nEmpregado com menor salario: " + menorSalario);
        System.out.println("\nEmpregado com maior salario: " + maiorSalario);

        Empregado maiorExperiencia = Collections.max(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getData() > o2.getData()) {
                    return 1;
                } else if (o1.getData() < o2.getData()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        Empregado menorExperiencia = Collections.min(lista, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getData() > o2.getData()) {
                    return 1;
                } else if (o1.getData() < o2.getData()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("\n\nEmpregado com menor experiencia: " + menorExperiencia);
        System.out.println("\nEmpregado com maior experiencia: " + maiorExperiencia);
    }
}
