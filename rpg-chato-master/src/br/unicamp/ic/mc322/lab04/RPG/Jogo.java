package br.unicamp.ic.mc322.lab04.RPG;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Jogo {
	private static Scanner keyboard;
	private boolean sair;
	private Mapa mapa;
	private Heroi jogador;
	
	public Jogo(int num) {
		if(num == 1) {
			tabuleiroPronto();
		}
		if (num == 2) {
			tabuleiroAleatorio();
		}
	}
	
	private void procura(int i, int j) {
		try {
			if(mapa.componentes[i][j].getRepresentacao().compareTo("TS") == 0) {
				System.out.printf("Ha um tesouro na posi��o (%d,%d)\n ", i, j) ;
			} else if(mapa.componentes[i][j].getRepresentacao().compareTo("AA") == 0) {
				System.out.printf("Ha uma armadilha na posi��o (%d,%d)\n ", i, j) ;
			} else if(mapa.componentes[i][j].getRepresentacao().compareTo("GB") == 0) {
				System.out.printf("Ha um goblin na posi��o (%d,%d)\n ", i, j) ;
			} else if(mapa.componentes[i][j].getRepresentacao().compareTo("EE") == 0) {
				System.out.printf("Ha um esqueleto na posi��o (%d,%d)\n ", i, j) ;
			} else if(mapa.componentes[i][j].getRepresentacao().compareTo("EM") == 0) {
				System.out.printf("Ha um esqueleto mago na posi��o (%d,%d)\n ", i, j) ;
			}else {
				System.out.printf("Nao ha nada na posi��o (%d,%d)\n ", i, j) ;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// nao faz nada
		}
	}
	
	private void pegaTesouro(int i, int j) {
		try {
			if(mapa.componentes[i][j].getRepresentacao().compareTo("TS") == 0) {
				Tesouro aux = new Tesouro(i,j);	
				jogador.PegaTesouro(mapa, aux);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// nao faz nada
		}
	}
	
	private void atacar(int i, int j) {
		//implementar uso de dados e caso o monstro tenha mais de 1 de vida
		try {
			if(mapa.componentes[i][j].getRepresentacao().compareTo("GB") == 0 || mapa.componentes[i][j].getRepresentacao().compareTo("EE") == 0 || mapa.componentes[i][j].getRepresentacao().compareTo("EM") == 0 ) {
				mapa.removeComponente(mapa.componentes[i][j]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// nao faz nada
		}
	}
	
	
	private void abrePortas(int i, int j) {
		try {
			if(mapa.componentes[i][j].getRepresentacao().compareTo("PT") == 0) {
				mapa.removeComponente(mapa.componentes[i][j]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// nao faz nada
		}
	}
	
	private Moveis geraMonstroAleatorio(int i, int j) {
		Moveis aux;
		Random random = new Random();
		int aux3 = random.nextInt(3);
    	if(aux3 == 0) {
    		aux = new Goblin(i, j);
    	} else if (aux3 == 1) {
    		aux = new Esqueleto(i, j);
    	} else {
    		aux = new EsqueletoMago(i, j);
    	}
		
		return aux;
	}
	
	private Heroi insereJogador() {
		String aux;
		Heroi aux1;
		int aux2 = 5;
		keyboard = new Scanner(System.in);
		System.out.print("Insira o nome do Jogador :\n ") ;
		aux = keyboard.nextLine();
		System.out.print("Selecione a classe desejada :\n ") ;
		System.out.print("(1) Anao\n ") ;
		System.out.print("(2) Barbaro\n ") ;	
		System.out.print("(3) Elfo\n ") ;
		System.out.print("(4) Feiticeiro\n ") ;
		aux2 = keyboard.nextInt();
		while (aux2 != 1 && aux2 != 2 && aux2 != 3 && aux2 != 4) {
			System.out.print("Comando Invalido!\n ") ;
			System.out.print("Selecione a classe desejada :\n ") ;
			System.out.print("(1) Anao\n ") ;
			System.out.print("(2) Barbaro\n ") ;	
			System.out.print("(3) Elfo\n ") ;
			System.out.print("(4) Feiticeiro\n ") ;
			aux2 = keyboard.nextInt();
		}
		if(aux2 == 1){
			aux1 = new Anao(0, 0, aux);
		} else if(aux2 == 2) {
			aux1 = new Barbaro(0, 0, aux);
		} else if(aux2 == 3) {
			aux1 = new Elfo(0, 0, aux);
		} else {
			aux1 = new Feiticeiro(0, 0, aux);
		}
		
		return aux1;
	}
	
	private void tabuleiroPronto(){
		Componentes aux;
		int  aux1;
		this.jogador = insereJogador();
		this.mapa = new Mapa(35, 23);
		try {
			FileInputStream entrada = new FileInputStream("MapaPronto1.txt");
			InputStreamReader entradaFormatada = new InputStreamReader(entrada);
			aux1 = entradaFormatada.read();
			for(int i = 0; i < 35; i++) {
				for(int j = 0; j < 23; j++) {
				     char aux2 = (char) aux1;     
				     if(aux2 == 'P') {
				    	 aux = new Parede(i,j);
				    	 mapa.insereEstatico(aux);
				     } else if(aux2 == 'U' || aux2 == 'S') {
				    	 aux = new Porta(i,j);
				    	 mapa.insereEstatico(aux);
				     }else if(aux2 == 'T') {
				    	 aux = new Tesouro(i,j);
				    	 mapa.insereEstatico(aux);
				     }else if(aux2 == 'M') {
				    	 aux = geraMonstroAleatorio(i,j);
				    	 mapa.insereMovel(aux);
				     }else if(aux2 == 'A') {
				    	 aux = new Armadilha(i,j);
				    	 mapa.insereEstatico(aux);
				     }
				     aux1 = entradaFormatada.read();
				 } 
			}
			entradaFormatada.close();
		} catch(FileNotFoundException e) {
			System.out.print("Erro: Arquivo nao encontrado!\n") ;
			
		}catch(IOException e) {
			System.out.print("Erro: IOException\n") ;
		}
		
		mapa.insereMovel(this.jogador.getComponente());
	}
	
	private void tabuleiroAleatorio() {
		Random random =  new Random();
		Componentes aux1;
		this.jogador = insereJogador();
		//gera mapa de tamanho aleatorio, minimo 5x5
		this.mapa = new Mapa(random.nextInt(30)+5, random.nextInt(30)+5);
		for(int i = 0; i<mapa.getTamanho().getX(); i++) {
			for(int j = 0; j < mapa.getTamanho().getY(); j++) {
				int aux = random.nextInt(10);
				if(aux  == 0 && i%2 ==0 && j%2 ==0){
					aux1 = new Tesouro(i,j);
					mapa.insereEstatico(aux1);
				} else if(aux == 1 && ((i%2 !=0 && j%2 ==0) || (i%2 ==0 && j%2 !=0))) {
					aux1 = new Parede(i,j);
					mapa.insereEstatico(aux1);
					
				} else if(aux == 2  && ((i%2 !=0 && j%2 ==0) || (i%2 ==0 && j%2 !=0))) {
					aux1 = new Porta(i,j);
					mapa.insereEstatico(aux1);
					
				} else if(aux == 3 && i%2 ==0 && j%2 ==0) {
					aux1 = new Armadilha(i,j);
					mapa.insereEstatico(aux1);
					
				} else if(aux == 4 && ((i%2 !=0 && j%2 ==0) || (i%2 ==0 && j%2 !=0))) {
					aux1 = new Parede(i,j);
					mapa.insereEstatico(aux1);
					
				} else if(aux == 5 && ((i%2 !=0 && j%2 ==0) || (i%2 ==0 && j%2 !=0))) {
					aux1 = new Parede(i,j);
					mapa.insereEstatico(aux1);
					
				} else if(aux == 6 && i%2 ==0 && j%2 ==0) {
					aux1 = geraMonstroAleatorio(i,j);
					mapa.insereMovel(aux1);
				}
				
			}
		}
		mapa.insereMovel(this.jogador.getComponente());
	}
	
	private void desenhaTabuleiro(Mapa mapa) {
		mapa.ImprimeMapa();
	}
	
	private void leEntrada() {
		String aux;
		keyboard = new Scanner(System.in);
		System.out.print("Insira o comando : ") ;
		aux = keyboard.nextLine();
		if(aux.compareTo("sair") == 0) {
			this.sair = true;
		} else if ( aux.compareTo ("w") == 0) {
			jogador.getComponente().MoveCima(mapa);
			
		} else if ( aux.compareTo ("a") == 0) {
			jogador.getComponente().MoveEsquerda(mapa);
			
		} else if ( aux.compareTo ("s") == 0) {
			jogador.getComponente().MoveBaixo(mapa);
			
		} else if ( aux.compareTo ("d") == 0) {
			jogador.getComponente().MoveDireita(mapa);
			
		}  else if ( aux.compareTo ("u") == 0) {
			abrePortas(jogador.getComponente().coordenadas.getX()-1,jogador.getComponente().coordenadas.getY());
			abrePortas(jogador.getComponente().coordenadas.getX()+1,jogador.getComponente().coordenadas.getY());
			abrePortas(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()-1);
			abrePortas(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()+1);
			
		} else if ( aux.compareTo ("g") == 0) {
			pegaTesouro(jogador.getComponente().coordenadas.getX()-2,jogador.getComponente().coordenadas.getY());
			pegaTesouro(jogador.getComponente().coordenadas.getX()+2,jogador.getComponente().coordenadas.getY());
			pegaTesouro(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()-2);
			pegaTesouro(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()+2);
			
		} else if ( aux.compareTo ("p") == 0) {
			procura(jogador.getComponente().coordenadas.getX()-2,jogador.getComponente().coordenadas.getY());
			procura(jogador.getComponente().coordenadas.getX()+2,jogador.getComponente().coordenadas.getY());
			procura(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()-2);
			procura(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()+2);
			
		} else if ( aux.compareTo ("f") == 0) {
			atacar(jogador.getComponente().coordenadas.getX()-2,jogador.getComponente().coordenadas.getY());
			atacar(jogador.getComponente().coordenadas.getX()+2,jogador.getComponente().coordenadas.getY());
			atacar(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()-2);
			atacar(jogador.getComponente().coordenadas.getX(),jogador.getComponente().coordenadas.getY()+2);
			
		}
		
	}
	
	private void atualizaTabuleiro(Mapa mapa) {
		mapa.ImprimeMapa();
	}
	
	public void comecar() {
		sair = false;
		System.out.println("O Jogo Comecou!");
		desenhaTabuleiro(mapa);
		while(!sair) {
			leEntrada();
			atualizaTabuleiro(mapa);
			}
		System.out.println("Jogo Terminado!");
	}
}
