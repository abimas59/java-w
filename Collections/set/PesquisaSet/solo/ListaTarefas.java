package solo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public  void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));


    }
    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if(!tarefaSet.isEmpty()){
        for(Tarefa t :tarefaSet){
            if(descricao.equalsIgnoreCase(t.getDescricao())){
                tarefaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaRemover);
        }else{
            System.out.println("O contjunto está vazio");
        }
        if(tarefaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }


    }
    public void exibirTarefas() {
            if(!tarefaSet.isEmpty()) {
                System.out.println(tarefaSet);
            }else {
                System.out.println("Tarefa não encontrada");
            }
    }
    public  void contarTarefas() {
        System.out.println(tarefaSet.size());

    }
    public  Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas =new HashSet<>();
        for(Tarefa f : tarefaSet){
            if(f.isConcluida()){
                tarefasConcluidas.add(f);
            }

        }return tarefasConcluidas;

    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa f:tarefaSet){
            if(!f.isConcluida()){
                tarefasPendentes.add(f);
            }
        }return tarefasPendentes;

    }
    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa f:tarefaSet){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                f.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        for(Tarefa f:tarefaSet){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                f.setConcluida(false);
            }
        }

    }
    public void limparListaTarefas() {

        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();
        l.adicionarTarefa("Banhar");
        l.contarTarefas();
        l.adicionarTarefa("Cagar");
        l.exibirTarefas();
        l.marcarTarefaConcluida("Cagar");
        l.marcarTarefaPendente("Banhar");
        l.obterTarefasConcluidas();
        l.obterTarefasPendentes();
        l.contarTarefas();
        l.removerTarefa("Banhar");
        l.exibirTarefas();
        l.limparListaTarefas();
       l.exibirTarefas();
    }
 }
