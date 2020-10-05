package br.unicamp.ic.mc322.lab04.RPG;
import br.unicamp.ic.mc322.lab04.RPG.TipoArma;
import java.util.ArrayList;
public class Anao extends Heroi {
	 ArrayList<Armas> armas = new ArrayList();
	public Anao(int x, int y, String nome) {

		super(x, y, "An", 2,2,7,3,nome );
	
		//Armas arma = new Armas(TipoArma.CAJADO);
		//armas.add(arma);

	}
}
//• Anao. Ataque: 2 dados, defesa: 2 dados, pontos de vida: 7, pontos  ̃
//de inteligencia: 3. Comec ̧a o jogo com uma espada curta, que fornece ˆ
//+2 dados para ataque.