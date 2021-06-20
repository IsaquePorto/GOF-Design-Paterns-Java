package br.com.valsonscompany.lib.ios;

import javax.swing.JOptionPane;

import br.com.valsonscompany.lib.Button;
import br.com.valsonscompany.lib.Modal;

public class ModalIos extends Modal {
	
	public ModalIos() {
		JOptionPane.showMessageDialog(null, "Olá, eu sou um modal Ios");
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
