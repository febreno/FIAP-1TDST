package br.com.fiap.sprint.model;

import java.util.Date;

public class Empresa {

    private Long codEmpresa;
    private String razaoSocial;
    private String nomeFantasia;
    private Date dataFundacao;
    private String website;
    private Pessoa pessoa;

    public Empresa(Long codEmpresa, String razaoSocial, String nomeFantasia, Date dataFundacao, String website, Pessoa pessoa) {
        this.codEmpresa = codEmpresa;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.dataFundacao = dataFundacao;
        this.website = website;
        this.pessoa = pessoa;
    }

    public Empresa(Long codEmpresa, String razaoSocial, String nomeFantasia, Date dataFundacao, Pessoa pessoa) {
        this.codEmpresa = codEmpresa;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.dataFundacao = dataFundacao;
        this.pessoa = pessoa;
    }

    public Long getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
