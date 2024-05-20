import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
   private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int novoNumero) {
        contatoSet.add( new Contato(nome,novoNumero));
    }
    public  void exibirContados() {
        System.out.println(contatoSet);
    }
    public  Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> nomePesquisado = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                nomePesquisado.add(c);
            }
        }
        return nomePesquisado;
    }
    public  Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contadoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contadoAtualizado = c;
                break;
            }
        }   return  contadoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contatao = new AgendaContatos();
        contatao.adicionarContato("Abimael",999992222);
        contatao.exibirContados();
        contatao.adicionarContato("Abimael",02020);
        contatao.adicionarContato("Abimael Brito",191919);
        contatao.adicionarContato("joao",4040);
        contatao.atualizarNumeroContato("Abimael Brito",6970);
        contatao.exibirContados();
    }
}
