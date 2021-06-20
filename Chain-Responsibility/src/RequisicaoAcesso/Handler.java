package RequisicaoAcesso;


public interface Handler {

	public abstract void setNext(RequisicaoChain forma);
	
	public abstract void confirmarAcesso(IdUsuarios id) throws Exception;
}
