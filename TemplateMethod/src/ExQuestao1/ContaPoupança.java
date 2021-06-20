package ExQuestao1;

public class ContaPoupança extends Conta{

	@Override
	public double calculaTaxa(double montante) {
		
		return montante * 0.02;
	}

}
