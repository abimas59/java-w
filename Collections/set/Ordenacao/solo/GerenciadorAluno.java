package set.Ordenacao.solo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    Set<Aluno> alunoSet;

    public GerenciadorAluno() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome,long matricula, double media) {
      alunoSet.add(new Aluno(nome,matricula,media));
    }
    public void removerAluno(long matricula) {
        /*Set<Aluno>alunoRemover = new HashSet<>();
        for(Aluno a:alunoSet){
            if(a.getMatricula()==matricula){
                alunoRemover.add(a);
            }
        }alunoSet.removeAll(alunoRemover);
        */
        Aluno alunoParaRemover =null;
        if(!alunoSet.isEmpty()){
            for(Aluno a: alunoSet) {
                if(a.getMatricula()==matricula){
                    alunoParaRemover = a;
                    break;
                }
            } alunoSet.remove(alunoParaRemover);

        }else{
            throw new RuntimeException("O conjunto está vazio");
        }
        if(alunoParaRemover == null) {
            System.out.println("Matricula não encontrada");
        }
    }
    public Set<Aluno> exibirAlunoNome() {
        Set<Aluno> exibirNome = new TreeSet<>(alunoSet);
        return exibirNome;
    }
    public Set<Aluno> exibirAlunoNota() {
        Set<Aluno> exibirNota = new TreeSet<>(new ComparatorNota());
        if(!exibirNota.isEmpty()) {
            exibirNota.addAll(alunoSet);
        }else{
            System.out.println("O conjunto está vazio!");
        }
        return exibirNota;
    }
    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAluno g = new GerenciadorAluno();
        g.adicionarAluno("Abimael",1l,10d);
        g.adicionarAluno("Joao",2l,9d);
        g.adicionarAluno("Pedro",3l,7d);
        g.adicionarAluno("Abimael",1l,8);
        //System.out.println(g.exibirAlunoNota()); nota ok
        //g.exibirAlunos(); exibir alunos ok
        //g.removerAluno(2); remover ok
        g.exibirAlunoNome();
        g.exibirAlunos();
    }
}
