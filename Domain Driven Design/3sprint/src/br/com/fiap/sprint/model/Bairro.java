package br.com.fiap.sprint.model;

public class Bairro {

    private Long codBairro;
    private String nomeBairro;
    private Cidade cidade;
    public Bairro(Long codBairro, String nomeBairro, Cidade cidade) {
        this.codBairro = codBairro;
        this.nomeBairro = nomeBairro;
        this.cidade = cidade;
    }

    public Long getCodBairro() {
        return codBairro;
    }

    public void setCodBairro(Long codBairro) {
        this.codBairro = codBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
