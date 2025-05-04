package Questão4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para saque: ");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

    }
}
