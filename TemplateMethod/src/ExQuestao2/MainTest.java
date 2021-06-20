package ExQuestao2;

public class MainTest {
	public static void main(String[] args) {
		
		LagoaSecaEsperanca novoTrecho = new LagoaSecaEsperanca(16);
		CampinaLagoaSeca novoTrecho2 = new CampinaLagoaSeca(8);
		
		Caminho novoCaminho = new Caminho(0);
		
		novoCaminho.add(novoTrecho);
		novoCaminho.add(novoTrecho2);
		
		System.out.println(novoCaminho.getTrechos());
	}
}
