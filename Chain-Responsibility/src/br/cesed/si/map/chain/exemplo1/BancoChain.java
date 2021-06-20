package br.cesed.si.map.chain.exemplo1;
public abstract class BancoChain implements Handler {

	protected BancoChain next;
	protected IDBancos identificadorDoBanco;

	public BancoChain(IDBancos id) {
		next = null;
		identificadorDoBanco = id;
	}

	public void setNext(BancoChain proximo) {
		if (next == null) {
			next = proximo;
		} else {
			next.setNext(proximo);
		}
	}

	public void efetuarPagamento(IDBancos id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
		} else {
			if (next == null) {
				throw new Exception("banco não cadastrado");
			}
			next.efetuarPagamento(id);
		}
	}

	private boolean podeEfetuarPagamento(IDBancos id) {
		return identificadorDoBanco == id;
	}

	protected abstract void efetuaPagamento();

}