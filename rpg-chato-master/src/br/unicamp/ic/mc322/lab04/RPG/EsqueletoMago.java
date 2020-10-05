package br.unicamp.ic.mc322.lab04.RPG;

public class EsqueletoMago extends Monstro {
	private MagicMissile magia;
	public EsqueletoMago(int x, int y) {
		super(x,y,"EM");
		this.magia = new MagicMissile();
	}
	private void MovimentoEsqueletoMago(Mapa mapa, Heroi heroi) {
		this.MoveAleatorio(mapa);
		if(this.coordenadas.distanciaDoisPontos(heroi.getComponente().coordenadas) == 1) {
			magia.JogaMagicMissile(this, heroi.getComponente(),heroi.getComponente(),heroi.getComponente());
			
		}
		
	}

}
