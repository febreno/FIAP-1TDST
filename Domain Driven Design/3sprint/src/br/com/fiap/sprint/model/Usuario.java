package br.com.fiap.sprint.model;

import java.util.Date;

public class Usuario {

    private Long idUsuario;
    private Pessoa pessoa;
    private String codUsuario;
    private Character statusUsuario;
    private String tipoUsuario;
    private Date dataRegistro;

    public Usuario(Long idUsuario, Pessoa pessoa, String codUsuario, Character statusUsuario, String tipoUsuario, Date dataRegistro) {
        this.idUsuario = idUsuario;
        this.pessoa = pessoa;
        this.codUsuario = codUsuario;
        this.statusUsuario = statusUsuario;
        this.tipoUsuario = tipoUsuario;
        this.dataRegistro = dataRegistro;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
