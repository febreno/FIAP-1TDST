package br.com.fiap.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.dao.VagaDAO;
import br.com.fiap.to.VagaTO;

public class VagaBO implements VagaService {

	Connection con = Conexao.abrirConexao();

	@Override
	public List<VagaTO> buscar() {
		VagaDAO vd = new VagaDAO(con);
		return vd.buscar();
	}
	
	@Override
	public VagaTO buscar(Long id) {
		VagaDAO vd = new VagaDAO(con);
		return vd.buscar(id);
	}
	@Override
	public void insert(VagaTO vaga) {
		VagaDAO vd = new VagaDAO(con);
		 vd.inserir(vaga);
	}
	@Override
	public void atualizar(VagaTO vaga) {
		VagaDAO vd = new VagaDAO(con);
		vd.atualizar(vaga);
	}
	@Override
    public void deletar(VagaTO vaga) {
    	VagaDAO vd = new VagaDAO(con);
    	vd.deletar(vaga);
  
    }

}
