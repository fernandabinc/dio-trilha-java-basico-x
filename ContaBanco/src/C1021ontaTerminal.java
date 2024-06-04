import java.util.Locale;
import java.util.Scanner;

public class C1021ontaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
       
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
