package br.com.fiap.sprint.model;

import java.util.ArrayList;

public class Vaga {

    private Long idVaga;
    private String statusVaga;
    private ArrayList<VagaCategoria> categorias;

    public Vaga(Long idVaga, String statusVaga) {
        this.idVaga = idVaga;
        this.statusVaga = statusVaga;
        categorias = new ArrayList<VagaCategoria>();
    }

    public Long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Long idVaga) {
        this.idVaga = idVaga;
    }

    public String getStatusVaga() {
        return statusVaga;
    }

    public void setStatusVaga(String statusVaga) {
        this.statusVaga = statusVaga;
    }

    public void cadastrarCategoria(VagaCategoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(VagaCategoria categoria) {
        categorias.remove(categoria);
    }
}
