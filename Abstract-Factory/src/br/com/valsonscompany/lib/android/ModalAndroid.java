package br.com.valsonscompany.lib.android;

import javax.swing.JOptionPane;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.Modal;

public class ModalAndroid extends Modal {

	public ModalAndroid() {
		JOptionPane.showMessageDialog(null, "Olá, eu sou um modal Android");
	}
	
	@Override
	public void setTitle(String title) {
		// TODO código nativo
	}

	@Override
	public void addButton(Button btn) {
		// TODO código nativo
	}

	
	
}
