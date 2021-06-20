package RequisicaoAcesso;

public class Log extends RequisicaoChain{

	public Log() {
		super(IdUsuarios.log);
		
	}

	@Override
	protected void efetuaAcesso() {
		System.out.println("Log realizado.");
		
	}

}
