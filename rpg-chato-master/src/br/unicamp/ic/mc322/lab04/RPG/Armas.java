package br.unicamp.ic.mc322.lab04.RPG;

public class Armas extends Itens {
	private int alcance;
	private int bonus_ataque;
	private int bonus_defesa;
	private boolean destruicao;
	private TipoArma tipo;
	
	public Armas(int alcance, int  bonus_ataque, int  bonus_defesa, boolean destruicao, TipoArma tipo) {
		this.alcance = alcance;
		this.bonus_ataque = bonus_ataque;
		this.destruicao = destruicao;
		this.tipo = tipo;
	}
	
	//reduzido
	public Armas(TipoArma tipo) {
		if (tipo == TipoArma.PUNHAL) {
			this.alcance = 5;
			this.bonus_ataque = 1;
			this.bonus_defesa = 0;
			this.destruicao = true;
			this.tipo = tipo;
		}else if (tipo == TipoArma.ESPADA_CURTA) {
			this.alcance = 1;
			this.bonus_ataque = 2;
			this.bonus_defesa = 0;
			this.destruicao = false;
			this.tipo = tipo;
		}else if (tipo == TipoArma.ESPADA_LONGA) {
			this.alcance = 2;
			this.bonus_ataque = 3;
			this.bonus_defesa = 0;
			this.destruicao = false;
			this.tipo = tipo;
		}else if (tipo == TipoArma.ESCUDO) {
			this.alcance = 1;
			this.bonus_ataque = 1;
			this.bonus_defesa = 5;
			this.destruicao = false;
			this.tipo = tipo;
		}else if (tipo == TipoArma.MACHADO) {
			this.alcance = 2;
			this.bonus_ataque = 2;
			this.bonus_defesa = 0;
			this.destruicao = false;
			this.tipo = tipo;
		}else if (tipo == TipoArma.MACHADINHA) {
			this.alcance = 5;
			this.bonus_ataque = 1;
			this.bonus_defesa = 0;
			this.destruicao = true;
			this.tipo = tipo;
		}else if (tipo == TipoArma.KATANA) {
			this.alcance = 2;
			this.bonus_ataque = 4;
			this.bonus_defesa = 0;
			this.destruicao = true;
			this.tipo = tipo;
		}else if (tipo == TipoArma.MAÇA) {
			this.alcance = 1;
			this.bonus_ataque = 4;
			this.bonus_defesa = 0;
			this.destruicao = true;
			this.tipo = tipo;
		}else {// CAJADO
			this.alcance = 2;
			this.bonus_ataque = 1;
			this.bonus_defesa = 0;
			this.destruicao = true;
			this.tipo = tipo;
		}
	}
	

	public int getAlcance() {
		return alcance;
	}
	
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
	public int getBonusAtaque() {
		return bonus_ataque;
	}
	
	public void setBonusAtaque(int bonus_ataque) {
		 this.bonus_ataque = bonus_ataque;
	}
	
	
	public int getBonusDefesa() {
		return bonus_defesa;
	}
	
	public void setBonusDefesa(int bonus_defesa) {
		 this.bonus_defesa = bonus_defesa;
	}
	
	public boolean getDestruicao() {
		return destruicao;
	}
	
	public void setDestruicao(boolean destruicao) {
		this.destruicao =  destruicao;
	}
	
	public TipoArma getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoArma tipo) {
		this.tipo = tipo;
	}
	
	
	//@Override
	public String toString(){
		String out = "(ARMA:" + getTipo()+")\n";
		out = out + "Dano = " +getBonusAtaque() + "\n";
		out = out + "Defesa = " +getBonusDefesa() + "\n";
		out = out + "Alcance = " +getAlcance() + "\n";
		out = out + "Destruição = " +getDestruicao() + "\n";
		return out;
		}

	
	
}
