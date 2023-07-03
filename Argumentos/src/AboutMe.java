import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome? ");
        String nome= scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String sobrenome= scanner.next();

        System.out.println("Qual a sua idade? ");
        int idade= scanner.nextInt();

        System.out.println("Qual sua altura? (cm) ");
        Double altura= scanner.nextDouble();

        //Imprimindo dados

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos." );
        System.out.println("Minha altura é " + altura + "cm.");

  
    }
}
