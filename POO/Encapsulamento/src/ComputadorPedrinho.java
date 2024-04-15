import apps.FacebookMensseger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        //não se sabe qual será escolhido
        
        //Telegram tlg = new Telegram();
        
        String appEscolhido = "msn";
        if (appEscolhido == "fb") {
            smi = new FacebookMensseger();
        }
        else if (appEscolhido =="tlg") {
            smi = new Telegram();
        }
        else if (appEscolhido =="msn") {
            smi = new MSNMessenger();
        }

        smi.enviarMensagem();
        

    }
    
}
