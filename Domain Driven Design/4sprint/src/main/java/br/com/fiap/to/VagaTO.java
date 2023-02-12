package br.com.fiap.to;

import java.util.Date;

public class VagaTO {
	
	private Long idVaga;
	private Integer codVagaCategoria;
	private String statusVaga;
	private String descricao;
	private Date dataAbertura;
	private Date dataFechamento;
	private String localizacao;
	
	
	
	public VagaTO(Long idVaga, Integer codVagaCategoria, String statusVaga, String descricao, Date dataAbertura,
			Date dataFechamento, String localizacao) {
		this.idVaga = idVaga;
		this.codVagaCategoria = codVagaCategoria;
		this.statusVaga = statusVaga;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.localizacao = localizacao;
	}
	
	
	
	public VagaTO(Long idVaga, Integer codVagaCategoria, String statusVaga, String descricao, Date dataAbertura,
			Date dataFechamento) {
		this.idVaga = idVaga;
		this.codVagaCategoria = codVagaCategoria;
		this.statusVaga = statusVaga;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
	}
	
	public VagaTO() {
		
	}
	
	public Long getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(Long idVaga) {
		this.idVaga = idVaga;
	}
	public Integer getCodVagaCategoria() {
		return codVagaCategoria;
	}
	public void setCodVagaCategoria(Integer codVagaCategoria) {
		this.codVagaCategoria = codVagaCategoria;
	}
	public String getStatusVaga() {
		return statusVaga;
	}
	public void setStatusVaga(String statusVaga) {
		this.statusVaga = statusVaga;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
