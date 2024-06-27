public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente("12345-6");
        ContaBancaria contaPoupanca = new ContaPoupanca("78901-2");

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("Saldo da Conta Corrente: R$" + contaCorrente.consultarSaldo());
        System.out.println("Saldo da Conta Poupança: R$" + contaPoupanca.consultarSaldo());
    }
}
