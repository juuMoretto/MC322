package br.unicamp.ic.mc322.lab04.RPG;

public class SimpleHeal extends Magia {
	//Simple Heal. Cura um valor de 1 a 6 pontos vida (dado de 6 faces).
		void JogaSimpleHeal(Moveis movel) {
			if(jogaMagia(movel)) {
				Dado dado = new Dado();
				movel.pontosVida = movel.pontosVida + dado.DadoVermelho();
			}
		}

}
