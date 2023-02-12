package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.to.UsuarioTO;
import br.com.fiap.to.VagaTO;

public class VagaDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public VagaDAO(Connection con) {
		setCon(con);
	}

	public List<VagaTO> buscar() {

		List<VagaTO> vagas = new ArrayList<>();

		String sql = "SELECT * FROM VAGA";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Long idVaga = rs.getLong("ID_VAGA");
				Integer codCategoria = rs.getInt(2);
				String statusVaga = rs.getString("STATUS_VAGA");
				String descricao = rs.getString("DESCRICAO");
				Date dataAbertura = rs.getDate("DATA_ABERTURA");
				Date dataFechamento = rs.getDate("DATA_FECHAMENTO");
				String localizacao = rs.getString("LOCALIZACAO");

				vagas.add(new VagaTO(idVaga, codCategoria, statusVaga, descricao, dataAbertura, dataFechamento,
						localizacao));
			}
			return vagas;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public VagaTO buscar(Long id) {

		String sql = "SELECT * FROM VAGA WHERE ID_VAGA = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setLong(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Long idVaga = rs.getLong("ID_VAGA");
				Integer codCategoria = rs.getInt(2);
				String statusVaga = rs.getString("STATUS_VAGA");
				String descricao = rs.getString("DESCRICAO");
				Date dataAbertura = rs.getDate("DATA_ABERTURA");
				Date dataFechamento = rs.getDate("DATA_FECHAMENTO");
				String localizacao = rs.getString("LOCALIZACAO");

				return new VagaTO(idVaga, codCategoria, statusVaga, descricao, dataAbertura, dataFechamento,
						localizacao);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public VagaTO inserir(VagaTO vaga) {
		String sql = "INSERT INTO VAGA (VAGA_CATEGORIA_COD_CATEGORIA," + " STATUS_VAGA," + " DESCRICAO,"
				+ " LOCALIZACAO) " + "VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setLong(1, vaga.getCodVagaCategoria());
			ps.setString(2, vaga.getStatusVaga());
			ps.setString(3, vaga.getDescricao());
			ps.setString(4, vaga.getLocalizacao());

			if (ps.executeUpdate() > 0) {
				return vaga;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void atualizar(VagaTO vaga) {
		String sql = "UPDATE VAGA " + 
	                 "SET VAGA_CATEGORIA_COD_CATEGORIA = ?," + 
				     " STATUS_VAGA = ?," + 
	                 " DESCRICAO = ?," +
				     " LOCALIZACAO = ? " + 
	                 "WHERE ID_VAGA = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setLong(1, vaga.getCodVagaCategoria());
			ps.setString(2, vaga.getStatusVaga());
			ps.setString(3, vaga.getDescricao());
			ps.setString(4, vaga.getLocalizacao());
			ps.setLong(5, vaga.getIdVaga());
			
			ps.execute();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void deletar(VagaTO vaga) {
		String sql = "DELETE FROM VAGA WHERE ID_VAGA = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setLong(1, vaga.getIdVaga());
			
			ps.execute();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
