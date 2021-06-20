package MiniTeste;

public class Arquivo extends ItemAbstract {
	
	public Arquivo(String nome, double tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	private String nome;
	private double tamanho;
	
	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", tamanho=" + tamanho + "]";
	}
	
	

}
