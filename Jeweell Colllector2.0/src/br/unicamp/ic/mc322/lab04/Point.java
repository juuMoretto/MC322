//Point é o sistema de coordenadas
//Ele é bem simples e intuitivo.
//Nem precisava desse comentário
package br.unicamp.ic.mc322.lab04;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public int returnX() {
		return x;
	}
	public int returnY() {
		return y;
	}

}
