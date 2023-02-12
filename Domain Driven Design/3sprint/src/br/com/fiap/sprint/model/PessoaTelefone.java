package br.com.fiap.sprint.model;

public class PessoaTelefone {

    private Long codTelefone;
    private String nmTelefone;
    private Pessoa pessoa;

    public PessoaTelefone(Long codTelefone, String nmTelefone, Pessoa pessoa) {
        this.codTelefone = codTelefone;
        this.nmTelefone = nmTelefone;
        this.pessoa = pessoa;
    }

    public Long getCodTelefone() {
        return codTelefone;
    }

    public void setCodTelefone(Long codTelefone) {
        this.codTelefone = codTelefone;
    }

    public String getNmTelefone() {
        return nmTelefone;
    }

    public void setNmTelefone(String nmTelefone) {
        this.nmTelefone = nmTelefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
