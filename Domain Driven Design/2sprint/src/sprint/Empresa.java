package sprint;

public abstract class Empresa {
	
	private int cnpj;
	private int telefone;
	private String nome;
	private String endereco;
	private boolean status;
	
	public Empresa() {
	
	}

	public void editarEmpresa(String e) {
		this.setEndereco(e);
		this.setTelefone(0);
		this.setStatus(true);
		if(e.equals("Endereço X")); {
			this.setEndereco(e);	
		} 
		if(e.equals("Telefone 0")) {
			this.setTelefone(0);
		}else {
			this.setStatus(false);
		}
	}
	
	public void listarEmpresa(String l) {
		System.out.println("CNPJ: " + this.getCnpj() +
		"\nA Nome: " + this.getNome());
		System.out.println("Status: " + (this.isStatus()? "LISTADA": "NÃO LISTADA"));
		
	}
	
	public abstract String recursosHumanos();
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
