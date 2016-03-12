package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Modelo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame {

	private JPanel contentPane;
	private JButton btnMostrarMensagem = new JButton("Mostrar Mensagem");
	private JLabel lblMensagem = new JLabel("");
	private final JPanel painelSuperior = new JPanel();
	private final JTextField txtNome = new JTextField();

	/**
	 * Create the frame.
	 */
	public View() {
		txtNome.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(btnMostrarMensagem, BorderLayout.SOUTH);
		
		contentPane.add(painelSuperior, BorderLayout.NORTH);
		painelSuperior.setLayout(new BorderLayout(0, 0));
		painelSuperior.add(lblMensagem, BorderLayout.NORTH);
		
		painelSuperior.add(txtNome, BorderLayout.SOUTH);
	}
	
	public JButton getBtnMostrarMensagem() {
		return btnMostrarMensagem;
	}
	
	public void atualiza(Modelo modelo) {
		lblMensagem.setText(modelo.getMensagem());
	}
	
	public String getNomeDigitado() {
		return txtNome.getText();
	}
	
	
	
	
	

}
