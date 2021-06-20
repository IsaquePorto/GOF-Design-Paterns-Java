
public class Main {
	public static void main(String[] args) {
		
		JanelaAbstrata janela = new JanelaAviso(new JanelaIsaqueAdapter());
		janela.desenhar();
		
		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
		
		
		
	}
}
