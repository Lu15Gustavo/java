import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite o numero da conta: ");
        int numconta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero da Agencia: ");
        int numagen = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor de saldo da conta: ");
        double saldo = sc.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %d, conta %d, saldo %.2f ", nome, numagen, numconta, saldo);
        sc.close();
    }
}
