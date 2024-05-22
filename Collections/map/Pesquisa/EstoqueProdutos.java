import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();

    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod,new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }

        }else{
            System.out.println("Estoque vazio");
        }return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro() {
        double maisCaro = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if((p.getPreco()>maisCaro)){
                    produtoMaisCaro = p;
                    maisCaro = p.getPreco();
                }
            }
        }else{
            System.out.println("Lista vazia");
        }return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato() {
        double maisBarato = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco()<maisBarato){
                    produtoMaisBarato = p;
                    maisBarato = p.getPreco();
                }
            }
        }else{
            System.out.println("Lista vazia");
        } return produtoMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double maiorValorQUantidade = Double.MIN_VALUE;
        Produto produtoMaiorValorQtd = null;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if((p.getQuantidade()*p.getPreco())>maiorValorQUantidade){
                    produtoMaiorValorQtd = p;

                }
            }
        }else{
            System.out.println("Lista Vazia");
        }return produtoMaiorValorQtd;
    }

    public static void main(String[] args) {
        EstoqueProdutos e = new EstoqueProdutos();
        e.adicionarProduto(123,"produtoA",10,5);
        e.adicionarProduto(23,"produtob",10,10);
        e.adicionarProduto(13,"produtoc",10,15);
        e.adicionarProduto(12,"produtod",1,20);
        e.adicionarProduto(1223,"produtoe",2,30);
        e.exibirProdutos();
        System.out.println(e.calcularValorTotalEstoque());
        System.out.println(e.obterProdutoMaisCaro());
        System.out.println(e.obterProdutoMaisBarato());
        System.out.println("--------");
        System.out.println(e.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
