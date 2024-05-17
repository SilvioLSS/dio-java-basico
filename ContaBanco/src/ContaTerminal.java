import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        //Exibir as mensagens para os nossos usuários e obter pela classe Scanner os valores digitados no terminal
        System.out.println("Por favor, insira o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Agora, insira o número de sua conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Agora, insira a agência: ");
        String agencia = sc.nextLine();

        System.out.println("Para finalizar, insira o seu saldo: ");
        double saldo = sc.nextDouble();

        // Exibir a mensagem com as informações inseridas pelo usuário
        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco."));
        System.out.println("Sua agência é ".concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.format("%.2f", saldo)).concat(" já está disponível para saque."));

        // Fechar o scanner
        sc.close();
    }
}
