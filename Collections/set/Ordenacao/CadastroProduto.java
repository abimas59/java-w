package set.Ordenacao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome,cod,preco,quantidade));
    }
    public  Set<Produto> exibirProdutoNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return  produtosNome;


    }
    public Set<Produto> exibirProdutoPreco() {
        Set<Produto> exibirPreco = new TreeSet<>(new ComparatorPreco());
        exibirPreco.addAll(produtoSet);
        return exibirPreco;
    }

    public static void main(String[] args) {
        CadastroProduto c = new CadastroProduto();
        c.adicionarProduto(1l,"Abi 1",50f,10);
        c.adicionarProduto(2l,"zaduc 32",20f,120);
        c.adicionarProduto(4l,"Produto 9",53f,3);
        System.out.println(c.exibirProdutoPreco());
        System.out.println(c.produtoSet);
    }
}
