package br.com.valsonscompany.lib.windows;

import javax.swing.JOptionPane;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.Modal;

public class ModalWindows extends Modal {
	
	public ModalWindows() {
		JOptionPane.showMessageDialog(null, "Ol�, eu sou um modal Windows");
	}

	@Override
	public void setTitle(String title) {
		// TODO c�digo nativo
	}

	@Override
	public void addButton(Button btn) {
		// TODO c�digo nativo
	}

	
	
}
