package br.cesed.si.map.observer.exemplo1;

import br.cesed.si.map.observer.exemplo1.bv.BvObservable;
import br.cesed.si.map.observer.exemplo1.crefisa.CrefisaObservable;

public class Main {

	public static void main(String[] args) {
		
		Conta novaConta = new Conta(1,1,"Abella","(83) 99142-4444");
		
		novaConta.registarInteressadoVip(new BradescoPrimeObservable());
		novaConta.registarInteressadoVip(new BBEstiloObservable());
		novaConta.depositar(50000);
		System.out.println("até aqui Normal");
		
		novaConta.depositar(52000);
		
		
		/**
		Conta novaConta = new Conta(1,1,"Abella","(83) 99142-4444");
		
		novaConta.registrarInteressado(new CrefisaObservable());
		novaConta.registrarInteressado(new BvObservable());
		
		novaConta.registrarInteressado(new DevedoresObserver() {
			
			@Override
			public void novoDevedor(String titular, String contato, double saldo) {
				//TODO pegar o contato e oferecer empréstimo
				//CÓDIGO EXCLUSIVO DA BB CREDIÁRIO QUANDO ALGUÉM ENTRAR NO NEGATIVO
				System.out.println("ligando pra " + titular);
				System.out.println("No telefone " + contato);
				System.out.println("Pois ele tá com saldo " + saldo);
				
			}
		});
		
		novaConta.depositar(100);
		
		System.out.println("até aqui OK");
		
		novaConta.sacar(50);
		
		System.out.println("até aqui OK");
		
		novaConta.sacar(51);
		**/
	}

}
