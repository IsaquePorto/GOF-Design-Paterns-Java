package RequisicaoAcesso;

public class Autorizacao extends RequisicaoChain{

	public Autorizacao() {
		super(IdUsuarios.autorizacao);
		
	}

	@Override
	protected void efetuaAcesso() {
		System.out.println("Autoriza�ao confirmada.");
		
	}

}
