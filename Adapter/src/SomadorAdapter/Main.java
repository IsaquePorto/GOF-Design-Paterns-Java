package SomadorAdapter;

public class Main {
	public static void main(String[] args) {
		
		SomadorEsperado somador = new SomadorAdapter();
		
		ClienteTest novoCliente = new ClienteTest(somador);
		
		novoCliente.executar();
		
	}
}
