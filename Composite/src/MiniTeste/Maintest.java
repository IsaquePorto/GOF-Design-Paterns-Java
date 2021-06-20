package MiniTeste;

public class Maintest {
	public static void main(String[] args) {
		
		Pasta pasta1 = new Pasta("Musicas");
		Pasta pasta2 = new Pasta("Estudos");
		
		Arquivo arquivo1 = new Arquivo("Musica 1", 3.2);
		Arquivo arquivo2 = new Arquivo("Musica 2", 3.5);
		Arquivo arquivo3 = new Arquivo("Musica 3", 4.5);
		Arquivo arquivo4 = new Arquivo("Texto 1", 0.5);
		Arquivo arquivo5 = new Arquivo("Texto 2", 0.7);
		
		pasta1.getItens().add(arquivo1);
		pasta1.getItens().add(arquivo2);
		pasta1.getItens().add(arquivo3);
		pasta1.imprimir();
	}
}
