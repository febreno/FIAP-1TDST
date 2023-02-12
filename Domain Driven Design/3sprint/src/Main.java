import br.com.fiap.sprint.model.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //IMPLEMENTAÇÃO TESTE DA CRIAÇÃO DOS OBJETOS.

        Estado estado = new Estado(1, "São Paulo", "SP");
        Cidade cidade = new Cidade(1L, "Cotia", estado);
        Bairro bairro = new Bairro(1L, "Jardim Sandra", cidade);
        Pessoa pessoa = new Pessoa(1L, "Física");
        PessoaEndereco pessoaEndereco = new PessoaEndereco(1L, 1L, "06722070", "Rua Corinthians", 76, bairro, pessoa);
        PessoaEmail pessoaEmail = new PessoaEmail(1L, "leandro384650@gmail.com", pessoa);
        PessoaEmail pessoaEmail1 = new PessoaEmail(2L, "leandro384650@live.com", pessoa);
        Candidato candidato = new Candidato("Leandro", new Date(2002, 9, 21), "553381672", "45715089808", "Solteiro", pessoa);
        Empresa empresa = new Empresa(1L, "Pitas Company", "Pitas Company LTDA", new Date(), pessoa);
        Cnpj cnpj = new Cnpj(1L, empresa, "1234567891011");

        System.out.println(empresa.getDataFundacao());
        System.out.println(cnpj.getEmpresa().getRazaoSocial());
        System.out.println(pessoaEmail.getPessoa().getCodPessoa());
        System.out.println(pessoaEmail1.getPessoa().getCodPessoa());
        System.out.println(pessoaEndereco.getPessoa().getCodPessoa());
        System.out.println(candidato.getPessoa().getCodPessoa());
        System.out.println(cidade.getEstado().getUnidadeFederativa());
        System.out.println(bairro.getCidade().getNomCidade());
        System.out.println(pessoaEndereco.getBairro().getCidade().getEstado().getUf());

    }
}