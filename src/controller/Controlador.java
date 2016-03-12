package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.View;

public class Controlador {

	private View view;
	private Modelo modelo;

	public Controlador(View view, Modelo modelo) {
		this.view = view;
		this.modelo = modelo;
		
		registraAcoes();
	}
	
	private void registraAcoes() {
		view.getBtnMostrarMensagem()
			.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							modelo.iniciarMensagem(view.getNomeDigitado());
							view.atualiza(modelo);
						}
					});
	}
	
	
}
