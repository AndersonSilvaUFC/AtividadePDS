package br.com.pds.model;

import java.util.Date;

public class Compra {
	private long id;
	private long idEstabelecimento;
	private String cartaoCliente;
	private double valorTotal;
	private Date datarealizacao;
	private int numParcelas;
	
	public Compra() {}

	public Compra(long id, long idEstabelecimento, String cartaoCliente, double valorTotal, Date datarealizacao,
			int numParcelas) {
		super();
		this.id = id;
		this.idEstabelecimento = idEstabelecimento;
		this.cartaoCliente = cartaoCliente;
		this.valorTotal = valorTotal;
		this.datarealizacao = datarealizacao;
		this.numParcelas = numParcelas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(long idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getCartaoCliente() {
		return cartaoCliente;
	}

	public void setCartaoCliente(String cartaoCliente) {
		this.cartaoCliente = cartaoCliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDatarealizacao() {
		return datarealizacao;
	}

	public void setDatarealizacao(Date datarealizacao) {
		this.datarealizacao = datarealizacao;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}
	
	
	
}
