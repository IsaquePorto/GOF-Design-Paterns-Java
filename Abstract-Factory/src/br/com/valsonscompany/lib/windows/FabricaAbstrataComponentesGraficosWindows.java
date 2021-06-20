package br.com.valsonscompany.lib.windows;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.FabricaAbstrataComponentesGraficos;
import br.com.valsonscompany.lib.Modal;

public class FabricaAbstrataComponentesGraficosWindows extends FabricaAbstrataComponentesGraficos {

	@Override
	public Modal criarModal() {
		return new ModalWindows();
	}

	@Override
	public Button criarButton() {
		return new ButtonWindows();
	}

}
