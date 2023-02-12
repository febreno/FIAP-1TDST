package sprint;

public class Vaga extends Departamento {
	
	private int codVaga;
	private String tituloVaga;
	private String descVaga;
	private String empresa;
	private String dataVaga;
	private boolean status;
	
	public Vaga() {
	
	}
	
	public void cadastrarVaga(String cad) {
		this.setCodVaga(0);
		this.setDescVaga(cad);
		this.setDataVaga(cad);
		this.setTituloVaga(cad);
		this.setEmpresa(cad);
		if(cad.equals("Código Vaga")) {
			this.getCodVaga();
		}else if(cad.equals("Descrição Vaga")) {
			this.getDescVaga();
		}else if(cad.equals("Data da Vaga")) {
			this.getDataVaga();
		}else if(cad.equals("Título da Vaga")) {
			this.getTituloVaga();
		}else if(cad.equals("Empresa")) {
			this.getEmpresa();
		}else {
			System.out.println("Vaga não cadastrada");
			this.setStatus(false);
		}
	}
	
	public void excluirVaga(boolean ex) {
		if(this.equals("excluir")) {
			System.out.println("Vaga Encerrada" + this.getCodVaga());
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}
	}
	
	public int getCodVaga() {
		return codVaga;
	}
	public void setCodVaga(int codVaga) {
		this.codVaga = codVaga;
	}
	public String getTituloVaga() {
		return tituloVaga;
	}
	public void setTituloVaga(String tituloVaga) {
		this.tituloVaga = tituloVaga;
	}
	public String getDescVaga() {
		return descVaga;
	}
	public void setDescVaga(String descVaga) {
		this.descVaga = descVaga;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDataVaga() {
		return dataVaga;
	}
	public void setDataVaga(String dataVaga) {
		this.dataVaga = dataVaga;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
