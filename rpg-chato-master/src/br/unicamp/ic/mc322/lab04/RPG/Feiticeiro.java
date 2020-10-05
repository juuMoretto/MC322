package br.unicamp.ic.mc322.lab04.RPG;

import java.util.ArrayList;

public class Feiticeiro extends Heroi{
	ArrayList<Magia> magias = new ArrayList();

	public Feiticeiro(int x, int y, String nome) {
		super(x, y, "Fe", 1,2,4,6,nome );
		magias.add(new MagicMissile());
		magias.add(new MagicMissile());
		magias.add(new MagicMissile());
		magias.add(new Fireball());
		magias.add(new Teleport());

		
	}
	}
//Feiticeiro. Ataque: 1 dado, defesa: 2 dados, pontos de vida: 4, pon-
//tos de inteligencia: 6. Comec ̧a o jogo com 3 punhais, cada um forne- ˆ

//cendo +1 dado para ataque, mas sao perdidos ap  ̃ os o uso. Comec ̧a o  ́
//jogo com 3 magias magic missile, 1 magia  ́ fireball e 1 magia teleport.