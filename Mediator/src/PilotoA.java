
public class PilotoA extends Piloto {    //Um Colleague concreto

	private String aviao;
	
	public PilotoA(TorreMediator mediator, String aviao) {
		super(mediator);
		this.aviao = aviao;
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Torre de controle diz a "+ aviao+ ": " +mensagem);
	}
}