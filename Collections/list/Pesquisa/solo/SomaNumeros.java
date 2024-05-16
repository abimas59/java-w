package Pesquisa.solo;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();;
    }

    public void adicionarNumero(int numero) {
          this.listaNumeros.add(numero);
    }
    public  int  calcularSoma(){
        int soma = 0;
        for(Integer n:listaNumeros){
            soma += n;
        }
        return  soma;
    }
    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n > maior) {
                    maior = n;
                }
            }
            return maior;
        }else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public  int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n < menor) {
                    menor = n;
                }
            }
            return menor;
        }else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> exibirNumeros(){
        if(!listaNumeros.isEmpty()) {
            List<Integer> listaExibir = new ArrayList<>();
            listaExibir.addAll(listaNumeros);
            return listaExibir;
        }else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros n = new SomaNumeros();

        n.adicionarNumero(10);
        n.adicionarNumero(2);
        n.adicionarNumero(3);

        System.out.println("Comecei");
        System.out.println(n.calcularSoma());
        System.out.println(n.encontrarMaiorNumero());
        System.out.println(n.encontrarMenorNumero());
        System.out.println(n.exibirNumeros());
    }
}
