package br.unicamp.ic.mc322.lab04.RPG;

public class Ponto {
	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	public double distanciaDoisPontos(Ponto ponto2) {
		double distancia = Math.sqrt(Math.pow(this.x-ponto2.getX(), 2)+ Math.pow(this.y-ponto2.getY(), 2));
		return distancia;
	}
	
		
		

}
