package sprint;

import javax.swing.JOptionPane;

public class TesteSprint {

	public static void main(String[] args) {
		
		Administrador adm = new Administrador();
		
		adm.setNome(JOptionPane.showInputDialog("Digite um Nome para o Administrador: "));
		adm.setNome(JOptionPane.showInputDialog("Digite o nome da Empresa: "));
		adm.setLogin(JOptionPane.showInputDialog("Crie seu Login: " + "\n(exemplo: IBM@190)"));
		adm.setSenha(JOptionPane.showInputDialog("Digite uma senha: "));
		adm.cadastrarAdm("IBM");
		
		System.out.println("\n Cadastro do Administrador " + adm.getNome() +
				"\n EMPRESA: " + adm.getNome() + 
				"\n Login: " + adm.getLogin() +
				"\n Senha: " + adm.getSenha() 
				);
		
		System.out.println("===================================================");
		
		Recrutador rh = new Recrutador();
		
		rh.setNome(JOptionPane.showInputDialog("Recrutador: "));
		rh.setLogin(JOptionPane.showInputDialog("Login: " + "\n(exemplo: IBM@000)"));
		rh.setSenha(JOptionPane.showInputDialog("Digite uma senha: "));
		rh.editarRecrutador("Editar");
		
		System.out.println("\n Recrutador " + rh.getNome() +
				"\n Login: " + rh.getLogin() +
				"\n Senha: " + rh.getSenha() 
				);
		
		System.out.println("===================================================");
		
		Vaga v = new Vaga();
		
		v.setCodVaga(00);
		v.setDataVaga("01/01/01");
		v.setDescVaga("Estágio IBM");
		v.setEmpresa("IBM");
		v.setEndereco("x");
		v.cadastrarVaga("Nova Vaga");
		
		System.out.println("Código da Vaga: " + v.getCodVaga() +
				"\nData da Vaga: " + v.getDataVaga() +
				"\nDescrição da Vaga: " + v.getDescVaga() +
				"\nEmpresa: " + v.getEmpresa() +
				"\nEndereço: " + v.getEndereco()
				
				);
		
		System.out.println("===================================================");
		
		Usuario user = new Usuario();
		
		user.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		user.setLogin(JOptionPane.showInputDialog("Login: " + "\n(exemplo: user.1900)"));
		user.setSenha((JOptionPane.showInputDialog("Digite uma senha: ")));
		
		System.out.println("\nUsuário: " + user.getNome() +
				"\n Login: " + user.getLogin() +
				"\n Senha: " + user.getSenha()
				);
		
		System.out.println("===================================================");
		
		ProcessoSeletivo ps = new ProcessoSeletivo();
		
		ps.setTeste("Iniciar Teste");
		ps.finalizarTeste("Teste Finalizado");
		ps.setDinamica("Iniciar Dinâmica");
		ps.finalizarDinamica(true);
		ps.enviarFeedback("Feedback Enviado");
		
		System.out.println("Processo Seletivo: " + ps.getTeste() +
				"\nProcesso Seletivo: " + ps.finalizarTeste(null) +
				"\nDinâmica: " + ps.getDinamica() +
				"\nFeedback: " + ps.enviarFeedback(null)
				);

		
	}

}
