import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomecliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();
        System.out.println("Agora digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.println("Qual o valor inicial de depósito? ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá "+ nomecliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia +
        " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
