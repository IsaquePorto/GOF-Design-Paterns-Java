import lombok.Data;

@Data
public class Pessoa extends EmpresaAbstract{

	public Pessoa(String nome, String funcao) {
		super();
		this.nome = nome;
		this.funcao = funcao;
	}
	private String nome;
	private String funcao;
	
}
