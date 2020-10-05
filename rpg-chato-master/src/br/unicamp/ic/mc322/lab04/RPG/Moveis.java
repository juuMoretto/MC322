package br.unicamp.ic.mc322.lab04.RPG;
import java.util.Random;

import br.unicamp.ic.mc322.lab04.RPG.exceptions.ParedeException;

public class Moveis extends Componentes{
	int pontosVida;
	int pontosInteligencia;

	//mudei as funï¿½oes para publico, queria que o Jogo tivesse acesso
	public Moveis(int x, int y, String representacao,int pontosVida, int pontosInteligencia) {

		super(x,y,representacao,false);
		this.pontosVida = pontosVida;
		this.pontosInteligencia = pontosInteligencia;
		
	}
	
	public void MoveCima(Mapa mapa) {
		int x = this.coordenadas.getX() - 2;
		int y = this.coordenadas.getY();
		try {
			if(mapa.checaMovimento(x+1, y) && mapa.componentes[x][y].estaVazio()) {
				mapa.removeComponente(this);
				this.coordenadas = new Ponto(x,y);
				mapa.insereMovel(this);	
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//faz nada ne 
		}
		catch (ParedeException E) {
			System.out.printf("Nao e possivel se movimentar para essa posicao!\n");
		}
	}
	public void MoveBaixo(Mapa mapa) {
		int x = this.coordenadas.getX() + 2;
		int y = this.coordenadas.getY();
		try {
			if(mapa.checaMovimento(x-1, y) && mapa.componentes[x][y].estaVazio()) {
				mapa.removeComponente(this);
				this.coordenadas = new Ponto(x,y);
				mapa.insereMovel(this);	
			}
		}
		catch(ArrayIndexOutOfBoundsException E) {
			//faz nada ne 
		}
		catch (ParedeException E) {
			System.out.printf("Há uma parede!\n");
		}
	}
	public void MoveDireita(Mapa mapa) {
		int x = this.coordenadas.getX();
		int y = this.coordenadas.getY() + 2;
		try {
			if(mapa.checaMovimento(x, y-1) && mapa.componentes[x][y].estaVazio()) {
				System.out.print(mapa.checaMovimento(x, y-1));
				mapa.removeComponente(this);
				this.coordenadas = new Ponto(x,y);
				mapa.insereMovel(this);	
			}
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.printf("Saiu do limite?!\n");
			//faz nada ne 
		}
		catch (ParedeException E) {
			System.out.printf("Há uma parede!\n");
		}
	}
	public void MoveEsquerda(Mapa mapa) {
		int x = this.coordenadas.getX();
		int y = this.coordenadas.getY() - 2;
		try {
			if(mapa.checaMovimento(x, y+1) && mapa.componentes[x][y].estaVazio()) {
				mapa.removeComponente(this);
				this.coordenadas = new Ponto(x,y);
				mapa.insereMovel(this);	
			}
		}
		catch(ArrayIndexOutOfBoundsException E) {
			//faz nada ne 
		}
		catch (ParedeException E) {
			System.out.printf("Há uma parede!\n");
		}
	}
	public void MoveAleatorio(Mapa mapa) {
		Random random = new Random();
		int aux =  random.nextInt(3);
		if (aux == 0) {
			this.MoveCima(mapa);
		}
		else if (aux == 1) {
			this.MoveBaixo(mapa);
		}
		else if(aux == 2) {
			this.MoveDireita(mapa);
		}
		else if (aux == 3) {
			this.MoveEsquerda(mapa);
		}
	}
	public void levaDano(int dano) {
		this.pontosVida = this.pontosVida - dano;
		
		
		
	}

}
