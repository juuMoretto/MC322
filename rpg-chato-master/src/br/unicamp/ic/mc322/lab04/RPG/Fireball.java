package br.unicamp.ic.mc322.lab04.RPG;

public class Fireball extends Magia {

	//• Fireball. O objetivo e acusa 6 danos e as personagens nas posic ̧oes  ̃
		//adjacentes acusam tres danos. ˆ
		void JogaFireball(Moveis movel, Moveis objetivo, Mapa mapa) {
			if(jogaMagia(movel)) {
				objetivo.pontosVida = objetivo.pontosVida - 6;
				try {
					Ponto aux = movel.coordenadas;
					mapa.componentes[aux.getX()+1][aux.getY()].levaDano(3);}
					catch(ArrayIndexOutOfBoundsException e) {
						//faz nada	
					}
				finally {
					try {
						Ponto aux = movel.coordenadas;
						mapa.componentes[aux.getX()-1][aux.getY()].levaDano(3);}
					catch(ArrayIndexOutOfBoundsException e) {
						//faz nada	
					}
					finally {
						try {
							Ponto aux = movel.coordenadas;
							mapa.componentes[aux.getX()][aux.getY()+1].levaDano(3);
							}
						
						catch(ArrayIndexOutOfBoundsException e) {
						//faz nada	
						}
						finally {
							try {
								Ponto aux = movel.coordenadas;
								mapa.componentes[aux.getX()][aux.getY()-1].levaDano(3);
								}
							
							catch(ArrayIndexOutOfBoundsException e) {
								//faz nada	
							}
							finally {
								//faz nada
								
							}
					}
					
					
				}
				
			}}
}}
