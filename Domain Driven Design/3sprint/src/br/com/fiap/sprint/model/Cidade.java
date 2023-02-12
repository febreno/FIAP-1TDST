package br.com.fiap.sprint.model;

public class Cidade {

    private Long codCidade;
    private String nomCidade;
    private Estado estado;

    public Cidade(Long codCidade, String nomCidade, Estado estado) {
        this.codCidade = codCidade;
        this.nomCidade = nomCidade;
        this.estado = estado;
    }

    public Long codCidade() {
        return codCidade;
    }

    public void setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
    }

    public String nomCidade() {
        return nomCidade;
    }

    public void setNomCidade(String nomCidade) {
        this.nomCidade = nomCidade;
    }

    public Long getCodCidade() {
        return codCidade;
    }

    public String getNomCidade() {
        return nomCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
