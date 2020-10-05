package br.unicamp.ic.mc322.lab04.RPG;


public class Esqueleto extends Monstro {
	private Armas arma;
	public Esqueleto(int x, int y) {
		super(x,y,"EE");
	}
	
	public void moveEsqueleto(Heroi heroi,Mapa mapa) {
		this.MoveAleatorio(mapa);
		//ataca_heroi se tiver perto falta acrescentar aqui isso 
	}
	
	

}
