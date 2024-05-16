package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> compraonline;

    public CarrinhoDeCompras() {
        this.compraonline = new ArrayList<>();
    }

    public  void  adicionarItem(String nome, double preco, int quantidade) {
       // compraonline.add(new Item(nome,preco,quantidade));
        //List<Item> itensCarrinho = new ArrayList<>();
        //itensCarrinho.add(new Item(nome,preco,quantidade));
        Item item = new Item(nome,preco,quantidade);
        this.compraonline.add(item);



    }
    public  void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for(Item itens:compraonline){
            if (itens.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(itens);
            }

        }
        compraonline.removeAll(itensRemover);
    }
    public  double calcularValorTotal() {
        double total = 0;
        for(Item t:compraonline){
            total += (t.getPreco()*t.getQuantidade());
        }
        return  total;


    }
    public  void exibirItens() {
        /*for(Item t:compraonline){
            System.out.println("Nome:"+t.getNome());
            System.out.println("Qtd: "+t.getQuantidade());
            System.out.println("Preço Unitário: "+t.getPreco());
        }*/
        System.out.println(this.compraonline);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarItem("pipoca",5.0f,2);
        c.adicionarItem("pão",10.0f,3);
        System.out.println(c.calcularValorTotal());
        c.exibirItens();
    }
}
