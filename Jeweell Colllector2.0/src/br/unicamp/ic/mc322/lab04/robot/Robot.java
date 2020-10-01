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
import br.unicamp.ic.mc322.lab04.robot.map.Obstacle;
import br.unicamp.ic.mc322.lab04.robot.map.ObstacleType;
import br.unicamp.ic.mc322.lab04.robot.OutOfBoundaryError;
import br.unicamp.ic.mc322.lab04.robot.SpaceTakenError;


public class Robot {
	private Point position;
	private Jewel[] bag;
	private int jewelQuantity;
	private int value;
	private int healthPoints;
	
	
	public Robot(int x, int y) {
		position = new Point (x,y);
		jewelQuantity = 0;
		value = 0;
		bag = new Jewel[100];
		healthPoints = 5;
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
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX()-1, position.returnY(), Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX()-1, position.returnY(), Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
				
		}
		if(position.returnX() < size[0]-1) {
			if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX()+1, position.returnY(), Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			
		}
		if(position.returnY() > 0) {
			if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()-1, Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
				
		}
		if(position.returnX() < size[1]-1) {
			if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JR")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.RED);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JG")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.GREEN);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("JB")) {
				bag[jewelQuantity]= new Jewel(position.returnX(), position.returnY()+1, Color.BLUE);
				map.removeJewel(bag[jewelQuantity]);
				healthPoints = healthPoints+ bag[jewelQuantity].getHealthPoints();
				jewelQuantity=jewelQuantity + 1;
			
			}
			
		}
		
		
	}
	
	public void moveNorth(Map map) {
		if(healthPoints > 0) {
		try {
		if(position.returnY() > 0) {
			if(map.isObstacleFree(position.returnX(), position.returnY()-1)) {
				position = new Point(position.returnX(), position.returnY()-1);		
				healthPoints = healthPoints -1;
				}
			else {
				throw new SpaceTakenError("Obstaculo aqui");
			}
		}
		else {
			throw new OutOfBoundaryError("Além da fronteira" );}
		}
		catch(OutOfBoundaryError erro) {
			position = position; // muda nada 
			
		}
		catch(SpaceTakenError erro) {
			position = position; //muda nada
		}
	}}
	
	public void moveSouth(Map map) {
		if (healthPoints > 0) {
		try {
			int[] size = map.returnSize();
			if(position.returnY() < size[1]-1) {
				if(map.isObstacleFree(position.returnX(), position.returnY()+1)) {
					position = new Point(position.returnX(), position.returnY()+1);	
					healthPoints = healthPoints -1;
				}
				else {
					throw new SpaceTakenError("Obstaculo aqui");
				}
			}
			else {
				throw new OutOfBoundaryError("Além da fronteira" );
			}
		}
			catch(OutOfBoundaryError erro) {
				position = position; // muda nada 
				
			}
		catch(SpaceTakenError erro) {
			position = position; //muda nada
		}
	}	}
	
	
	public void moveWest(Map map) {
		if (healthPoints > 0) {
		try {
			if(position.returnX() > 0) {
				if(map.isObstacleFree(position.returnX()-1, position.returnY())) {
					position = new Point(position.returnX()-1, position.returnY());		
					healthPoints = healthPoints -1;
					}
				else {
					throw new SpaceTakenError("Obstaculo aqui");
				}
			}
			else{
				throw new OutOfBoundaryError("Além da fronteira" );
			}
				
		}
		catch(OutOfBoundaryError erro) {
			position = position; // muda nada 
			
		}
		catch(SpaceTakenError erro) {
			position = position; //muda nada
		}
	}}
	
	public void moveEast(Map map) {
		if(healthPoints > 0) {
		int[] size = map.returnSize();
		try {
			if(position.returnX() < size[0]-1) {
				if(map.isObstacleFree(position.returnX()+1, position.returnY())) {
					position = new Point(position.returnX()+1, position.returnY());	
					healthPoints = healthPoints -1;
					}
				else {
					throw new SpaceTakenError("Obstaculo aqui");
				}
			}
			else{
				throw new OutOfBoundaryError("Além da fronteira" );
			}
				
		}
		catch(OutOfBoundaryError erro) {
			position = position; // muda nada 
			
		}
		catch(SpaceTakenError erro) {
			position = position; //muda nada
		}}
	}
	
	
	
	public void collectObstacle(Map map) {
		int[] size = map.returnSize();
		
		if(position.returnX() > 0) {
			if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("##")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.WATER);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
	
			}
			else if(map.returnMapPosition(position.returnX()-1, position.returnY()).equals("$$")) {
				Obstacle obstacle = new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.TREE);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
				
		}
		if(position.returnX() < size[0]-1) {
			if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("##")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.WATER);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
			else if(map.returnMapPosition(position.returnX()+1, position.returnY()).equals("$$")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.TREE);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
			
			
		}
		if(position.returnY() > 0) {
			if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("##")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.WATER);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()-1).equals("$$")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.TREE);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
	
		}
		if(position.returnX() < size[1]-1) {
			if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("##")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.WATER);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
			else if(map.returnMapPosition(position.returnX(), position.returnY()+1).equals("$$")) {
				Obstacle obstacle= new Obstacle(position.returnX()-1, position.returnY(), ObstacleType.TREE);
				healthPoints = healthPoints+ obstacle.getHealthPoints();
			}
			
		}
		
		
	}
	
	public void PrintHealthPoints() {
		String out = "Existem " + healthPoints + " pontos de vida ";
		System.out.println(out);
		
		
	}
	
	public void PrintImportantInfos() {
		printJewel();
		PrintHealthPoints();
	}
	
	
	
	

}
