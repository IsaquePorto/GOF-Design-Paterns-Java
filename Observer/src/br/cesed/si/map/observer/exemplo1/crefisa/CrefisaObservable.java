package br.cesed.si.map.observer.exemplo1.crefisa;

import br.cesed.si.map.observer.exemplo1.DevedoresObserver;

public class CrefisaObservable implements DevedoresObserver {

	@Override
	public void novoDevedor(String titular, String contato, double saldo) {
		
		//TODO pegar o contato e oferecer empr�stimo
		//C�DIGO EXCLUSIVO DA CREFISA QUANDO ALGU�M ENTRAR NO NEGATIVO
		System.out.println("ligando pra " + titular);
		System.out.println("No telefone " + contato);
		System.out.println("Pois ele t� com saldo " + saldo);
	}

}
