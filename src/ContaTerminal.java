import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sys = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = sys.nextInt();
        sys.nextLine();
        System.out.println("Por favor, digite sua conta com - e o codigo verificador!");
        agencia = sys.nextLine();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = sys.nextLine();

        System.out.println("Digite seu saldo desejado para saque!");
        saldo = sys.nextFloat();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);


    }
}
