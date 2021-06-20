import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Secretaria extends EmpresaAbstract {
	
	private String funcao;
	
	private List<EmpresaAbstract> opcoes = new ArrayList<EmpresaAbstract>();

	public Secretaria(String funcao) {
		this.funcao = funcao;
	}
	
	
}
