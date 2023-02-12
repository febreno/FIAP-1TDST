package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.to.PessoaTO;

public interface PessoaService {
	
	public PessoaTO insert(PessoaTO pessoa);
	public List<PessoaTO> buscar();
	public PessoaTO buscar(Long id);
}
