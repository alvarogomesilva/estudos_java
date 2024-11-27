import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;
        double valor = 0;
        System.out.println("""
                *************************
                Nome: Alvaro Henrique
                Tipo de Conta: Corrente
                Saldo inicial: R$ 0,00 
                *************************
                """);

        while (opcao != 4) {

            System.out.println("""
                
                Operações
                
                1- Consultar saldos
                2- Depositar valor
                3- Sacar Valor
                4- Sair
                """);

            System.out.println("Digite a opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valor = input.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja sacar: ");
                    valor = input.nextDouble();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saldo atualizado R$ "+ saldo);
                    } else {
                        System.out.println("O saque é maior que o valor!");
                    }
                    break;
                default:
                    break;

            }
        }
    }
}
