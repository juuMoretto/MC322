package br.unicamp.ic.mc322.lab04.RPG;
import br.unicamp.ic.mc322.lab04.RPG.exceptions.*;

public class Magia {
	
	//Magias. Para lanc ̧ar uma magia deve-se lanc ̧ar um dado de 6 faces; se o
	//resultado e ́ menor dos pontos de inteligencia do her ˆ oi ou monstro, a magia  ́
	//e lanc ̧ada com sucesso. 
	boolean  jogaMagia(Moveis movel) {

		Dado dado = new Dado();
		int aux = dado.DadoVermelho();
		if(aux < movel.pontosInteligencia) {
			return true;
		}
		else {
			return false;
		}
		
			
		
	}
	
	
	
	
	
	
	
	

}
