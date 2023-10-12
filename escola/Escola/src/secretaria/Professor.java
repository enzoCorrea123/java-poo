package secretaria;
/**
 * Classe para modelar professores no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class Professor {
	/**
	 * declarando atributos String da classe Professor
	 */
	private String nome, cpf, endereco, email, dataNascimento;
	/**
	 * declarando atributos inteiros da classe Professor
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
		if (cpf.length() > 1 && cpf.matches("[A-Za-z ]*")) {
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
	 * método para retornar dataNascimento
	 * @return dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * método para armazenar dataNascimento
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento.length() > 5 && dataNascimento.matches("[0-9/]*")) {
			this.dataNascimento = dataNascimento;
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
		if (telefone > 100000000) {
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
	 * Declarando toString para o objeto de professores
	 */
	@Override
	public String toString() {
		return "Professor nome = " + nome + "\ncpf = " + cpf + "\nendereco = " + endereco + "\nemail = " + email
				+ "\ndataNascimento = " + dataNascimento + "\ntelefone = " + telefone + "\nmatricula = " + matricula;
	}

}
