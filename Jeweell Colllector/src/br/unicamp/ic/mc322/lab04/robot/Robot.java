//ROBOT é o corpo e sistema central do robô burrinho
//Ele informa para o sistema de geolocalização onde está
//Coleta jóias
//Se locomove para cima, baixo, direita e esquerda
//informa quantas jóias possui e qual sua pontuação atual



package br.unicamp.ic.mc322.lab04.robot;

import br.unicamp.ic.mc322.lab04.Point;
import br.unicamp.ic.mc322.lab04.robot.map.Color;
import br.unicamp.ic.mc322.lab04.robot.map.Jewel;
import br.unicamp.ic.mc322.lab04.robot.map.Map;

public class Robot {
	private Point position;
	private Jewel[] bag;
	private int jewelQuantity;
	private int value;
	
	
	public Robot(int x, int y) {
		position = new Point (x,y);
		jewelQuantity = 0;
		value = 0;
		bag = new Jewel[100];
	}
	
	public int[] sayPosition() {
		int[] point = new int[2];
		point[0] = position.returnX();
		point[1] = position.returnY();
		return point;
		
	}
	
	public void printJewel() {
		String out = "Existem " + jewelQuantity + " joias na sacola. | ";
		out = out + "Somando o valor de " + value + " pontos. \n";
		System.out.println(out);
		
	}
	
	public void collectJewl(Map map) {
		int[] size = map.returnSize();
		
		if(position.returnX() > 0) {
			if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX()-1, position.returnY(), Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX()-1, position.returnY(), Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX()-1, position.returnY(), Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
				
		}
		if(position.returnX() < size[0]-1) {
			if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			
		}
		if(position.returnY() > 0) {
			if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
				
		}
		if(position.returnX() < size[1]-1) {
			if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				jewelQuantity=jewelQuantity + 1;
			}
			
		}
		
		
	}
	
	public void moveNorth(Map map) {
		if(position.returnY() > 0) {
			if(map.isObstacleFree(position.returnX(), position.returnY()-1)) {
				position = new Point(position.returnX(), position.returnY()-1);		
			}	
		}
	}
	
	public void moveSouth(Map map) {
		int[] size = map.returnSize();
		if(position.returnY() < size[1]-1) {
			if(map.isObstacleFree(position.returnX(), position.returnY()+1)) {
				position = new Point(position.returnX(), position.returnY()+1);	
			}
		}	
	}
	
	public void moveWest(Map map) {
		if(position.returnX() > 0) {
			if(map.isObstacleFree(position.returnX()-1, position.returnY())) {
				position = new Point(position.returnX()-1, position.returnY());		
			}
		}	
	}
	
	public void moveEast(Map map) {
		int[] size = map.returnSize();
		if(position.returnX() < size[0]-1) {
			if(map.isObstacleFree(position.returnX()+1, position.returnY())) {
				position = new Point(position.returnX()+1, position.returnY());	
			}
		}	
	}
	
	
	
	

}
