package br.cesed.si.map.observer.exemplo1.bv;

import br.cesed.si.map.observer.exemplo1.DevedoresObserver;

public class BvObservable implements DevedoresObserver {

	@Override
	public void novoDevedor(String titular, String contato, double saldo) {
		
		//TODO pegar o contato e oferecer empréstimo
		//CÓDIGO EXCLUSIVO DA BV QUANDO ALGUÉM ENTRAR NO NEGATIVO
		System.out.println("ligando pra " + titular);
		System.out.println("No telefone " + contato);
		System.out.println("Pois ele tá com saldo " + saldo);
	}

}
