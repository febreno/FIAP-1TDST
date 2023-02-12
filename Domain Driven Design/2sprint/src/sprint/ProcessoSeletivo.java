package sprint;

public class ProcessoSeletivo extends Empresa {
	
	private String teste;
	private String dinamica;
	private boolean feedback;
	private boolean status;
	
	public ProcessoSeletivo() {
	
	}

	@Override
	public String recursosHumanos() {
		return this.getDinamica();
	}
	
	public boolean iniciarTeste(String t) {
		if(this.teste == t){
			System.out.println("Iniciar Teste");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean finalizarTeste(String t) {
		if(this.teste == t){
			System.out.println("Finalizar Teste");
			return true;
		}else {
			System.out.println("Teste Não Finalizado");
			return false;
			
		}
	}
	
	public void iniciarDinamica(boolean d) {
		if(this.isStatus()) {
			System.out.println("Iniciar Dinâmica");
			return;
		}else {
			return;
		}
	}
	
	public void finalizarDinamica(boolean fd) {
		if(this.isStatus()) {
			System.out.println("Finalizar Dinâmica");
			return;
		}else {
			return;
		}
	}
	
	public boolean enviarFeedback(String f) {
		if(this.feedback ){
			System.out.println("Feedback Enviado");
			return true;
		}else {
			return false;
		}
	}
	
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public String getDinamica() {
		return dinamica;
	}

	public void setDinamica(String dinamica) {
		this.dinamica = dinamica;
	}

	public boolean isFeedback() {
		return feedback;
	}

	public void setFeedback(boolean feedback) {
		this.feedback = feedback;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
