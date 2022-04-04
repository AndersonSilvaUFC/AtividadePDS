package br.com.pds.model;

import java.util.Date;

public class Parcela {
	private long idCompra;
	private double valor;
	private Date dataVencimento;
	
	public Parcela() {}

	public Parcela(long idCompra, double valor, Date dataVencimento) {
		super();
		this.idCompra = idCompra;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
