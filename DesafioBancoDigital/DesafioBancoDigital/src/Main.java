public class Main {
    public static void main(String[] args) {
     //   Conta c = new ContaCorrente(abimael);
        Banco b = new Banco();
        Cliente abimael = new Cliente();
        Cliente joao = new Cliente();
        Conta c2 = new ContaCorrente(abimael);
        Conta cc = new ContaPoupanca(joao);    
        b.adicionarConas(cc);
        b.adicionarConas(c2);
        abimael.setNome("Abimael");
        joao.setNome("João");
        c2.depositar(100);
        c2.transferir(40, cc);
        c2.imprimirExtrato();
        cc.imprimirExtrato();
        b.exibirContas();

        //listar todos cliente pela classe banco
        //lombok ao projeto
    }

}
