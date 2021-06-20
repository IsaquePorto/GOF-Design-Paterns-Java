
public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada j) {
		super(j);
	}
	
	@Override
	public void desenhar() {
		desenharJanela("Janela de Dialogo");
		desenharBotão("Botão sim");
		desenharBotão("Botão Não");
		desenharBotão("Botão Cancelar");
	}

}
