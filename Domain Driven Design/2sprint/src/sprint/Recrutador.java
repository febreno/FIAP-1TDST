package sprint;

public class Recrutador extends Empresa {

	private String codRecrutador;
	private String login;
	private String senha;
	private String nome;
	private String endereco;
	private int cpf;
	private int telefone;
	private boolean status;
	
	public Recrutador() {
	
	}

	@Override
	public String recursosHumanos() {
		return this.getCodRecrutador();
	}
	
	public void cadastrarRecrutador(String cr) {
		this.setCodRecrutador(cr);
		this.setStatus(true);
		if(cr.equals("Nome")) {
			this.getLogin();	
		}else if(cr.equals("Login")) {
			this.setLogin(getLogin());
		}else {
			System.out.println("Recrutador não cadastrado");
			this.setStatus(false);
		}
		
	}
	
	public void editarRecrutador(String e) {
		this.setEndereco(e);
		this.setTelefone(0);
		this.setLogin("abc");
		this.setSenha(getSenha());
		this.setStatus(true);
		if(e.equals("Endereço X")); {
			this.setEndereco(e);	
		} 
		if(e.equals("Telefone 0")) {
			this.setTelefone(0);
		if(e.equals("Login")) {
				this.setLogin(e);
		}
		if(e.equals("Senha")) {
			this.setSenha(e);
		}else {
			this.setStatus(false);
		}

	}
}
	
	public boolean publicarVaga(String v) {
		if(this.isStatus()) {
			System.out.println("Vaga publicada");
			return true;
		}else {
			return false;
		}
	}
	
	public void processoSeletivo(String c) {
		if(this.isStatus()) {
			System.out.println("Vaga publicada");
			return;
		}else {
			return;
		}
	}
	public void encerrarProcesso(boolean s) {
		if(this.isStatus()) {
			System.out.println("Encerrar");
			return;
		}else {
			return;
		}
	}
	
	public String getCodRecrutador() {
		return codRecrutador;
	}

	public void setCodRecrutador(String codRecrutador) {
		this.codRecrutador = codRecrutador;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
