public interface ContaBancaria {
    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(double valor, ContaBancaria contaDestino);
    double consultarSaldo();
}
