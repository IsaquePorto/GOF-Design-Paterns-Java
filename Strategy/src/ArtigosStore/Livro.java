package Questão1;

public class Livro extends Artigos{
	
	private boolean digital = true;

	private double desconto1 = 0.15;
	private double desconto2 = 0.30;
	
	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	public void promocao(double novoDesconto) {
		if (digital) {
			desconto1 = novoDesconto/100;
		}
		else {
			desconto2 = novoDesconto/100;
		}
	}

	@Override
	public double porcentagem(double valorProduto) {
		if (digital) {
			return valorProduto * desconto1;
		}
		else {
			return valorProduto * desconto2;
		}
	}

}
