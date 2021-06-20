package ExQuestao2;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho{
	
	private double qtdKm;

	List<Trecho> trechos = new ArrayList<Trecho>();
	
	public double getQtdKm() {
		return qtdKm;
	}

	public void setQtdKm(double qtdKm) {
		this.qtdKm = qtdKm;
	}

	public Caminho(double km) {
		this.qtdKm = km;
	}
	
	public List<Trecho> getTrechos() {
		return trechos;
	}

	public void setTrechos(List<Trecho> trechos) {
		this.trechos = trechos;
	}

	public void add(Trecho trecho) {
		
		trechos.add(trecho);
	}
}
