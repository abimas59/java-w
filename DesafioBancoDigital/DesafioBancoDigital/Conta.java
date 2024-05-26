public class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
        
    }
    

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

        extracted();


    }

    protected  void extracted() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.conta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
