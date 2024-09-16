import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Jaqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao;

        do {
            System.out.println("============================");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo Conta: " + tipoConta);
            System.out.println("Saldo inicial: " + saldo);
            System.out.println("============================");
            System.out.println();

            System.out.println("============================");
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar Saldos");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair");
            System.out.println("============================");
            System.out.println();
            System.out.println("Digite a opção");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("====================");
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("====================");
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    double valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("=============================================");
                    System.out.println("Foi recebido: " + valorRecebido);
                    System.out.println("Seu novo saldo é: " + saldo);
                    System.out.println("=============================================");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double valorTransferido = sc.nextDouble();

                    if (valorTransferido > saldo) {
                        System.out.println("=============================================");
                        System.out.println("Saldo insuficiente");
                        System.out.println("=============================================");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("=============================================");
                        System.out.println("Foi transferido:" + valorTransferido);
                        System.out.println("Seu novo saldo é:" + saldo);
                        System.out.println("=============================================");
                    }
                case 4:
                    System.out.println("=============================================");
                    System.out.println("Saindo");
                    System.out.println("=============================================");
                    break;
                default:
                    System.out.println("=============================================");
                    System.out.println("Opção inválida. Tente outra opção");
                    System.out.println("=============================================");
            }
            System.out.println();

        } while (opcao != 4);

        sc.close();
    }
}