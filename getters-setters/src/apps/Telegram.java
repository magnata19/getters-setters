package apps;
public class Telegram extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico após conversa.");
	}
	
}