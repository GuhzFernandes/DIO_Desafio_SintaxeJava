import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String numeroAgencia, nomeCliente;
        int numeroConta;
        double saldoCliente = 0;

        System.out.println("Olá, bem vindo ao sistema do banco ficticio de teste." +
                "\n\nPara iniciarmos a abertura da sua conta no sistema, precisaremos de alguns de seus dados." +
                "\nPor gentileza, insira o numero da sua agencia!" +
                "\nEx: xxx-x");
        numeroAgencia = input.nextLine();

        System.out.println("Digite o numero da sua conta!" +
                "\nEx: xxxxxxxxxx");
        numeroConta = input.nextInt();
        input.nextLine();
        System.out.println("Digite o seu nome!");
        nomeCliente = input.nextLine();

        System.out.println("Agora digite o valor inicial de seu saldo!" +
                "\nex: xxxx.xx");
        saldoCliente = input.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoCliente+" já está disponível para saque!");
        input.close();
    }
}