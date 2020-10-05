package br.unicamp.ic.mc322.lab04.RPG;

public class MagicMissile extends Magia {

	//• Magic Missile. Lanc ̧a tres flechas m ˆ agicas, cada uma causando dois  ́
		//danos no objetivo.
		void JogaMagicMissile(Moveis movel,Moveis objetivo1, Moveis objetivo2, Moveis objetivo3) {
			if(jogaMagia(movel)) {
				objetivo1.pontosVida = objetivo1.pontosVida -2;
				objetivo2.pontosVida = objetivo2.pontosVida -2;
				objetivo3.pontosVida = objetivo3.pontosVida -2;
			}
		}
}
