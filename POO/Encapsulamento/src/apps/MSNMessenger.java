package apps;
public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn Messenger");
        salvarHistoricoMensagem();
        
    }
    public void receberMensagem() {
        System.out.println("recebendo mensagem Msn Messenger");
    }
    
}
