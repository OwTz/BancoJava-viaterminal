import java.util.Locale;
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("iniciando processo de criação de conta ");


        System.out.println("digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("digite o número da agência : ");
        String agencia = scan.nextLine();

        System.out.println("digite o número da conta: ");
        int numero = Integer.parseInt(scan.nextLine());

        System.out.println("digite seu saldo: ");
        float valor = Float.parseFloat(scan.nextLine());

        ContaTerminal conta = new ContaTerminal(agencia, numero, nome, valor);
        

    }
}
