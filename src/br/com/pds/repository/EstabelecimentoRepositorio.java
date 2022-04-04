package br.com.pds.repository;

import java.util.Set;

import br.com.pds.model.Estabelecimento;

public class EstabelecimentoRepositorio {
	public Set<Estabelecimento> estabelecimentos;
	
	public void salvarEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimentos.add(estabelecimento);
	}
	
	public Estabelecimento buscarPorId(long id) {
		for(Estabelecimento e : this.estabelecimentos) {
			if(e.getId() == id)
				return e;
		}
		return null;
	}
}
