import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome;
        String sobrenome;
        int idade;
        double altura;

        System.out.println("Digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Digite a sua idadae: ");
        idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
