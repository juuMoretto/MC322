package br.unicamp.ic.mc322.lab04.RPG;

public class Tesouro extends Estaticos {
	private Itens item;
	public Tesouro(int x, int y) {
		super(x,y,"TS",false);
	}
	public Itens getItem() {
		return item;
	}
}
