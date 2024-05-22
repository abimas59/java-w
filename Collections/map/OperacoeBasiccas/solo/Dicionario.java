package solo;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao) {
      dicionarioMap.put(palavra,definicao);
    }
    public void removerPalavra(String palavra) {

        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else {
            System.out.println("Não há palavras para remover");
        }
    }
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }
    public String pesquisarPalavra(String palavra){
       String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()){
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return  palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.adicionarPalavra("poha","lança pontiaguda");
        d.adicionarPalavra("vulva","Orgão genital feminino");
        d.exibirPalavras();
        d.removerPalavra("poha");
        d.exibirPalavras();
        System.out.println(d.pesquisarPalavra("vulva"));

    }
}
