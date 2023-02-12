package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.to.VagaTO;


public interface VagaService {

	public List<VagaTO> buscar();
	public VagaTO buscar(Long id);
	public void insert(VagaTO vaga);
	public void atualizar(VagaTO vaga);
	public void deletar(VagaTO vaga);
}
