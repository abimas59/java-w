package solo;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String,Integer> contagemMap;

    public Map<String, Integer> getContagemMap() {
        return contagemMap;
    }

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "contagemMap=" + contagemMap +
                '}';
    }

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem) {
      contagemMap.put(palavra,contagem);
    }
    public void removerPalavra(String palavra) {
        if(!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(int  contagem : contagemMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String,Integer> entry:contagemMap.entrySet()){
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;

    }

    public static void main(String[] args) {
        ContagemPalavras c = new ContagemPalavras();
        c.adicionarPalavra("Abimael",1);
        c.adicionarPalavra("Abimael",2);
        c.adicionarPalavra("Abimael",3);
       // c.removerPalavra("Abimael");
        c.adicionarPalavra("Joao",1);
        System.out.println(c.exibirContagemPalavras());
        System.out.println(c.encontrarPalavraMaisFrequente());
    }
}
