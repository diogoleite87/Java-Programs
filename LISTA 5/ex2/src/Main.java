import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int escolha;
        String nome;
        int idade;
        String sexo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = ler.nextLine();
        System.out.print("Digite o sexo: ");
        sexo = ler.nextLine();
        System.out.print("Digite a idade: ");
        idade = ler.nextInt();

        System.out.print("Deseja cadastrar como: \n 1 - Cliente\n 2 - Empregdo\n");
        escolha = ler.nextInt();

        if (escolha == 1) {
            double valorDivida;
            int anoNascim;
            System.out.print("Insira o valor da divida: R$");
            valorDivida = ler.nextDouble();
            System.out.print("Insira o ano de nascimento: ");
            anoNascim = ler.nextInt();

            Cliente cliente = new Cliente(nome, idade, sexo);
            cliente.setValorDivida(valorDivida);
            cliente.setAnoNascim(anoNascim);
            System.out.print(cliente);
        } else if (escolha == 2) {

            double salario;
            String matricula;

            System.out.print("Modalidade do empregado: \n 1 - Gerente \n 2 - Vendedor\n");
            escolha = ler.nextInt();

            System.out.print("Digite a matricula: ");
            matricula = ler.nextLine();
            matricula = ler.nextLine();

            System.out.print("Digite o salario: R$");
            salario = ler.nextDouble();

            if (escolha == 1) {

                String nomeGerencia;
                System.out.print("Digite o nome da gerencia: ");
                nomeGerencia = ler.nextLine();
                nomeGerencia = ler.nextLine();

                Gerente gerente = new Gerente(nome, idade, sexo, salario, matricula);
                gerente.setNomeGerencia(nomeGerencia);
                System.out.print(gerente);
            } else if (escolha == 2) {

                double valorVendas;
                int qntVendas;

                System.out.print("Digite o valor de vendas: R$");
                valorVendas = ler.nextDouble();
                System.out.print("Digite a quantidade de vendas: ");
                qntVendas = ler.nextInt();

                Vendedor vendedor = new Vendedor(nome, idade, sexo, salario, matricula);
                vendedor.setQntVendas(qntVendas);
                vendedor.setValorVendas(valorVendas);
                System.out.print(vendedor);
            } else {
                System.out.print("Entrada invalida!");
            }
        } else {
            System.out.print("Entrada invalida!");
        }
    }
}
