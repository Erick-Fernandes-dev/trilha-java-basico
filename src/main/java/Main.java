import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();


        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        int numero = sc.nextInt();
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para para saque.");
    }
}
