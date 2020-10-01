package br.unicamp.ic.mc322.lab10;
import java.util.ArrayList;

public class Viagem {
	private Motorista motorista;
	private Veiculo carro;
	private double distancia; //em km
	private ArrayList<Parada> paradas = new ArrayList();
	private int qtdParadas=0;
	private ArrayList<Passageiro> passageiros = new ArrayList();
	private int qtdPassageiros=0;
	private final double FIXO_COMUM = 3;
	private final double FIXO_LUXO = 7;
	private final double PARADA_COMUM = 1.5;
	private final double PARADA_LUXO = 2.7;
	private final double TRECHO_COMUM = 2;
	private final double TRECHO_LUXO = 3.5;
	
	public Viagem(Motorista motorista, Veiculo carro, double distancia) {
		this.motorista = motorista;
		this.carro = carro;
		this.distancia = distancia;
		System.out.println("Inicio da Viagem");
		System.out.println("Motorista "+ motorista.nome);
		System.out.println("Carro " + carro.placa);
		
	}
	public void AdicionaPassageiro(Passageiro passageiro) {
		if (qtdPassageiros < 4) {
			passageiros.add(passageiro);
			qtdPassageiros = qtdPassageiros+1;
			System.out.println("Entrou " + passageiro.nome);
		}
		
		
	}
	
	public void RemovePassageiro(Passageiro passageiro) {
		if (qtdPassageiros > 0) {
			int valor = 5;
			Passageiro passageiro_teste;
			for(int i = 0; i<qtdPassageiros; i++) {
				passageiro_teste = passageiros.get(i);
				if(passageiro_teste.equals(passageiro)) {
					valor = i;
					i = qtdPassageiros;
				}
				
			}
			
			if(valor < 5) {
				passageiros.remove(valor);
				qtdPassageiros = qtdPassageiros - 1;
				System.out.println("Saiu " + passageiro.nome);
			}
			
		}

	}
	
	public void AdiconaParada(Parada parada) {
		paradas.add(parada);
		qtdParadas = qtdParadas+1;
		
		
	}
	
	public void PercorreParadas() {
		int paradaAtual = 0;
		int paradasFaltantes = qtdParadas;
		int numParada = 0;
		while(paradasFaltantes> 0) {
			
			numParada = numParada +1;
			System.out.println("Parada " + numParada);
			//System.out.println("Parada " + numParada);
			for(int i = 0; i < paradasFaltantes; i++) {
				if(paradas.get(i).distancia < paradas.get(paradaAtual).distancia) {
					paradaAtual = i;
				}
				
				
				
	}
	paradas.get(paradaAtual).RemovePassageiros();
	paradas.get(paradaAtual).AdicionaPassageiros();
	paradasFaltantes = paradasFaltantes -1;
	
	paradas.remove(paradaAtual);
	paradaAtual = 0;
	
	}
		}
	
	public void CalculaPreço() {
		double fixo = FIXO_COMUM;
		double parada = PARADA_COMUM;
		double trecho = TRECHO_COMUM;
		double preco = 0;
		
		if(carro.EhLuxo()) {
			fixo = FIXO_LUXO;
			parada = PARADA_LUXO;
			trecho = TRECHO_LUXO;
		}
		
		preco = fixo + qtdParadas*parada + trecho * 10 *distancia;
		System.out.println("O custo da viagem foi de " + preco + " reais");
		
		
	
	}
	

}
