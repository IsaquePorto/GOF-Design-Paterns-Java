
public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada j) {
		super(j);
	}
	
	@Override
	public void desenhar() {
		desenharJanela("Janela de Dialogo");
		desenharBot�o("Bot�o sim");
		desenharBot�o("Bot�o N�o");
		desenharBot�o("Bot�o Cancelar");
	}

}
