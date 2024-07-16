public abstract class Conta {

    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

//    construtor

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }


//    metodos

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println(this.cliente.getNome() + " sacou R$" + valor);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(this.cliente.getNome() + " depositou R$" + valor);
    }

    public void trasferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
        System.out.println(this.cliente.getNome() + " transferiu R$" + valor + " para " + contaDestino.cliente.getNome());
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + this.cliente.getNome() + ": R$" + this.saldo);
    }

//    getters

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
