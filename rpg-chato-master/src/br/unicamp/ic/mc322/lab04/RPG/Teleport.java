package br.unicamp.ic.mc322.lab04.RPG;

public class Teleport extends Magia {
	//• Teleport. O heroi ou monstro se desloca para outra posic ̧  ́ ao vis  ̃  ́ıvel.
		void JogaTeleport(Moveis movel, Ponto ponto, Mapa mapa) {
			if(jogaMagia(movel)) {
				if(mapa.componentes[ponto.getX()][ponto.getY()].estaVazio()) {
					mapa.removeComponente(movel);
					movel.coordenadas = ponto;
					mapa.insereMovel(movel);	
				}
				
				
			}
		}

}
