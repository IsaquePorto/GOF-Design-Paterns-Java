package ExQuestao1;

public class ContaCorrente extends Conta{

	@Override
	public double calculaTaxa(double montante) {
		
		return montante * 0.10;
	}

}
