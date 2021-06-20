package br.cesed.si.map.chain.exemplo1;

public interface Handler {

	public abstract void setNext(BancoChain forma);
	
	public abstract void efetuarPagamento(IDBancos id) throws Exception;
}
