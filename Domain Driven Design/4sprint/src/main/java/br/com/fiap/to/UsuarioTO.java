package br.com.fiap.to;

import java.util.Date;

public class UsuarioTO {

    private Long idUsuario;
    private Long idPessoa;
    private String codUsuario;
    private Character statusUsuario;
    private String tipoUsuario;
    private Date dataRegistro;
    private String senha;

    public UsuarioTO(Long idUsuario, Long idPessoa, String codUsuario, Character statusUsuario, String tipoUsuario, Date dataRegistro, String senha) {
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.codUsuario = codUsuario;
        this.statusUsuario = statusUsuario;
        this.tipoUsuario = tipoUsuario;
        this.dataRegistro = dataRegistro;
        this.senha = senha;
    }
    
    public UsuarioTO(Long idUsuario, Long idPessoa, String codUsuario, Character statusUsuario, String tipoUsuario, String senha) {
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.codUsuario = codUsuario;
        this.statusUsuario = statusUsuario;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
    }
    
    public UsuarioTO() {
    	
    }

    public UsuarioTO(Long idUsuario2, Long idPessoa2, String codUsuario2, Date dataRegistro2, Character statusUsuario, String tipoUsuario2,
			String senhaUsuario) {
        this.idUsuario = idUsuario2;
        this.idPessoa = idPessoa2;
        this.codUsuario = codUsuario2;
        this.statusUsuario = statusUsuario;
        this.dataRegistro = dataRegistro2;
        this.tipoUsuario = tipoUsuario2;
        this.senha = senhaUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getPessoa() {
        return idPessoa;
    }

    public void setPessoa(Long pessoa) {
        this.idPessoa = pessoa;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Character getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(Character statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
