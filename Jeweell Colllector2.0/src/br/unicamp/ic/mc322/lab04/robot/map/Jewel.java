//Jewel são a representação das Jóias no sistema Map

// Suas funções são:
//informar para o sistema Map onde está a jóia
//Transformar a jóia em string, em como o sistema map vai reconhece-la
//Retornar para o sistema central do robô quanto aquela jóia vale

package br.unicamp.ic.mc322.lab04.robot.map;

import br.unicamp.ic.mc322.lab04.Point;

public class Jewel implements Mapeable {
	private Point position;
	private Color color;
	private int value;
	private int healthPoints;
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public Jewel(int x, int y, Color color) {
		this.position = new Point(x,y);
		this.color = color;
		if (color.equals(Color.RED)){
			value = 100;	
			healthPoints = 0;
		}
		else if (color.equals(Color.GREEN)) {
			value = 50;
			healthPoints = 0;
		}
		else if (color.equals(Color.BLUE)) {
			value = 10;
			healthPoints = 5;
		}
	}
	
	int returnValue() {
		return value;
	}
	
	public int[] returnPosition() {
		int[] point = new int[2];
		point[0]= position.returnX();
		point[1]= position.returnY();
		return point;
		
		
		
	}
	
	public String toString() {
		String string;
		string = new String("--");
		if (color.equals(Color.RED)){
			string = new String("JR");		
		}
		else if (color.equals(Color.GREEN)) {
			string = new String("JG");
		}
		else if (color.equals(Color.BLUE)) {
			string = new String("JB");
		}
		return string;
	}
	
	
	

}
