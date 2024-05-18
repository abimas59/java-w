package set.solo;

import set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> unicWorlds;

    public ConjuntoPalavrasUnicas(Set<String> unicWorlds) {
        this.unicWorlds = unicWorlds;
    }

    public ConjuntoPalavrasUnicas() {
        this.unicWorlds = new HashSet<>();
    }

    public Set<String> getUnicWorlds() {
        return unicWorlds;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "unicWorlds=" + unicWorlds +
                '}';
    }

    public  void adicionarPalavra(String palavra) {
        unicWorlds.add(new String(palavra));

    }
    public  void removerPalavra(String palavra) {
        String palavraRemover = null;
        for(String p:unicWorlds){
            if(palavra.equalsIgnoreCase(p)) {
                palavraRemover = p;

            }
        }unicWorlds.remove(palavraRemover);

    }
    public  boolean verificarPalavra(String palavra) {
       return unicWorlds.contains(palavra);

    }
    public  void exibirPalavrasUnicas() {
        System.out.println(unicWorlds);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();
        c.adicionarPalavra("Abimael");
        c.adicionarPalavra("Abimael");
        c.adicionarPalavra("Joao");
        c.adicionarPalavra("Pedro");
        c.exibirPalavrasUnicas();
        c.removerPalavra("Pedro");
        System.out.println(c.verificarPalavra("Abimael"));
        c.exibirPalavrasUnicas();
    }
}
