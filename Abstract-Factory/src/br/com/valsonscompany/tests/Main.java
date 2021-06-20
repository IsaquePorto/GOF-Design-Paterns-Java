package br.com.valsonscompany.tests;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.FabricaAbstrataComponentesGraficos;
import br.com.valsonscompany.lib.Modal;
import br.com.valsonscompany.lib.android.FabricaAbstrataComponentesGraficosAndroid;
import br.com.valsonscompany.lib.ios.FabricaAbstrataComponentesGraficosIos;
import br.com.valsonscompany.lib.windows.FabricaAbstrataComponentesGraficosWindows;

public class Main {

	public static void main(String[] args) {

		FabricaAbstrataComponentesGraficos fabricaAbstrata = new FabricaAbstrataComponentesGraficosIos();
	
		Modal modal = fabricaAbstrata.criarModal();
		
		Button btn = fabricaAbstrata.criarButton();
		
		modal.addButton(btn);
		
		
		
	}

}
