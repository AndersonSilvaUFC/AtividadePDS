package br.com.pds.model;

public class Cliente {
	private String nome;
	private String cpf;
	private String senha;
	private String cartao;
	private double limiteCreditoAtual;
	private double limitecreditoMax;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String senha, String cartao, double limiteCreditoAtual,
			double limitecreditoMax) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.cartao = cartao;
		this.limiteCreditoAtual = limiteCreditoAtual;
		this.limitecreditoMax = limitecreditoMax;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public double getLimiteCreditoAtual() {
		return limiteCreditoAtual;
	}

	public void setLimiteCreditoAtual(double limiteCreditoAtual) {
		this.limiteCreditoAtual = limiteCreditoAtual;
	}

	public double getLimitecreditoMax() {
		return limitecreditoMax;
	}

	public void setLimitecreditoMax(double limitecreditoMax) {
		this.limitecreditoMax = limitecreditoMax;
	}
	
	
	
}
