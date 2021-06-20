package br.cesed.si.map.observer.exemplo1;

public class BradescoPrimeObservable implements ClienteVipObsever {

	@Override
	public void novoClienteVip(String nome, String contato, double saldo) {
		System.out.println("Oferecendo propostas da BradescoPrime para "+nome);
		System.out.println("Ligando para "+contato);
		System.out.println("O cliente está com o saldo de "+saldo);
		
	}

}
