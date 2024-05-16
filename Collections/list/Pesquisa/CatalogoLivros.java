package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroslist;

    public CatalogoLivros() {
        this.livroslist = new ArrayList<>();
    }

    public  void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livroslist.add(new Livro(titulo, autor, anoPublicacao));
    }
    public  List<Livro> pesquisaPorAutor(String autor) {
        List<Livro>livrosPorAutor = new ArrayList<>();
           if(!livroslist.isEmpty()){

                for (Livro l:livroslist){
                    if(l.getAutor().equalsIgnoreCase(autor)){
                        livrosPorAutor.add(l);
                    }
                }
            }
           return livrosPorAutor;

    }
    public  List pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro>livrosPorIntervalo = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }

        return  livrosPorIntervalo;
    }
    public  Livro pesquisaPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if(!livroslist.isEmpty()){
            for (Livro l : livroslist){
                if((l.getTitulo().equalsIgnoreCase(titulo))){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("livro1","autor1",2020);
        c.adicionarLivro("livro2","autor2",2021);
        c.adicionarLivro("livro3","autor3",2022);
        c.adicionarLivro("livro4","autor4",2023);
        c.adicionarLivro("livro4","autor2",1995);
        System.out.println(c.pesquisaPorTitulo("livro4"));
    }
}
