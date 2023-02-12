package br.com.fiap.sprint.model;

public class PessoaEmail {

    private Long codEmail;
    private String email;
    private Pessoa pessoa;

    public PessoaEmail(Long codEmail, String email, Pessoa pessoa) {
        this.codEmail = codEmail;
        this.email = email;
        this.pessoa = pessoa;
    }

    public Long getCodEmail() {
        return codEmail;
    }

    public void setCodEmail(Long codEmail) {
        this.codEmail = codEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
