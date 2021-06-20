package SomadorAdapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{
	
	private List<Integer> novaLista = new ArrayList<Integer>();
	
	SomadorExistente somador = new SomadorExistente();
	
	@Override
	public int somaValor(int[] vetor) {

		for (int i : vetor) {
			novaLista.add(i);
		}
		
		return somador.somaLista(novaLista);
	}

}
