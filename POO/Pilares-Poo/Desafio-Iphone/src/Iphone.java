public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina na internet");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Criando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
       System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando musica ");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
            System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando Correio de Voz");
    }

}
