package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.to.PessoaTO;
import br.com.fiap.to.UsuarioTO;

public class UsuarioDAO {
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public UsuarioDAO(Connection con) {
		setCon(con);
	}

	public UsuarioTO inserir(UsuarioTO usuario) {
		try {
			String sqlPessoa = "INSERT INTO PESSOA(TIPO_PESSOA) VALUES ('Usuario')";
			PreparedStatement ps = getCon().prepareStatement(sqlPessoa);
			ps.executeUpdate();

			String sqlPessoa1 = "SELECT MAX(COD_PESSOA) FROM PESSOA";
			PreparedStatement ps1 = getCon().prepareStatement(sqlPessoa1);
			ResultSet resultado = ps1.executeQuery();

			Long id = (long) 0;

			if (resultado.next()) {
				id = resultado.getLong(1);
			}

			String sql = "INSERT INTO USUARIO(" + " PESSOA_COD_PESSOA," + " COD_USUARIO," + " STATUS_USUARIO,"
					+ " TIPO_USUARIO," + " SENHA_USUARIO)" + "VALUES (?, ?, ?, ?, ?)";

			PreparedStatement ps2 = getCon().prepareStatement(sql);
			ps2.setLong(1, id);
			ps2.setString(2, usuario.getCodUsuario());
			ps2.setString(3, String.valueOf(usuario.getStatusUsuario()));
			ps2.setString(4, usuario.getTipoUsuario());
			ps2.setString(5, usuario.getSenha());

			if (ps2.executeUpdate() > 0) {
				return usuario;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<UsuarioTO> buscar() {
		try {
			List<UsuarioTO> usuarios = new ArrayList<>();

			String sql = "SELECT * FROM USUARIO";

			PreparedStatement ps = getCon().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Long idUsuario = rs.getLong("ID_USUARIO");
				Long idPessoa = rs.getLong("PESSOA_COD_PESSOA");
				String codUsuario = rs.getString("COD_USUARIO");
				String aux = rs.getString(String.valueOf("STATUS_USUARIO"));
				Date dataRegistro = rs.getDate("DATA_REGISTRO");
				Character statusUsuario = aux.charAt(0);
				String tipoUsuario = rs.getString("TIPO_USUARIO");
				String senhaUsuario = rs.getString("SENHA_USUARIO");

				usuarios.add(new UsuarioTO(idUsuario, idPessoa, codUsuario, dataRegistro, statusUsuario, tipoUsuario,
						senhaUsuario));
			}
			return usuarios;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public UsuarioTO buscar(String cdUsuario) {
		try {

			String sql = "SELECT * FROM USUARIO WHERE COD_USUARIO = ?";

			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setString(1, cdUsuario);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Long idUsuario = rs.getLong("ID_USUARIO");
				Long idPessoa = rs.getLong("PESSOA_COD_PESSOA");
				String codUsuario = rs.getString("COD_USUARIO");
				String aux = rs.getString(String.valueOf("STATUS_USUARIO"));
				Date dataRegistro = rs.getDate("DATA_REGISTRO");
				Character statusUsuario = aux.charAt(0);
				String tipoUsuario = rs.getString("TIPO_USUARIO");
				String senhaUsuario = rs.getString("SENHA_USUARIO");

				return new UsuarioTO(idUsuario, idPessoa, codUsuario, dataRegistro, statusUsuario, tipoUsuario,
						senhaUsuario);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public void deletar(UsuarioTO usuario) {
		String sql = "DELETE FROM USUARIO WHERE ID_USUARIO = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setLong(1, usuario.getIdUsuario());
			
			ps.execute();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void atualizar(UsuarioTO usuario) {
		String sql = "UPDATE USUARIO "
				+ "   SET COD_USUARIO = ?, "
				+ "   STATUS_USUARIO = ?, "
				+ "	  TIPO_USUARIO = ?, "
				+ "   SENHA_USUARIO = ? "
				+ "   WHERE ID_USUARIO = ? ";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setString(1, usuario.getCodUsuario());
			ps.setString(2, String.valueOf(usuario.getStatusUsuario()));
			ps.setString(3, usuario.getTipoUsuario());
			ps.setString(4, usuario.getSenha());
			ps.setLong(5, usuario.getIdUsuario());
			
			ps.execute();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
