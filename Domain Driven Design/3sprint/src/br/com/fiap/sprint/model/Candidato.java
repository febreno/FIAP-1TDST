package br.com.fiap.sprint.model;

import java.util.Date;

public class Candidato  {

    private String nome;
    private String sobrenome;
    private Date dtNascimento;
    private String nmReservista;
    private String rg;
    private String cpf;
    private String estadoCivil;
    private Pessoa pessoa;

    public Candidato(String nome, String sobrenome, Date dtNascimento, String nmReservista, String rg, String cpf, String estadoCivil, Pessoa pessoa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.nmReservista = nmReservista;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.pessoa = pessoa;
    }

    public Candidato(String nome, String sobrenome, Date dtNascimento, String rg, String cpf, String estadoCivil, Pessoa pessoa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.pessoa = pessoa;
    }

    public Candidato(String nome, Date dtNascimento, String nmReservista, String rg, String cpf, String estadoCivil, Pessoa pessoa) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.nmReservista = nmReservista;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.pessoa = pessoa;
    }

    public Candidato(String nome, Date dtNascimento, String rg, String cpf, String estadoCivil, Pessoa pessoa) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNmReservista() {
        return nmReservista;
    }

    public void setNmReservista(String nmReservista) {
        this.nmReservista = nmReservista;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
