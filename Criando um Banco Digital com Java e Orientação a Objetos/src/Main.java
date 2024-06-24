import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nOlá, seja bem-vindo ao nosso banco!");
        
        System.out.printf("\n\nEscolha a operação que deseja realizar: \n1 - Depositar \n2 - Sacar \n3 - Transferir \n4 - Imprimir extrato da Conta Corrente \n5 - Imprimir extrato da Conta Poupança\n");
        int option = scan.nextInt();

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupaca contaPoupanca = new ContaPoupaca();

        switch (option) {
            case 1:
                System.out.printf("\n\nInsira o valor que deseja depositar: ");
                double valorDeposito = scan.nextDouble();
                contaCorrente.depositar(valorDeposito);
                System.out.println("Valor depositado: " + valorDeposito);
                break;
            case 2:
                System.out.printf("\n\nInsira o valor que deseja sacar: ");
                double valorSaque = scan.nextDouble();
                contaCorrente.sacar(valorSaque); 
                System.out.println("Valor sacado: " + valorSaque);
                break;
            case 3: 
                System.out.printf("\n\nInsira o valor que deseja transferir: ");
                double valorTransferencia = scan.nextDouble();
                System.out.println("Valor transferido: " + valorTransferencia);
                break;
            case 4: 
                contaCorrente.imprimirExtrato();
                break;
            case 5: 
                contaPoupanca.imprimirExtrato();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scan.close();
    }
}
