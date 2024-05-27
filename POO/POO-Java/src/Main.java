import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setCargaHoraria(60);
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso2.setCargaHoraria(30);
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria Java");

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição BC Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devA = new Dev();
        devA.setNome("Abimael");
        devA.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito"+ devA.getConteudoInscrito());
        devA.progredir();
        devA.progredir();
        devA.progredir();
        System.out.println(devA.calcularXp());
       System.out.println("Conteudo concluido: "+devA.getConteudosConcluido());
        System.out.println("Conteudo inscrito"+ devA.getConteudoInscrito());

        Dev devB = new Dev();
        devB.setNome("David");
        devB.inscreverBootcamp(bootcamp);
        //System.out.println("Conteudo inscrito"+ devB.getConteudoInscrito());
        devB.progredir();
         // devB.progredir();
        System.out.println(devB.calcularXp());
        //devB.progredir();
        //System.out.println("Conteudo concluido: "+devB.getConteudosConcluido());
       // System.out.println("Conteudo inscrito"+ devB.getConteudoInscrito());









    }
}