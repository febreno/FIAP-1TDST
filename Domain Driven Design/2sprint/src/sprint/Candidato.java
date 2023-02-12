package sprint;

public class Candidato extends Usuario {
	
	private String codCandidato;
	private String endereco;
	private String curriculo;
	private int cpf;
	private int telefone;
	private boolean status;
	

	public Candidato() {
	
	}

	public void cadastrarCandidato(String cc) {
		this.setCodCandidato(cc);
		this.setEndereco(cc);
		this.setCurriculo(getCurriculo());
		this.setTelefone(0);
		this.setStatus(true);
		if(cc.equals("Código Candidato")) {
			this.getCodCandidato();	
		}else if(cc.equals("UPLOAD CV")) {
			this.setCurriculo(getCurriculo());
		}else if(cc.equals("Telefone")) {
			this.setTelefone(0);
		}else
			System.out.println("Candidato não cadastrado");
			this.setStatus(false);
		}
	
	public void editarCandidato(String ed) {
			this.setEndereco(ed);
			this.setTelefone(0);
			this.setCurriculo("abc");
			this.setStatus(true);
			if(ed.equals("Endereço X")); {
				this.setEndereco(ed);
				System.out.println("Status: " + (this.isStatus()? "ENDEREÇO ALTERADO":"ENDEREÇO NÃO ALTERADO"));
			} 
			if(ed.equals("Telefone 0")) {
				this.setTelefone(0);
				System.out.println("Status: " + (this.isStatus()? "TELEFONE ALTERADO":"TELEFONE NÃO ALTERADO"));

			if(ed.equals("Currículo")) {
					this.setCurriculo(getCurriculo());
					System.out.println("Status: " + (this.isStatus()? "CURRÍCULO ALTERADO":"CURRÍCULO NÃO ALTERADO"));

			}else 
				this.setStatus(false);
				System.out.println("NÃO FOI POSSÍVEL TENTE NOVAMENTE");

			}
		}
	
	public boolean entregarCurriculo(String ec) {
		if(this.curriculo == ec){
			System.out.println("CURRÍCULO ENVIADO");
			return true;
		}else {
			System.out.println("NÃO FOI POSSÍVEL ENVIAR, TENTE NOVAMENTE");
			return false;
		}
	}
		
	public String getCodCandidato() {
		return codCandidato;
	}
	public void setCodCandidato(String codCandidato) {
		this.codCandidato = codCandidato;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
