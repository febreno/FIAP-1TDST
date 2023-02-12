package br.com.fiap.sprint.model;

import java.io.Serializable;
import java.util.ArrayList;

public class VagaCategoria {

    private Long codCategoria;
    private String nomeCategoria;

    public VagaCategoria(Long codCategoria, String nomeCategoria) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public Long getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Long codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

}


