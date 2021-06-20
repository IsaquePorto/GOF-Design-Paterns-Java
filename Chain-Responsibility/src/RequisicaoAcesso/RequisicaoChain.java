package RequisicaoAcesso;

public abstract class RequisicaoChain implements Handler{

	protected RequisicaoChain next;
	protected IdUsuarios identificadorUsuario;
	
	public RequisicaoChain (IdUsuarios id){
		next = null;
		identificadorUsuario = id;
	}
	
	public void setNext(RequisicaoChain proximo) {
		if (next == null) {
			next = proximo;
		} else {
			next.setNext(proximo);
		}
	}
	
	public void confirmarAcesso(IdUsuarios id) throws Exception {
		if (podeConfirmarAcesso(id)) {
			efetuaAcesso();
		} else {
			if (next == null) {
				throw new Exception("Usuario nao confirmado");
			}
			next.confirmarAcesso(id);
		}
	}

	private boolean podeConfirmarAcesso(IdUsuarios id) {
		return identificadorUsuario == id;
	}

	protected abstract void efetuaAcesso();
	
}
