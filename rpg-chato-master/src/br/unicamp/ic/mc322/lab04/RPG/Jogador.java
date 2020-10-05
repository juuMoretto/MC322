package br.unicamp.ic.mc322.lab04.RPG;

public class Jogador {
	private Moveis componente;
	public Jogador(int x, int y, String representacao, int pontosVida, int pontosInteligencia) {
		this.componente = new Moveis(x, y, representacao, pontosVida, pontosInteligencia);
	}
	
	public Moveis getComponente() {
		return this.componente;
	}
}
