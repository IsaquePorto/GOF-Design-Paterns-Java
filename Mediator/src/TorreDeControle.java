import java.util.ArrayList;
import java.util.List;

public class TorreDeControle implements TorreMediator{ //Concrete mediator 
	
	protected List<Piloto> pilotos ;
	
	public TorreDeControle () {
		pilotos = new ArrayList<Piloto>();
	}
	
	public String addAviao(Piloto piloto) {
		pilotos.add(piloto);
		return "Avião reconhecido";
	}
	
	@Override
	public void enviarMensagem(String mensagem, Piloto colega) {
		for (Piloto piloto : pilotos) {
			if(piloto != colega) {
				piloto.receberMensagem(mensagem);
			}
		}
		
	}
}
