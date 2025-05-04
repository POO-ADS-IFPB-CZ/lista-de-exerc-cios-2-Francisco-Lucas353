package Questão4;

public class ContaCorrente {
    
    private int numero;
    private String titular;
    private float saldo;

    
    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; 
    }


    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para saque.");
        } else if (valor > 10000) {
            System.out.println("Limite de saque por operação é $10.000,00.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de $" + valor + " realizado.");
        }
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para depósito.");
        } else if (valor > 10000) {
            System.out.println("Limite de depósito por operação é $10.000,00.");
        } else {
            saldo += valor;
            System.out.println("Depósito de $ " + valor + " realizado.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
