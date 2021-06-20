package br.com.valsonscompany.lib.android;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.FabricaAbstrataComponentesGraficos;
import br.com.valsonscompany.lib.Modal;

public class FabricaAbstrataComponentesGraficosAndroid extends FabricaAbstrataComponentesGraficos {

	@Override
	public Modal criarModal() {
		return new ModalAndroid();
	}

	@Override
	public Button criarButton() {
		return new ButtonAndroid();
	}
}
