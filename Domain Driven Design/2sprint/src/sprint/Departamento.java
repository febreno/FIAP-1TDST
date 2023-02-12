package sprint;

public class Departamento extends Empresa {

	private String codDepart;
	private String nomeDepart;
	private String endereco;
	private int telefone;
	private int vaga;
	private boolean status;
	
	public Departamento() {
		
	}
	
	@Override
	public String recursosHumanos() {
		return this.getCodDepart();
	}
	
	public void cadastrarDepart(String cd) {
		this.setCodDepart(cd);
		this.setEndereco(cd);
		this.setNomeDepart(getNomeDepart());
		this.setTelefone(0);
		this.setStatus(true);
		if(cd.equals("Código Departamento")) {
			this.getCodDepart();	
		}else if(cd.equals("Endereço")) {
			this.setEndereco(null);
		}else if(cd.equals("Telefone")) {
			this.setTelefone(0);
		}else
			System.out.println("Departamento não cadastrado");
			this.setStatus(false);
		
	}
	
	public void editarDepart(String ed) {
		this.setEndereco(ed);
		this.setTelefone(0);
		this.setStatus(true);
		if(ed.equals("Endereço X")); {
			this.setEndereco(ed);
			System.out.println("Status: " + (this.isStatus()? "ENDEREÇO ALTERADO":"ENDEREÇO NÃO ALTERADO"));
		} 
		if(ed.equals("Telefone 0")) {
			this.setTelefone(0);
			System.out.println("Status: " + (this.isStatus()? "TELEFONE ALTERADO":"TELEFONE NÃO ALTERADO"));

		}else 
			this.setStatus(false);
			System.out.println("NÃO FOI POSSÍVEL TENTE NOVAMENTE");
	}
	
	public boolean removerDepart(boolean rd) {
		if(this.removerDepart(true)) {
			System.out.println("Departamento Removido");
			return true;
		}else {
			System.out.println("Departamento não Removido");
			return false;
		}
	}
	
	public String getCodDepart() {
		return codDepart;
	}
	public void setCodDepart(String codDepart) {
		this.codDepart = codDepart;
	}
	public String getNomeDepart() {
		return nomeDepart;
	}
	public void setNomeDepart(String nomeDepart) {
		this.nomeDepart = nomeDepart;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getVaga() {
		return vaga;
	}
	public void setVaga(int vaga) {
		this.vaga = vaga;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}


