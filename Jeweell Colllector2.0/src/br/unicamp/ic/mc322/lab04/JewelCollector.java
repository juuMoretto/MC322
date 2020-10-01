//ROBÔ BURRINHO
//ROBO burrinho, o jogo, tabém conhecido como 
//JewlCollector(nome nada popular entre os usuários)

//Um jogo idealizado pelos monitores e prof de mc322 turmas C e D de 1 semestre de 2020
//Código escrito por Júlia Machado Moretto
//RA 176953

//Como o jogo funciona? Você é um robô andando por um terreno estranho, inicialmente você tem 5 pontos de vida
// voce perde um ponto de vida a cada deslocamento bem sucedido
//Não se preocupe, você tem um mapa inteligente que sempre te mostra onde você está
//Acontece que é um robô burro, meio mal feito, sem ajuste angular fino, só gira de 90 em 90 graus
//Então só anda pra frente, trás, direita e esquerda. Então segue os comandos:
//Norte = w
//Sul = s
//oeste = a
//leste = d
//Para ganhar mais pontos de vida colete joias azuis ou pegue pontos com arvores 
// pegar ponto com arvore = u
//pegar joias = g
//Sua missão nesse terreno estranho, cheio de obstáculos como árvores e rios
//É desviar dos obstáculos e pegar jóias mágicas
//Mas não se preocupe, você é burro, mas nem tanto, está equipado com sensores de
//água, árvores e paredes, então se tentar passar por cima de algum desses obstáculos
//seu sitema só não autorizará e você pode continuar dando novos comandos
//Como pegar as jóias mágicas?
//Se a jóia mágica estiver imediatamente encima, embaixo ou de um dos seus lados direito e esquerdo,
//basta apertar a tecla g que a jóia vai para sua sacola.
//OBS: Cada tipo de jóia vale uma pontuação diferente!!! É muita emoção!!!
//Mas não se esqueça do como você é um robô burro, caso não perceba e ande por cima da jóia
//Ela continua existindo, mas por estar pisando nela, o sistema não a coloca no mapa até você sair de cima, 
//então você só consegue pegá-la estando do lado, pisando não dá
//É isso, e boa sorte robô burrinho!!!

// "É um jogo incrível, sempre quis ser um robô burrinho" -Eugênio, PAI DA JÚLIA

// "ótimo jogo, 5/7" - Pedro, NAMORADO DA JÚLIA

// "Nem gosto muito de Games, mas esse me conquistou,
//só não é melhor que paciência" - Elaine, MÃE DA JÚLIA

package br.unicamp.ic.mc322.lab04;
import java . util . Scanner ;

import br.unicamp.ic.mc322.lab04.robot.Robot;
import br.unicamp.ic.mc322.lab04.robot.map.Color;
import br.unicamp.ic.mc322.lab04.robot.map.Jewel;
import br.unicamp.ic.mc322.lab04.robot.map.Map;
import br.unicamp.ic.mc322.lab04.robot.map.Obstacle;
import br.unicamp.ic.mc322.lab04.robot.map.ObstacleType;

public class JewelCollector {
	public static void main ( String [] args ) {
		//1. Crie um mapa com dimensão 10x10
		Map map = new Map(10,10);
		//2. Crie e insira as joias de acordo com o tipo e posição (x, y) abaixo:
		//(a) Red - (1, 9)
		Jewel newJewel = new Jewel(1, 9, Color.RED);
		map.addJewel(newJewel);
		//(b) Red - (8, 8)
		newJewel = new Jewel(8, 8, Color.RED);
		map.addJewel(newJewel);
		//(c) Green - (9, 1)
		newJewel = new Jewel(9, 1, Color.GREEN);
		map.addJewel(newJewel);
		//(d) Green - (7, 6)
		newJewel = new Jewel(7, 6, Color.GREEN);
		map.addJewel(newJewel);
		//(e) Blue - (3, 4)
		newJewel = new Jewel(3, 4, Color.BLUE);
		map.addJewel(newJewel);
		//(f) Blue - (2, 1)
		newJewel = new Jewel(2, 1, Color.BLUE);
		map.addJewel(newJewel);
		
		//3. Crie e insira os obstáculos de acordo com o tipo e posição (x, y) abaixo:
		//(a) Water - (5, 0)
		Obstacle newObstacle = new Obstacle(5, 0, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(b) Water - (5, 1)
		newObstacle = new Obstacle(5, 1, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(c) Water - (5, 2)
		newObstacle = new Obstacle(5, 2, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(d) Water - (5, 3)
		newObstacle = new Obstacle(5, 3, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(e) Water - (5, 4)
		newObstacle = new Obstacle(5, 4, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(f) Water - (5, 5)
		newObstacle = new Obstacle(5, 5, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(g) Water - (5, 6)
		newObstacle = new Obstacle(5, 6, ObstacleType.WATER);
		map.addObstacle(newObstacle);
		//(h) Tree - (5, 9)
		newObstacle = new Obstacle(5, 9, ObstacleType.TREE);
		map.addObstacle(newObstacle);
		//(i) Tree - (3, 9)
		newObstacle = new Obstacle(3, 9, ObstacleType.TREE);
		map.addObstacle(newObstacle);
		//(j) Tree - (8, 3)
		newObstacle = new Obstacle(8, 3, ObstacleType.TREE);
		map.addObstacle(newObstacle);
		//(k) Tree - (2, 5)
		newObstacle = new Obstacle(2, 5, ObstacleType.TREE);
		map.addObstacle(newObstacle);
		//(l) Tree - (1, 4)
		newObstacle = new Obstacle(1, 4, ObstacleType.TREE);
		map.addObstacle(newObstacle);
		
		//4. Crie o robô na posição (x, y) = (0, 0).
		Robot robot = new Robot(0,0);
		
		//5. Inicie o jogo, isto é, leia o teclado e colete todas as joias e desvie dos
	   // obstáculos interativamente.
		
		map.printMap(robot);
		robot.printJewel();
		Scanner keyboard = new Scanner ( System . in ) ;
		boolean running = true ;
		while ( running ) {
			System . out . print ( " Digite o comando : " ) ;
			String command = keyboard . nextLine () ;
			if ( command . compareTo ( "sair" ) == 0) {
					running = false ;
			} 
			else if ( command . compareTo ( "w" ) == 0) {
				robot.moveNorth(map);
			} 
			else if ( command . compareTo ( "a" ) == 0) {
				robot.moveWest(map);
			} 
			else if ( command . compareTo ( "s" ) == 0) {
				
				robot.moveSouth(map);
			} 
			else if ( command . compareTo ( "d" ) == 0) {
				robot.moveEast(map);
			} 
			else if ( command . compareTo ( "g" ) == 0) {
				robot.collectJewl(map);
			}
			else if (command .compareTo("u") == 0) {
				robot.collectObstacle(map);
			}
			map.printMap(robot);
			robot.PrintImportantInfos();
		}
	}
}