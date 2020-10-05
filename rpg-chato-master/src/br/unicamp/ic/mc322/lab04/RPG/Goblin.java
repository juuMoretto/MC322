package br.unicamp.ic.mc322.lab04.RPG;

import java.util.ArrayList;
import java.util.Random;

public class Goblin extends Monstro{
	ArrayList<Armas> armas = new ArrayList();
	private int numeroPunhais;
	public Goblin(int x, int y) {
		super(x,y,"GB");
		Random random = new Random();
		numeroPunhais =  random.nextInt(5) + 1;
		
		for(int i = 1; i<= numeroPunhais; i++) {
			armas.add(new Armas(TipoArma.PUNHAL));
			
		}
		
	}
	//Goblin. A cada turno, tenta se aproximar o quanto mais possÄ±vel
		//a posic Ì§ ` ao atual do her  Ìƒ oi. Quando estiver perto do her oi, o ataca.  Ì�
		//Comec Ì§a o jogo com um certo numero de punhais, para atacar a dist ancia.
		
		
		private void AndaGlobin(Mapa mapa, Heroi heroi) {
			int auxX = this.coordenadas.getX() - heroi.getComponente().coordenadas.getX();
			int auxY = this.coordenadas.getY() - heroi.getComponente().coordenadas.getY();
			if(Math.abs(auxX) < Math.abs(auxY) && auxX!=0) {
				if(this.coordenadas.getX() > heroi.getComponente().coordenadas.getX()) {
					this.MoveEsquerda(mapa);
				}
				else {
					this.MoveDireita(mapa);
				}
				
			}
			else {
				if(this.coordenadas.getY() > heroi.getComponente().coordenadas.getY()) {
					this.MoveBaixo(mapa);
				}
				else {
					this.MoveCima(mapa);
				}
				
			}
		}
		
		private void MoveGoblin(Mapa mapa, Heroi heroi) {
			this.AndaGlobin(mapa, heroi);
			try {
				if(this.coordenadas.distanciaDoisPontos(heroi.getComponente().getCoordenadas())<= armas.get(1).getAlcance() ) {
					heroi.getComponente().levaDano(armas.get(1).getBonusAtaque());
					if(armas.get(1).getDestruicao()) {
						armas.remove(1);
					}
				}
			
		}
			catch(ArrayIndexOutOfBoundsException e) {
				//faz nada
			}
			finally {
				//faz nada
			}
	
	
}}
