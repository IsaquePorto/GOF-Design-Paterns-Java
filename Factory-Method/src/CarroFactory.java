
public class CarroFactory {
	
	public static Carro compraCarro (double valor) {
		
		Carro carroSugerido = null;
		
		if(valor < 15000) {
			carroSugerido = new FordKa(12000, "preto", 70000, 2009);
		}else if(valor < 30000) {
			carroSugerido = new Celta(18000, "vermelho", 35000, 2012);
		}else {
			carroSugerido = new Hilux(50000, "Prata", 25000, 2015);
		}
		
		return carroSugerido;
	}
}
