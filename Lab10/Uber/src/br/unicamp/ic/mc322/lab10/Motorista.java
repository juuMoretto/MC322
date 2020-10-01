package br.unicamp.ic.mc322.lab10;
import java.util.ArrayList;
public class Motorista extends Usuario{
	private String habilitacao;
	private ArrayList<Veiculo> veiculos = new ArrayList();

	public Motorista(String nome, String cpf, String data, String cartao, String habilitacao){
		super(nome,cpf,data,cartao);
		this.habilitacao = habilitacao;
	}
	
	void AdicionaCarro(Veiculo carro){
		veiculos.add(carro);
		carro.AdicionaDono(this);
	}
}
