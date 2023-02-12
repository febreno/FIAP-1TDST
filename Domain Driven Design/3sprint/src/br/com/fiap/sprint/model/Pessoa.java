package br.com.fiap.sprint.model;

public class Pessoa {

    private Long codPessoa;
    private String tipoPessoa;

    public Pessoa(Long codPessoa, String tipoPessoa) {
        this.codPessoa = codPessoa;
        this.tipoPessoa = tipoPessoa;
    }

    public Long getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
