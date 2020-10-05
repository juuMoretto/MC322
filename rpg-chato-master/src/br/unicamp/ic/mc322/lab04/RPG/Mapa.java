package br.unicamp.ic.mc322.lab04.RPG;

import br.unicamp.ic.mc322.lab04.RPG.exceptions.ParedeException;

public class Mapa {
	Componentes[][] componentes;
	private Ponto tamanho;
	
	public Mapa(int x, int y) {
		componentes = new Componentes[x][y];
		for (int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(i%2 !=0 || j%2 != 0) {
					componentes[i][j] = new Estaticos(i, j, "  ",true);
				}
				else {
					componentes[i][j] = new Estaticos(i, j, "--",true);
				}
			}
		}
		this.tamanho = new Ponto(x,y);
	}
	
	public boolean checaMovimento(int x, int y) {
		if(componentes[x][y].getRepresentacao().compareTo("  ") == 0) {
			System.out.print("Entrou\n");
			return true;
			}
		else {
			System.out.print("Entrou1\n");
			throw new ParedeException(componentes[x][y]);
		}
	}
	
	public void insereEstatico(Componentes componente) {
		Ponto aux;
		aux = componente.getCoordenadas();
		this.componentes[aux.getX()][aux.getY()] = new Estaticos(aux.getX(), aux.getY(), componente.getRepresentacao(), componente.estaVazio());
	}
	public void insereMovel(Componentes componente) {
		Ponto aux;
		aux = componente.getCoordenadas();
		this.componentes[aux.getX()][aux.getY()] = new Moveis(aux.getX(), aux.getY(), componente.getRepresentacao(), 1, 1);
	}
	
	
	
	public void removeComponente(Componentes componente) {
		Ponto aux;
		aux = componente.getCoordenadas();
		if(aux.getX()%2 == 0 && aux.getY()%2 == 0) {
			this.componentes[aux.getX()][aux.getY()] = new Estaticos(aux.getX(), aux.getY(), "--",true);
		}
		else {
			this.componentes[aux.getX()][aux.getY()] = new Estaticos(aux.getX(), aux.getY(),"  ",true);
		}
	}
	
	public Ponto getTamanho() {
		return this.tamanho;
	}
	
	public void ImprimeMapa() { 
		for (int i = 0; i < componentes.length; i++) {
			for (int j = 0; j < componentes[i].length; j++) {
					System.out.print(componentes[i][j].getRepresentacao());
			}
			System.out.print("\n");
		}
	}
	
}

