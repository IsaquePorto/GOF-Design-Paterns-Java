
public class JanelaIsaqueAdapter implements JanelaImplementada {
	
	IsaqueSo soIsaque = new IsaqueSo();

	@Override
	public void desenharJanela(String titulo) {
		soIsaque.janelaIsaque(titulo);
		
	}

	@Override
	public void desenharBotão(String titulo) {
		soIsaque.botaoIsaque(titulo);
		
	}
	
}
