
public abstract class JanelaAbstrata {
	
	protected JanelaImplementada janela;
	
	public JanelaAbstrata(JanelaImplementada j) {
		janela = j;
	}
	
	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}
	
	public void desenharBotão(String titulo) {
		janela.desenharBotão(titulo);
	}
	
	public abstract void desenhar();
}
