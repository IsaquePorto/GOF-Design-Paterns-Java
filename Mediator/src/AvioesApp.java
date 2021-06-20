
public class AvioesApp {
	public static void main(String[] args) {
		
		TorreDeControle torreGuarulhos = new TorreDeControle();
		
		PilotoA boing707 = new PilotoA(torreGuarulhos, "boing707");
		PilotoA airbusA320 = new PilotoA(torreGuarulhos, "airbusA320");
		PilotoB tecoTeco = new PilotoB(torreGuarulhos, "tecoTeco");
		PilotoB embraerLegacy = new PilotoB(torreGuarulhos, "embraerLegacy");
		
		torreGuarulhos.addAviao(boing707);
		torreGuarulhos.addAviao(tecoTeco);
		torreGuarulhos.addAviao(airbusA320);
		torreGuarulhos.addAviao(embraerLegacy);
		
		 //Torre diz a todos os outros que o EmbraerLegacy vai pousar as 14h15
		torreGuarulhos.enviarMensagem("O "+embraerLegacy+" vai pousar as 14h15pm: ",embraerLegacy);
		
	}
}
