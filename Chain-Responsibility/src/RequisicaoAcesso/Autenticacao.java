package RequisicaoAcesso;

public class Autenticacao extends RequisicaoChain {

	public Autenticacao() {
		super(IdUsuarios.autenticacao);
		
	}

	@Override
	protected void efetuaAcesso() {
		System.out.println("Autenticacao confirmada.");
		
	}

}
