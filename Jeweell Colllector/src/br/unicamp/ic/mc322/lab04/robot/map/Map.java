//Map é um sistema de geolocalização 
//Suas funções consistem em: 
//Adicionar a localização das jóias
//Remover a localização das jóias
//Adicionar a localização de obstáculos
//Remover a localização de obstáculos
//Indicar se alguma coordenada possui obstáculo
//Mostrar o que existe em determinada coordenada
//Mostrar o tamanho do terreno
//Imprimir o terreno e onde o robô burrinho está




package br.unicamp.ic.mc322.lab04.robot.map;

import br.unicamp.ic.mc322.lab04.robot.Robot;


public class Map {
	private int rows;
	private int columns;
	private String[][] map;
	
	public Map(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		map = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j< columns; j++) {
				map[i][j]= new String("--");
			}
		}
	}
	
	public void addJewel(Jewel jewel) {
		int position[] = jewel.returnPosition();
		map[position[0]][position[1]]= jewel.toStringJewel();
	}
	
	public void addObstacle(Obstacle obstacle) {
		int position[] = obstacle.returnPosition();
		map[position[0]][position[1]]= obstacle.toStringObstacle();

	}
	
	public void removeJewel(Jewel jewel) {
		int position[] = jewel.returnPosition();
		map[position[0]][position[1]]= "--";
	}
	
	public void removeObstacle(Obstacle obstacle) {
		int position[] = obstacle.returnPosition();
		map[position[0]][position[1]]= "--";

	}
	
	
	public void printMap(Robot robot) {
		int position[] = robot.sayPosition();
		for (int i = 0; i < columns; i++) {
			for(int j = 0; j< rows; j++) {
				if(position[0]==j && position[1]==i) {
					System.out.print("ME");
					
				}
				else {
					System.out.print(map[j][i]);
				}
				
			}
			System.out.print("\n");
		}
		
	}
	
	public int[] returnSize() {
		int[] size = new int[2];
		size[0]= rows;
		size[1]= columns;
		return size;
	}
	
	public String returnMapPosition(int x, int y) {
		return map[x][y];
		
		
	}
	
	public boolean isObstacleFree(int x, int y) {
		if(map[x][y].equals("##")) {
			return false;
		}
		else if(map[x][y].equals("$$")) {
			return false;
		}
		else {
			return true;
		}
		
	}
	

}
