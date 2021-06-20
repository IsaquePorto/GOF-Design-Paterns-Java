
public abstract class Piloto {       //Colleage
	
	protected TorreMediator mediator;
	
	public Piloto(TorreMediator mediator) {
		this.mediator = mediator;
	}
	
	public void enviarMensagem(String mensagem) {
		mediator.enviarMensagem(mensagem, this);
	}
	
	public abstract void receberMensagem(String mensagem);
	
}
