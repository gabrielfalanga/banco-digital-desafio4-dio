public class Tests {
    public static void main(String[] args) {

        Cliente clienteMaria = new Cliente("Maria");
        Conta contaMaria = new ContaCorrente(clienteMaria);

        Cliente clienteJoao = new Cliente("João");
        Conta contaJoao = new ContaCorrente(clienteJoao);

        contaJoao.exibirSaldo();
        contaJoao.depositar(1000.0);
        contaJoao.exibirSaldo();
        contaJoao.sacar(500.0);
        contaJoao.exibirSaldo();
        contaMaria.exibirSaldo();
        contaJoao.trasferir(300.0, contaMaria);
        contaJoao.exibirSaldo();
        contaMaria.exibirSaldo();
    }
}
