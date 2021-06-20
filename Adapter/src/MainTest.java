
public class MainTest {
	public static void main(String[] args) {
		
		//Jeito errado
		//Tomada3Pinos tomada = (Tomada3pinos) new DoisPinos();
		
		//Jeito certo
		TresPinosAdapter tomadaAdapter = new TresPinosAdapter();
		
		tomadaAdapter.ligar();
		
	}
}
