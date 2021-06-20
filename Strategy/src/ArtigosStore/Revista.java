package Questão1;

public class Revista extends Artigos{
	
	private boolean digital = true;
	
	private double desconto1 = 0.15;
	private double desconto2 = 0.30;
	
	public void promocao(double novoDesconto) {
		if (digital) {
			desconto1 = novoDesconto/100;
		}
		else {
			desconto2 = novoDesconto/100;
		}
	}
	
	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	@Override
	public double porcentagem(double valor) {
		if (digital) {
			return valor * desconto1;
		}
		else {
			return valor * desconto2;
		}
	}
}
