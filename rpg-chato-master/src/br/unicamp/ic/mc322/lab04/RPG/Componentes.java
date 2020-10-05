package br.unicamp.ic.mc322.lab04.RPG;

public abstract class Componentes {
	private String representacaoGrafica;
	 Ponto coordenadas;
	private boolean estaVazio;
	

	public Componentes (int x, int y, String representacao, boolean estaVazio) {
		this.coordenadas = new Ponto(x,y);
		this.representacaoGrafica = representacao;
		this.estaVazio = estaVazio;
	}
	
	public String getRepresentacao() {
		return this.representacaoGrafica;
	}

	public Ponto getCoordenadas() {
		return this.coordenadas;
	}
	public boolean estaVazio() {
		return estaVazio;
	}
	
	public void levaDano(int dano) {
		//faz nada
	}
}