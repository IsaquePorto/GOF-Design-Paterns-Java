
public abstract class Carro {

	private double valor;
	private String cor;
	private double km;
	private int ano;
	
	
	public Carro(double valor, String cor, double km, int ano) {
		this.valor = valor;
		this.cor = cor;
		this.km = km;
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
