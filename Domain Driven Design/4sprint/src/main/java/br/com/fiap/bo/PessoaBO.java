package br.com.fiap.bo;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.to.PessoaTO;

import java.sql.Connection;
import java.util.List;

public class PessoaBO implements PessoaService{
	
    Connection con = Conexao.abrirConexao();
    
    public PessoaTO insert(PessoaTO pessoa) {
        PessoaDAO pd = new PessoaDAO(con);
        return pd.inserir(pessoa);
    }
    
    public List<PessoaTO> buscar() {
    	 PessoaDAO pd = new PessoaDAO(con);
    	 return pd.buscar();
    }
    
    public PessoaTO buscar(Long id) {
    	PessoaDAO pd = new PessoaDAO(con);
    	return pd.buscar(id);
    }
}
