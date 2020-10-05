package br.unicamp.ic.mc322.lab04.RPG;
import java.util.ArrayList;

public class Heroi extends Jogador {
	private ArrayList<Itens> bolsa = new ArrayList();
	private int dadosAtaque;
	private int dadosDefesa;
	private String nome;
	public Heroi(int x, int y, String representacao,int dadosAtaque, int dadosDefesa, int pontosVida, int pontosInteligencia, String nome) {
		
		super(x, y, representacao, pontosVida,pontosInteligencia);
		this.dadosAtaque = dadosAtaque;
		this.dadosDefesa = dadosDefesa; 
		
		this.nome = nome;
	}
	
	public void PegaTesouro(Mapa mapa,Tesouro tesouro) {
		this.bolsa.add(tesouro.getItem());
		mapa.removeComponente(tesouro);	
		}
	
	
}
