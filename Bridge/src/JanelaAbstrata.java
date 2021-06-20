
public abstract class JanelaAbstrata {
	
	protected JanelaImplementada janela;
	
	public JanelaAbstrata(JanelaImplementada j) {
		janela = j;
	}
	
	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}
	
	public void desenharBot�o(String titulo) {
		janela.desenharBot�o(titulo);
	}
	
	public abstract void desenhar();
}
