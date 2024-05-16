package Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listPessoa.add(new Pessoa(altura, idade, nome));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoarPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoarPorIdade);

        return pessoarPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoaPorAltura,new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas  p = new OrdenacaoPessoas();

    }
}

