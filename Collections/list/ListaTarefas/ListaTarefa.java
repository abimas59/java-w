package ListaTarefas;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> terefaList;

    public ListaTarefa() {
        this.terefaList = new ArrayList<>();
    }
    public  void  adicionarTarefa(String descricao) {
        terefaList.add(new Tarefa(descricao));
    }
    public  void removerTarefa(String descricao) {
     List<Tarefa> tarefasParaRemover = new ArrayList<>();
     for(Tarefa t:terefaList){
         if(t.getDescricao().equalsIgnoreCase(descricao)){
             tarefasParaRemover.add(t);
         }
     }
     terefaList.removeAll(tarefasParaRemover);
    }
    public  int obterNumeroTotalTarefas() {
        return terefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(terefaList);
    }

    public static void main(String[] args) {
        ListaTarefa t = new ListaTarefa();

        System.out.println("o numero total de elementos é "+t.obterNumeroTotalTarefas());
        t.adicionarTarefa("Tarefa 1");
        t.adicionarTarefa("Tarefa 1");
        t.adicionarTarefa("Tarefa 2");
        System.out.println("o numero total de elementos é "+t.obterNumeroTotalTarefas());
        t.removerTarefa("Tarefa 2");
        System.out.println("o numero total de elementos é "+t.obterNumeroTotalTarefas());
        t.obterDescricoesTarefas();

    }

}

