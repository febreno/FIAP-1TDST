package br.com.fiap.sprint.model;

public class AtributosNome {

    private Long codAtributo;
    private String nomeAtributo;

    public AtributosNome(Long codAtributo, String nomeAtributo) {
        this.codAtributo = codAtributo;
        this.nomeAtributo = nomeAtributo;
    }

    public Long getCodAtributo() {
        return codAtributo;
    }

    public void setCodAtributo(Long codAtributo) {
        this.codAtributo = codAtributo;
    }

    public String getNomeAtributo() {
        return nomeAtributo;
    }

    public void setNomeAtributo(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }
}
