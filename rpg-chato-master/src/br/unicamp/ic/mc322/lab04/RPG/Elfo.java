package br.unicamp.ic.mc322.lab04.RPG;

import java.util.ArrayList;

public class Elfo extends Heroi {
	ArrayList<Armas> armas = new ArrayList();
	ArrayList<Magia> magias = new ArrayList();
	public Elfo(int x, int y, String nome) {
		super(x, y, "El", 2,2,6,4, nome );
		armas.add(new Armas(TipoArma.ESPADA_CURTA));
		magias.add(new SimpleHeal());
	}
}
//Elfo. Ataque: 2 dados, defesa: 2 dados, pontos de vida: 6, pontos de
//inteligencia: 4. Comec ̧a o jogo com uma espada curta, que fornece ˆ
//+2 dados para ataque. Comec ̧a o jogo com uma magia simple heal.