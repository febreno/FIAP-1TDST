package br.com.fiap.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class UsuarioBO implements UsuarioService {
	
	Connection con = Conexao.abrirConexao();
	
	@Override
    public UsuarioTO insert(UsuarioTO usuario) {
        UsuarioDAO ud = new UsuarioDAO(con);
        
        // nome do usuario não pode ser maior q 20 caracteres
        if (usuario.getCodUsuario().length() > 20) {
        	return null;
        	
        //senha precisa ser maior que 6 caracteres
        } else if (usuario.getSenha().length() < 6) {
        	return null;
        } 
        return ud.inserir(usuario);
    }
    
    public List<UsuarioTO> buscar() {
    	UsuarioDAO ud = new UsuarioDAO(con);
    	return ud.buscar();
    }
    
    public UsuarioTO buscar(String usuario) {
    	UsuarioDAO ud = new UsuarioDAO(con);
    	return ud.buscar(usuario);
    }
    
    public void deletar(UsuarioTO usuario) {
    	UsuarioDAO ud = new UsuarioDAO(con);
    	ud.deletar(usuario);
  
    }
    
    public void atualizar(UsuarioTO usuario) {
    	UsuarioDAO ud = new UsuarioDAO(con);
    	ud.atualizar(usuario);
    }
    
    public boolean validaSenha(UsuarioTO usuario) {
    	UsuarioDAO ud = new UsuarioDAO(con);
    	UsuarioTO usuarioBanco = ud.buscar(usuario.getCodUsuario());
    	
    	if (!usuarioBanco.getSenha().equals(usuario.getSenha())) {
    		return false;
    	}
    	return true;
    }
}
