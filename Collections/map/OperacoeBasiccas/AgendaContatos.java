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
        Integer numeroNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroNome = agendaContatoMap.get(nome);
       }
        return numeroNome;
    }

    public static void main(String[] args) {
        AgendaContatos a = new AgendaContatos();
        a.adicionarContato("Abimael",999999);
        a.adicionarContato("Abimael",888888);
        a.adicionarContato("Joao",333333);
        a.adicionarContato("Pedro",44444);
        //a.removerContato("Joao");
        System.out.println(a.pesquisarNome("Abimael"));
        //a.exibirContatos();
    }
}
