package br.com.fiap.sprint.model;


public class Estado {

    private Integer codUf;
    private String unidadeFederativa;
    private String uf;

    public Estado(Integer codUf, String unidadeFederativa, String uf) {
        this.codUf = codUf;
        this.unidadeFederativa = unidadeFederativa;
        this.uf = uf;
    }

    public Integer getCodUf() {
        return codUf;
    }

    public void setCodUf(Integer codUf) {
        this.codUf = codUf;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}


