package br.unicamp.ic.mc322.lab10;

public class Veiculo {
	String placa;
	private int fabricacao;
	private Motorista dono;
	private TipoVeiculo tipo = TipoVeiculo.COMUM;
	
	public Veiculo(String placa, int fabricacao, TipoVeiculo tipo) {
		this.placa = placa;
		this.fabricacao = fabricacao;
		this.tipo = tipo;
	}
	public void AdicionaDono(Motorista dono ) {
		this.dono = dono;
	}
	public boolean EhLuxo() {
		return tipo.equals(TipoVeiculo.LUXO);
		}
}
