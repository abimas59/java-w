import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
Map<LocalDate,Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome,atracao);
        eventosMap.put(data,new Evento(nome,atracao));
    }
    public void exibirAgenda() {
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public  void proximoEvento() {
      LocalDate dataAAtual = LocalDate.now();
      LocalDate proximaData = null;
      Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //for(var entry : eventosMap.entrySet()){} ou o de baixo
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAAtual)|| entry.getKey().isAfter(dataAAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+proximoEvento+"acontecerá na data: "+proximaData);
                break;
            }
        }

    }


    public static void main(String[] args) {
        AgendaEventos a = new AgendaEventos();
        a.adicionarEvento(LocalDate.of(2000, Month.JULY,25) ,"evento 3","atracao 3");
        a.adicionarEvento(LocalDate.of(2024, Month.JULY,15), "evento 1","atracao 1");
        a.adicionarEvento(LocalDate.of(2025, Month.JULY,05) ,"evento 2","atracao 2");

        a.proximoEvento();
    }
}
