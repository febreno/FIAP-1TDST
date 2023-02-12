package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.to.UsuarioTO;

public interface UsuarioService {
	
	public UsuarioTO insert(UsuarioTO usuario);
	public List<UsuarioTO> buscar();
	public UsuarioTO buscar(String usuario);
	public void deletar(UsuarioTO usuario);
	public void atualizar(UsuarioTO usuario);
	public boolean validaSenha(UsuarioTO usuario);
	
}
