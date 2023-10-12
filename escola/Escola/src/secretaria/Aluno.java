package secretaria;
/**
 * Classe para modelar alunos no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class Aluno {
	/**
	 * declarando atributos strings da classe Aluno
	 */
	private String nome, cpf, endereco, email, responsavel, nascimento;
	/**
	 * declarando atributos inteiros da classe Aluno
	 */
	private int telefone, matricula;

	/**
	 * método para retornar nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * método para armazenar nome
	 * @param nome
	 */
	public void setNome(String nome) {
		if (nome.length() > 1 && nome.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.nome = nome;
		}
	}
	/**
	 * método para retornar cpf
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * método para armazenar cpf
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		if (cpf.length() > 10 && cpf.matches("[0-9]*")) {
			this.cpf = cpf;
		}
	}
	/**
	 * método para retornar endereço
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * método para armazenar enderço
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		if (endereco.length() > 3 && endereco.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.endereco = endereco;
		}

	}
	/**
	 * método para retornar email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * método para armazenar email
	 * @param email
	 */
	public void setEmail(String email) {
		if (email.length() > 5 && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
			this.email = email;
		}
	}
	/**
	 * método para retornar nome responsável
	 * @return responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}
	/**
	 * método para armazenar nome do responsável
	 * @param responsavel
	 */
	public void setResponsavel(String responsavel) {
		if (responsavel.length() > 1 && responsavel.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.responsavel = responsavel;
		}

	}
	/**
	 * método para retornar telefone
	 * @return telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * método para armazenar telefone
	 * @param telefone
	 */
	public void setTelefone(int telefone) {
		if (telefone > 10000000) {
			this.telefone = telefone;
		}

	}
	/**
	 * método para retornar número da matrícula
	 * @return matricula
	 */
	public int getMatricula() {
		return matricula;
	}
	/**
	 * método para armzenar número da matrícula
	 * @param matricula
	 */
	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
		}

	}
	/**
	 * método para retornar data de nascimento
	 * @return nascimento
	 */
	public String getNascimento() {
		return nascimento;
	}
	/**
	 * método para armazenar data de nascimento
	 * @param nascimento
	 */
	public void setNascimento(String nascimento) {
		if (nascimento.length() > 10 && nascimento.matches("[0-9/]*")) {
			this.nascimento = nascimento;
		}

	}
	
	/**
	 * Declarando toString para o objeto de aluno
	 */

	@Override
	public String toString() {
		return "Aluno:\nnome = " + nome + "\ncpf = " + cpf + "\nendereco = " + endereco + "\nemail = " + email
				+ "\nresponsavel = " + responsavel + "\ndataNascimento = " + nascimento + "\ntelefone = " + telefone
				+ "\nmatricula = " + matricula;
	}

}
