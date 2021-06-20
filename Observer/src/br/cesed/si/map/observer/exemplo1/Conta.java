package br.cesed.si.map.observer.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private int agencia;
	
	private int conta;
	
	private double saldo;
	
	private String titular;
	
	private String contato;
	
	private List<DevedoresObserver> interessados = new ArrayList<DevedoresObserver>();
	private List<ClienteVipObsever> interessadosVip = new ArrayList<ClienteVipObsever>();

	public Conta(int agencia, int conta, String titular, String contato) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.contato = contato;
	}

	public void sacar(double montante) {
		saldo -= montante;
		
		if(saldo < 0) { //negativo
			notifyObservers();
		}
	}

	private void notifyObservers() {
		
		for (DevedoresObserver interessado : interessados) {
			interessado.novoDevedor(titular, contato, saldo);
		}
	}
	
	public void depositar(double montante) {		//No momento de depositar vejo se o saldo atingiu 100k
		saldo += montante;
		if(saldo > 100000) {
			notifyObserverVip();
		}
	}
	
	private void notifyObserverVip() {
		for (ClienteVipObsever clienteObserver : interessadosVip) {
			clienteObserver.novoClienteVip(titular, contato, saldo);
		}
	}
	
	public void registarInteressadoVip(ClienteVipObsever interessado) {
		interessadosVip.add(interessado);
	}
	
	public void desregistrarInteressadoVip(ClienteVipObsever interessado) {
		interessadosVip.remove(interessado);
	}
	
	public void desregistrarInteressado(DevedoresObserver interessado) {
		interessados.remove(interessado);
	}
	
	public void registrarInteressado(DevedoresObserver interessado) {
		interessados.add(interessado);
	}


	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
}
