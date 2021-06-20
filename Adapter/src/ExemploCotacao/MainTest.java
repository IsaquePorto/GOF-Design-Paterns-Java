package ExemploCotacao;

public class MainTest {
	public static void main(String[] args) {
		
		CotacaoAdapter cotaçaoDolar = new CotacaoAdapter();
		
		cotaçaoDolar.setValor(400);
		
		System.out.println(cotaçaoDolar.getValor());
		
		
	}
}
