package model;

public class Modelo {

	private String mensagem = "";
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void iniciarMensagem(String nome) {
		this.mensagem = "Oi Java " + nome;
	}
	
}
