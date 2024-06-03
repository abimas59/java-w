package terceira.semana.exercicios.prontos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voo {
    private int numero ;
    private Data data;
    private String[] cadeira = new String[100];


    public Voo(int numero, Data data) {
        this.numero = numero;
        this.data = data;

    }
    public int proximoLivre() {
        int cadeiraLivre =0 ;
        for(int i = 0; i <100; i++) {
        if(cadeira[i].isEmpty()){
            cadeiraLivre = i;
            break;

        }
        }
        return cadeiraLivre;
    }
    public void verificr(int num) {
        for(int i = 0; i<100;i++) {
            if(cadeira[num].isEmpty()) {
                System.out.println("Cadeira disponível");
                break;
            }else {
                System.out.println("Assento ocupado");
                break;
            }
        }
    }

    public boolean ocupar(int num) {
        if(cadeira[num].isEmpty()){
            cadeira[num] = "x";
            System.out.println("Reserva efetuada com sucesso");
            return true;
        }else{
            System.out.println("Cadeira já ocupada");
            return false;
        }
    }
    public void vagas() {
        List<String> poltronas = new ArrayList<>();
        Collections.addAll(poltronas, cadeira);
       long numero = poltronas.stream().filter(n->n=="").count();
        System.out.println(numero);
    }
    public  void carregarCadeiras(){
        for (int i = 0 ; i<100; i++){
            cadeira[i] = "";
        }
    }
    public int getVoo(){
        return this.numero;
    }
    public static void main(String[] args) {
        Voo viao = new Voo(157,new Data("19/05/1995"));
        viao.carregarCadeiras();
        viao.proximoLivre();
        viao.verificr(0);
        viao.ocupar(0);
        viao.ocupar(1);
        viao.ocupar(2);
        viao.ocupar(3);
        System.out.println(viao.proximoLivre());
        System.out.println("-------------");
        System.out.println(viao.getVoo());
        System.out.println("--------------");

        viao.vagas();
    }
}
