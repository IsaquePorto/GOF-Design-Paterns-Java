package ExQuestao2;

public class LagoaSecaEsperanca implements Trecho{

	private double qtdKm;

	public double getQtdKm() {
		return qtdKm;
	}

	public void setQtdKm(double qtdKm) {
		this.qtdKm = qtdKm;
	}
	
	public LagoaSecaEsperanca(double km) {
		this.qtdKm = km;
	}
}
