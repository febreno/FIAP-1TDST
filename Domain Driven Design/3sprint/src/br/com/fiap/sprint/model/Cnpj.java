package br.com.fiap.sprint.model;

public class Cnpj {

    private Long codCnpj;
    private Empresa empresa;
    private String cnpj;

    public Cnpj(Long codCnpj, Empresa empresa, String cnpj) {
        this.codCnpj = codCnpj;
        this.empresa = empresa;
        this.cnpj = cnpj;
    }

    public Long getCodCnpj() {
        return codCnpj;
    }

    public void setCodCnpj(Long codCnpj) {
        this.codCnpj = codCnpj;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
