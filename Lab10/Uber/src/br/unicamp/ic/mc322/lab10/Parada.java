package br.unicamp.ic.mc322.lab10;
import java.util.ArrayList;

public class Parada {
	 double distancia;
	private ArrayList<Passageiro> saideiros = new ArrayList();
	private ArrayList<Passageiro> entreiros = new ArrayList();
	private int numSaideiros = 0;
	private int numEntreiros = 0;
	private Viagem viagem;
	

	public Parada(Viagem viagem,double distancia) {

		this.viagem = viagem;
		this.distancia = distancia;
	}
	
	public void AdicionaEntreiro(Passageiro entreiro) {
		entreiros.add(entreiro);
		numEntreiros = numEntreiros + 1;
	}
	
	public void AdicionaSaideiro(Passageiro saideiro) {
		saideiros.add(saideiro);
		numSaideiros = numSaideiros+1;
	}
	
	public void RemovePassageiros() {
		for(int i=0; i < numSaideiros; i++) {
			viagem.RemovePassageiro(saideiros.get(i));
		}
		
	}
	public void AdicionaPassageiros() {
		for ( int i = 0; i < numEntreiros; i++) {
			viagem.AdicionaPassageiro(entreiros.get(i));
		}
	}
	
}
