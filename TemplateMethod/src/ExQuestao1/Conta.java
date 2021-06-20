package ExQuestao1;

public abstract class Conta {
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double montante) {
		this.saldo += montante;
	}
	
	public final double sacar(double montante) {
		saldo -= (montante + calculaTaxa(montante));
		System.out.println("Saldo Atual = " + saldo);
		return montante;
	}
	
	public abstract double calculaTaxa(double montante);
}
