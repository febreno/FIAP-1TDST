package br.com.fiap.sprint.model;

public class PessoaEndereco {

    private Long codEndereco;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private Bairro bairro;
    private Pessoa pessoa;

    public PessoaEndereco(Long codEndereco, Long codPessoa, String cep, String rua, Integer numero, String complemento, Bairro bairro, Pessoa pessoa) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pessoa = pessoa;
    }

    public PessoaEndereco(Long codEndereco, Long codPessoa, String cep, String rua, Integer numero, Bairro bairro, Pessoa pessoa) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.pessoa = pessoa;
    }

    public Long getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Long codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
