//Obstacle são a representação dos obstáculos do sistema Map

// Não é um obstáculo de verdade por que um obstáculo não fala 
//"fico na esquina entre a rua 7 e a preça da igreja"
//Mas ficar nessa esquina é uma característica desse obstáculo
//Então nessa forma de representação ele pode dizer onde está
//As funções dessa classe são
//informar para o sistema Map onde fica o obstáculo
//Transformar o obstáculo em string, em como o sistema map vai reconhece-lo



package br.unicamp.ic.mc322.lab04.robot.map;

import br.unicamp.ic.mc322.lab04.Point;

public class Obstacle {
	private ObstacleType type;
	private Point position;

	
	public Obstacle(int x, int y, ObstacleType type) {
		this.position = new Point(x,y);
		this.type = type;
	}
	
	int[] returnPosition() {
		int[] point = new int[2];
		point[0]= position.returnX();
		point[1]= position.returnY();
		return point;
	}
	
	String toStringObstacle() {
		String string;
		string = new String("--");
		if (type.equals(ObstacleType.WATER)){
			string = new String("##");		
		}
		else if (type.equals(ObstacleType.TREE)) {
			string = new String("$$");
		}
		
		return string;
	}
}
