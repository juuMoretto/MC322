package br.unicamp.ic.mc322.lab04.RPG;

import java.util.Random;

public class Dado {
	
	public Dado() {
		
	}
	
	public int  DadoVermelho() {
		Random random = new Random();
		return  random.nextInt(5) + 1;
	}
	
	public DadoCombate  DadoCombate() {
		Random random = new Random();
		int aux = random.nextInt(5);
		if (aux <=2) {
			return DadoCombate.CAVEIRA;
		}
		else if (aux == 3 || aux == 4) {
			return DadoCombate.ESCUDOHEROI;
		}
		else {
			return DadoCombate.MONSTRO;
		}
	}

}
