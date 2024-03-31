import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        String nome, agencia;
        int numero;
        double saldo;

        System.out.println("Por favor digite o número da Agência");
        agencia = t.next();
        System.out.println("Qual seu nome?");
        nome = t.next();
        System.out.println("Digite o número da conta");
        numero = t.nextInt();
        System.out.println("Digite o valor para depósito: ");
        saldo = t.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco,sua agência é: "
        +agencia+", conta: "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
        t.close();
    }
}
