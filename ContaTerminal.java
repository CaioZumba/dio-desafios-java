import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência!");
        String Agencia = scanner.nextLine();

       
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();
 
        
        System.out.println("Por favor, digite seu nome!");
        String NomeCliente = scanner.nextLine();


        System.out.println ("Por favor, digite seu saldo!");
        Double Saldo = scanner.nextDouble();
        

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso Banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
