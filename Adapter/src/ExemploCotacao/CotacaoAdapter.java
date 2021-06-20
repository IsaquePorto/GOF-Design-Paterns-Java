package ExemploCotacao;

public class CotacaoAdapter extends Cotacao{

	@Override
	public void setValor(double valor) {
		super.setValor(valor / 5.73);
		
	}

	@Override
	public double getValor() {
		
		return super.getValor();
	}
	
}
