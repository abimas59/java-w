package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for (String candidato: candidatos){
            //atender();
            entrandoEmContado(candidato);
        }
        
    }    
    static void entrandoEmContado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas<3);
        if (atendeu) {
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+"tentativas");
        }else{
            System.out.println("Não conseguimos contatos com "+ candidato+"com o máximo de "+tentativasRealizadas+" tentativas");
        }
            
        
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};    
        System.out.println("Imprimindo a lista de candidatos e índice");
        for(int indice=0; indice <candidatos.length;indice++){
            System.out.println("O candidato de nº "+(indice+1)+" é o "+ candidatos[indice]);
        }
        System.out.println("Forma abreviada 'for each' ");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    int candidatosSelecionado = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionado <5 && candidatoAtual<candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();
        System.out.println("O candidato "+ candidato+" Solicitou "+salarioPretendido+" R$ como salário pretendido");
        if (salarioBase > salarioPretendido) {
            System.out.println("O candidato "+ candidato+" foi selecionado para vaga");
            candidatosSelecionado ++;
        }
        candidatoAtual++;
        
        
    }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0,2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("Liga para candidato com contra proposta");
        }
        else {
            System.out.println("Aguardar demais candidatos");
        }
        


    }
}
