
public class TresPinosAdapter implements Tomada3Pinos {
	
	//ADAPTER
	DoisPinos tomadaDois = new DoisPinos();
	
	@Override
	public void ligar() {
		tomadaDois.turnOn();
		
	}

	@Override
	public void desligar() {
		tomadaDois.turnOff();
		
	}

}
