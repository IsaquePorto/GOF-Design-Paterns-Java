
import java.util.Stack;

public class TextoCareTaker {
	
	Stack<ComponenteTexto> estados2 = new Stack<ComponenteTexto>();
	
	public void adicionarEstado (ComponenteTexto novoEstado) {
		estados2.push(novoEstado);
	}
	
	public ComponenteTexto getUltimoEstadoSalvo () {
		estados2.pop();
		return estados2.peek();
	}
}
