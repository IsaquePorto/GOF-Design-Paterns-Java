package br.com.valsonscompany.lib.ios;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.FabricaAbstrataComponentesGraficos;
import br.com.valsonscompany.lib.Modal;

public class FabricaAbstrataComponentesGraficosIos extends FabricaAbstrataComponentesGraficos {

	@Override
	public Modal criarModal() {
		return new ModalIos();
	}

	@Override
	public Button criarButton() {
		return new ButtonIos();
	}

}
