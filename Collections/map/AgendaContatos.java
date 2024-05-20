import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else {
            System.out.println("Não há contatos para remover");
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarNome(String nome) {
       if(!agendaContatoMap.isEmpty()){
           agendaContatoMap.get(nome)
       }
    }
}
