package desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{

    private LocalDate data;

    public Mentoria() {
        this.data = LocalDate.now();
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return  XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +"Titulo"+getTitulo()
                +"Descrição"+getDescricao()+
                '}';
    }
}
