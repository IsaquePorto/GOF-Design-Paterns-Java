package MiniTeste;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Pasta extends ItemAbstract {
	
	public Pasta(String nome) {
		super();
		this.nome = nome;
	}

	private String nome;
	
	private List<ItemAbstract> itens = new ArrayList<ItemAbstract>();
	
	public void imprimir () {
		
		System.out.println(itens.toString());
		
	}
	
	
	
}
