package apps;
public class FacebookMensseger extends ServicoMensagemInstantanea {
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
        
    }
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Facebook ");
    }
    
}
