import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        // Solicita e recebe o número da conta
        System.out.println("Agora, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado

        // Solicita e recebe o nome do cliente
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        // Solicita e recebe o saldo da conta
        System.out.println("Por fim, digite o saldo da conta:");
        double saldo = sc.nextDouble();

        // Mensagem final com as informações inseridas pelo usuário
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Imprime a mensagem final
        System.out.println(mensagemFinal);
    }
}
