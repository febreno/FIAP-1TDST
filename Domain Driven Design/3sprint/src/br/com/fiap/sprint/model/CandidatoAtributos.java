package br.com.fiap.sprint.model;

import java.util.ArrayList;

public class CandidatoAtributos {

    private Long idAtributo;
    private Candidato candidato;
    ArrayList<AtributosNome> atributos;

    public CandidatoAtributos(Long idAtributo, Candidato candidato) {
        this.idAtributo = idAtributo;
        this.candidato = candidato;
        atributos = new ArrayList<AtributosNome>();
    }

    public Long getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(Long idAtributo) {
        this.idAtributo = idAtributo;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public void cadastrarAtributo(AtributosNome atributo) {
        atributos.add(atributo);
    }

    public void deletarAtributo(AtributosNome atributo) {
        atributos.remove(atributo);
    }
}
