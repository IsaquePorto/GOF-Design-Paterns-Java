package Questão1;

public abstract class Artigos {
	
	private double valor;
	public abstract double porcentagem(double valorProduto);
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public final double calcularDesconto() {
		return valor - porcentagem(valor);
	}
	
	
}
