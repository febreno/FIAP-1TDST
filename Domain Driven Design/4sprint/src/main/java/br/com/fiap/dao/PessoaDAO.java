package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.to.PessoaTO;

public class PessoaDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public PessoaDAO(Connection con) {
		setCon(con);
	}

	public PessoaTO inserir(PessoaTO pessoa) {
		try {
			String sqlPessoa = "INSERT INTO PESSOA(TIPO_PESSOA) VALUES (?)";

			PreparedStatement ps = getCon().prepareStatement(sqlPessoa);

			ps.setString(1, pessoa.getTipoPessoa());

			if (ps.executeUpdate() > 0) {
				return pessoa;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return null;
	}
	
	public String inserir(String recrutador) {
		try {
			String sqlPessoa = "INSERT INTO PESSOA(TIPO_PESSOA) VALUES (?)";

			PreparedStatement ps = getCon().prepareStatement(sqlPessoa);

			ps.setString(1, recrutador);

			if (ps.executeUpdate() > 0) {
				return recrutador;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<PessoaTO> buscar() {
		try {
			List<PessoaTO> pessoas = new ArrayList<>();

			String sql = "SELECT * FROM PESSOA";

			PreparedStatement ps = getCon().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Long codPessoa = rs.getLong("COD_PESSOA");
				String tipoPessoa = rs.getString("TIPO_PESSOA");
				Date dataCadastro = rs.getDate("DATA_REGISTRO");

				pessoas.add(new PessoaTO(codPessoa, tipoPessoa, dataCadastro));
			}
			return pessoas;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
	
	public PessoaTO buscar(Long codPessoa) {
		try {
			
			String sql = "SELECT * FROM PESSOA WHERE COD_PESSOA = ?";

			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setLong(1, codPessoa);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Long codPessoa1 = rs.getLong("COD_PESSOA");
				String tipoPessoa = rs.getString("TIPO_PESSOA");
				Date dataCadastro = rs.getDate("DATA_REGISTRO");
				
				return new PessoaTO(codPessoa1, tipoPessoa, dataCadastro);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
}
