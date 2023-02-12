package sprint;

public class Administrador extends Empresa {

	private String login;
	private String nome;
	private String senha;
	private boolean status;
	
	@Override
	public String recursosHumanos() {
		return this.getLogin();
	}
	
	public Administrador() {
		
	}
	
	
	public void cadastrarAdm(String adm) {
		this.setNome(adm);
		this.setSenha(getSenha());
		this.setStatus(true);
		if(adm.equals("Nome")) {
			this.getLogin();	
		}else if(adm.equals("Login")) {
			this.setLogin(getLogin());
		}else {
			System.out.println("Recrutador não cadastrado");
			this.setStatus(false);
		}
		
	}
	
	public void listarUsuario(int q) {
		this.listarUsuario(q);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
