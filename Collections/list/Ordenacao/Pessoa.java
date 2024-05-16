package Ordenacao;

import java.util.Comparator;

public class Pessoa  implements Comparable<Pessoa>{
    private  String nome;
    private  int idade;
    private  double altura;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }

    public Pessoa(double altura, int idade, String nome) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}
