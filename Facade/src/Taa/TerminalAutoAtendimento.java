package Taa;

public class TerminalAutoAtendimento {
	
	private AppManipulaçãoGrana appManipulacao = new AppManipulaçãoGrana();
	private AppTransferencia appTransfere = new AppTransferencia();
	
	public void sacar(int agencia, long conta, double valor) {
		appManipulacao.sacar(agencia, conta, valor);
	}
	
	public void depositar(int agencia, long conta, double valor) {
		appManipulacao.depositar(agencia, conta, valor);
	}
	
	public void transferir (int agenciaOrigem, int agenciaDestino, long contaOrigem, long contaDestino, double valor) {
		appTransfere.transferir(agenciaOrigem, agenciaDestino, contaOrigem, contaDestino, valor);
	};
}
