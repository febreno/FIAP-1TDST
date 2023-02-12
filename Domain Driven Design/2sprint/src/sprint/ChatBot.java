package sprint;

public class ChatBot extends Plataforma {
	
	private String nome;
	private String apiKey;
	private String idAssistent;
	private boolean status;
	

	public ChatBot() {
		
	}

	@Override
	public String usuario() {
		return this.getLogin();
	}
	
	public boolean responderDuvidas(String rd) {
		if(this.nome == rd){
			return true;
		}else {
			return false;
		}
	}
	
	public void conectarAgente(String ca) {
		System.out.println("Status: " + (this.isStatus()? "Conectar Agente": "Não Conectar Agente"));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getIdAssistent() {
		return idAssistent;
	}

	public void setIdAssistent(String idAssistent) {
		this.idAssistent = idAssistent;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
