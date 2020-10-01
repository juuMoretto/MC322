//Uber da juju
//Julia Machado Moretto
//Lab 10
//"App topzera"- ZIKO, Cachorro da Julia
//"Depois do isolamento vou muito usar o uber da juju pra ir nos roles"
// - Aninha, Amiga da Julia

package br.unicamp.ic.mc322.lab10;
public class Uber {
	public static void main ( String [] args ) {
		//Crie os usuários:
		//Marcos, com CPF 145678798, e data de nascimento
		//15/07/1998, passageiro, número do cartão 369874. 
		
		Passageiro passageiro_1 = new Passageiro("Marcos", "145678798","15/07/1998", "369874");
		//Maria, com CPF
		//248679108, e data de nascimento 12/02/1997, motorista, habilitação 987654,
		//número do cartão 483530, 
		Motorista motorista_1  = new Motorista("Maria", "248679108", "12/02/1997", "483530", "987654");
		
		//e possui dois carros, 
		//um de ano 2009 placa
		//ABC-1234 modelo luxo, e 
		Veiculo carro_1 = new Veiculo("ABC-1234", 2009, TipoVeiculo.LUXO);
		//um ano 2013 placa OOP-2020 modelo comum.
		Veiculo carro_2 = new Veiculo ("OOP-2020", 2013, TipoVeiculo.COMUM);
		
		motorista_1.AdicionaCarro(carro_1);
		motorista_1.AdicionaCarro(carro_2);
		
		//João, com CPF 654973652, e data de nascimento 03/01/2002, passageiro,
		//número do cartão 785632.
		Passageiro passageiro_2 = new Passageiro("João", "654973652", "03/01/2002", "785632");
	
		//Faça uma viagem de Marcos com Maria, em seu carro de luxo, distância
		//de 500 metros, com duas paradas.
		//do jeito que eu codei as paradas sao especificadas por distancia entao 
		//parada 1 = 100 metros
		//parada 2 = 300 metros
		
		Viagem viagem_1 = new Viagem(motorista_1, carro_1, 0.5);
		viagem_1.AdicionaPassageiro(passageiro_1);
		Parada parada_1 = new Parada(viagem_1,0.1);
		Parada parada_2 = new Parada(viagem_1, 0.3);
		viagem_1.AdiconaParada(parada_1);
		viagem_1.AdiconaParada(parada_2);
		
		viagem_1.PercorreParadas();
		viagem_1.CalculaPreço();
		System.out.println("Fim da viagem");
		
		//Faça uma viagem de Marcos e João com Maria, em seu carro comum,
		//distância de 2 km, com 5 paradas, em que João terminará sua viagem na
		//terceira parada.
		
		Viagem viagem_2 = new Viagem(motorista_1, carro_2, 2);
		viagem_2.AdicionaPassageiro(passageiro_1);
		viagem_2.AdicionaPassageiro(passageiro_2);
		Parada parada01 = new Parada(viagem_2, 0.2);
		viagem_2.AdiconaParada(parada01);
		Parada parada02 = new Parada(viagem_2, 0.3);
		viagem_2.AdiconaParada(parada02);
		Parada parada03 = new Parada(viagem_2, 0.5);
		parada03.AdicionaSaideiro(passageiro_2);
		viagem_2.AdiconaParada(parada03);
		Parada parada04 = new Parada(viagem_2, 1);
		viagem_2.AdiconaParada(parada04);
		Parada parada05 = new Parada(viagem_2, 1.4);
		viagem_2.AdiconaParada(parada05);
		
		viagem_2.PercorreParadas();
		viagem_2.CalculaPreço();
		System.out.println("Fim da viagem");
		
		//Faça uma viagem de João com Maria em seu carro de luxo, distância de
		//700m, 3 paradas.
		
		Viagem viagem_3 = new Viagem(motorista_1, carro_1, 0.7);
		viagem_3.AdicionaPassageiro(passageiro_2);
		Parada parada1 = new Parada(viagem_3, 0.1);
		viagem_3.AdiconaParada(parada1);
		Parada parada2 = new Parada(viagem_3, 0.4);
		viagem_3.AdiconaParada(parada2);
		Parada parada3 = new Parada(viagem_3, 0.6);
		viagem_3.AdiconaParada(parada3);
		
		viagem_3.PercorreParadas();
		viagem_3.CalculaPreço();
		System.out.println("Fim da viagem");
		
		
		

}}
