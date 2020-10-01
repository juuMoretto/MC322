package br.unicamp.ic.mc322.lab10;
public class Usuario {
	String nome;
	private String cpf;
	private String data;
	private String cartao;
	
	public Usuario(String nome, String cpf, String data, String cartao){
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.cartao = cartao;
	}
}
