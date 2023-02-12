package br.com.fiap.sprint.model;

public class Recrutador {

    private Long codRecrutador;
    private Pessoa pessoa;
    private String nome;
    private String cpf;

    public Recrutador(Long codRecrutador, Pessoa pessoa, String nome, String cpf) {
        this.codRecrutador = codRecrutador;
        this.pessoa = pessoa;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getCodRecrutador() {
        return codRecrutador;
    }

    public void setCodRecrutador(Long codRecrutador) {
        this.codRecrutador = codRecrutador;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
