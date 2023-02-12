package br.com.fiap.to;

import java.util.Date;

import javax.ws.rs.Path;

@Path("/produto")
public class PessoaTO {

    private Long codPessoa;
    private String tipoPessoa;
    private Date dataCadastro;

    public PessoaTO(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    public PessoaTO() {
    }

    public PessoaTO(Long codPessoa, String tipoPessoa, Date dataCadastro) {
		this.codPessoa = codPessoa;
		this.tipoPessoa = tipoPessoa;
		this.dataCadastro = dataCadastro;
	}
    
    public PessoaTO(Long codPessoa, String tipoPessoa) {
		this.codPessoa = codPessoa;
		this.tipoPessoa = tipoPessoa;
	}

	public Long getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
