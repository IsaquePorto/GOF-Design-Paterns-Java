import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Setor extends EmpresaAbstract {
	
	private String nome;
	
	private int andar;
	
	private List<EmpresaAbstract> opcoes = new ArrayList<EmpresaAbstract>();
	
	public Setor(String nome, int andar) {
		super();
		this.nome = nome;
		this.andar = andar;
	}

}
