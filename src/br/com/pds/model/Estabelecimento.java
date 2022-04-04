package br.com.pds.model;

public class Estabelecimento {
	private long id;
	private String nome;
	private int maxParcelas;
	
	public Estabelecimento() {}

	public Estabelecimento(long id, String nome, int maxParcelas) {
		super();
		this.id = id;
		this.nome = nome;
		this.maxParcelas = maxParcelas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxParcelas() {
		return maxParcelas;
	}

	public void setMaxParcelas(int maxParcelas) {
		this.maxParcelas = maxParcelas;
	}
	
	
}
