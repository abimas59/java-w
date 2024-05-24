public class Main {
    public static void main(String[] args) {
     //   Conta c = new ContaCorrente(abimael);
        Cliente abimael = new Cliente();
        Conta c2 = new ContaCorrente(abimael);

        abimael.setNome("Abimael");
        c2.imprimirExtrato();

        //listar todos cliente pela classe banco
        //lombok ao projeto
    }

}
