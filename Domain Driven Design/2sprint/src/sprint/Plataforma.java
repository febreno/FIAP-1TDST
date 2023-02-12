package sprint;

public abstract class Plataforma {

	private int codPlataforma;
	private String nome;
	private String login;
	private String senha;
	private boolean status;
	
	public Plataforma() {

	}
	
	public abstract String usuario();
	
	public boolean conectar(String c) {
		if(this.login == c){
			System.out.println("Acesso	Permitido!");
			return true;
		}else {
			System.out.println("Acesso	Negado!");
			return false;
		}
	}
	
	public boolean desconectar(String d) {
		if(this.login == d){
			System.out.println("DESCONECTADO");
			return true;
		}else {
			System.out.println("CONECTADO");
			return false;
		}
	}
	
	public int getCodPlataforma() {
		return codPlataforma;
	}

	public void setCodPlataforma(int codPlataforma) {
		this.codPlataforma = codPlataforma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
