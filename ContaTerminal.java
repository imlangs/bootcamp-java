import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numero = sc.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = sc.nextLine();
        
        Locale brasil = new Locale("pt", "BR"); 
        NumberFormat nf = NumberFormat.getCurrencyInstance(brasil);

        System.out.println("Por favor, digite o Saldo:");
        Double saldo = sc.nextDouble();
        String saldoFormatado = nf.format(saldo);
       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        sc.close();
    }
}