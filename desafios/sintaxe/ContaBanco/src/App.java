import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        int numero=sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia=sc.nextLine();
        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente=sc.nextLine();
        System.out.println("Por favor, digite o seu Saldo: ");
        float saldo=sc.nextFloat();
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(conta.mensagem());
    }
}
