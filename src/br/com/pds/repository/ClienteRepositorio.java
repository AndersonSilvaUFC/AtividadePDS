package br.com.pds.repository;

import java.util.Set;

import br.com.pds.model.Cliente;

public class ClienteRepositorio {
	private Set<Cliente> clientes;
	
	public void salvarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public Cliente buscarPorCpf(String cpf) {
		for(Cliente c : this.clientes) {
			if(c.getCpf().equals(cpf))
				return c;
		}
		return null;
	}
	
	public Cliente buscarPorCartao(String cartao) {
		for(Cliente c : this.clientes) {
			if(c.getCartao().equals(cartao))
				return c;
		}
		return null;
	}
}
