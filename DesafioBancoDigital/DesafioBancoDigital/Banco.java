import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    protected List<Conta> contas;
    
    public Banco() {
        this.contas = new ArrayList();
    }
    public void adicionarConas(Conta conta){
        contas.add(conta);
    }
    public void exibirContas(){
        System.out.println(contas);
    }

    
}
