
public class JanelaIsaqueAdapter implements JanelaImplementada {
	
	IsaqueSo soIsaque = new IsaqueSo();

	@Override
	public void desenharJanela(String titulo) {
		soIsaque.janelaIsaque(titulo);
		
	}

	@Override
	public void desenharBot�o(String titulo) {
		soIsaque.botaoIsaque(titulo);
		
	}
	
}
