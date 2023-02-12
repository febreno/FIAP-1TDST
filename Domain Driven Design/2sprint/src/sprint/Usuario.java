package sprint;

public class Usuario extends Plataforma {

	private String login;
	private String senha;
	private boolean status;
	
	public Usuario() {
		
	}

	@Override
	public String usuario() {
		return this.getLogin();
	}
	
	public boolean validaUsuario(String login, String senha) {
		if(login.equals(this.login) && (senha == this.senha)) {
			return true;
		}else {
			return false;
		}
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
