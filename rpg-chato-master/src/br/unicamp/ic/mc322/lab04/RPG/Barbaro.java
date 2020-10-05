package br.unicamp.ic.mc322.lab04.RPG;
import java.util.ArrayList;


public class Barbaro extends Heroi {
	ArrayList<Armas> armas = new ArrayList();
	
	public Barbaro(int x, int y, String nome) {
		super(x, y, "Ba", 3,2,8,2,nome );
		armas.add(new Armas(TipoArma.ESPADA_LONGA));
	}
}
//Barbaro. Ataque: 3 dados, defesa: 2 dados, pontos de vida: 8, pontos  ́
//de inteligencia: 2. Comec ̧a o jogo com uma espada longa, que for- ˆ
//nece +3 dados para ataque, mas necessita o uso de ambas as maos.