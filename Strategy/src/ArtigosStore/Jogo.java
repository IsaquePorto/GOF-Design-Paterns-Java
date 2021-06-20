package Questão1;

public class Jogo extends Artigos {
	
	private boolean tabuleiro = true;
	
	private double desconto1 = 0.30;
	private double desconto2 = 0;
	
	
	public void promocao(double novoDesconto) {
		if (tabuleiro) {
			desconto1 = novoDesconto/100;
		}
		else {
			desconto2 = novoDesconto/100;
		}
	}
	
	public void setTabuleiro(boolean tipo) {
		this.tabuleiro = tipo;
	}
	
	public boolean isTabuleiro() {
		return this.tabuleiro;
	}
	
	@Override
	public double porcentagem(double valor) {
		if(tabuleiro) {
			return valor * desconto1;
		}
		else {
			return valor * desconto2;
		}
	}

}
