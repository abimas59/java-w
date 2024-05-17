package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
     convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;
        for(Convidado c:convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoARemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoARemover);
    }
    public  int contarConvidados() {
        return convidadoSet.size();
    }
    public  void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();
        System.out.printf("Existem %s convidados dentro do Set de Convidados",c.contarConvidados());
         c.adicionarConvidado("Abimael",1);
        c.adicionarConvidado("João",2);
        c.adicionarConvidado("Convidado",2);
        System.out.println();
        System.out.printf("Existem %s convidados dentro do Set de Convidados",c.contarConvidados());

    }
}
