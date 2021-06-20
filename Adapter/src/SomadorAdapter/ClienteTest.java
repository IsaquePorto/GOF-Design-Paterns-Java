package SomadorAdapter;

public class ClienteTest {
	
	private SomadorEsperado somador;
	
	public ClienteTest(SomadorEsperado somador) {
		this.somador = somador;
	}
	
	public void executar() {
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int soma = somador.somaValor(vetor);
		
		System.out.println("Resultado:"+soma);
	}
}
