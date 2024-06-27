public abstract class Conta implements ContaBancaria {
    private double saldo;
    private String numeroConta;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    @Override
    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + ((Conta)contaDestino).getNumeroConta() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência não realizada.");
            return false;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
