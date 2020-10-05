//RA 176953 e RA 168684
//Depois do sucesso do jogo Robô burinho (AKA Jewer Collector), 
//nossos desenvolvedores produziram em tempo recorde o novo jogo de sucesso 
//RPG chato (AKA Hero Quest versão reduzida).
//Para jogar é simples, movimentos padrão com o famoso awds 
//Outras teclas para pegar tesouros etc 
//Jogo de codigo aberto, você, também desenvolvedor, pode descobrir como jogar
//lendo nosso código maneirassoooo!!!
//Quem jogou curtiu:
//"amei esse jogo, melhor jogo pqp dms vou jogar mt rpg chatoooo"
//-Oscasco, MATHEUS
//"meio chato, mas esperado de rpg chato né, atendeu as espectativas"
//-ZIKO
		package br.unicamp.ic.mc322.lab04.RPG;

import java.util.Scanner;

public class Executar {
	private static Scanner keyboard;
	
	public static void main(String[] args) {
		int aux;
		keyboard = new Scanner(System.in);
		System.out.print("Selecione o tipo de mapa desejado :\n ") ;
		System.out.print("(1) Mapa Pronto\n ") ;
		System.out.print("(2) Mapa aleatorio\n ") ;
		aux = keyboard.nextInt();
		while(aux != 1 && aux != 2){
			System.out.print("Comando Invalido!\n ") ;
			System.out.print("Selecione o tipo de mapa desejado :\n ") ;
			System.out.print("(1) Mapa Pronto\n ") ;
			System.out.print("(2) Mapa aleatorio\n ") ;
			aux = keyboard.nextInt();
		}
		Jogo jogo = new Jogo(aux);
		jogo.comecar();
	}
}
