package secretaria;
/**
 * Classe para modelar unidade curriculares no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class UC {
	/**
	 * declarando atributos String da classe UC
	 */
	private String avaliacao, professor;
	/**
	 * declarando atributos double da classe UC
	 */
	private double frequencia;
	/**
	 * método para retornar nota da avaliação
	 * @return avaliacao
	 */
	public String getAvaliacao() {
		return avaliacao;
	}	
	/**
	 * método para armazenar nota da avaliação
	 * @param avaliacao
	 */

	public void setAvaliacao(String avaliacao) {
		if (avaliacao.length() > 3 && avaliacao.matches("[A-Za-z] ãâõôçáóúíé*")) {
			this.avaliacao = avaliacao;
		}
	}
	/**
	 * método para retornar nome do professor
	 * @return professor
	 */
	public String getProfessor() {
		return professor;
	}
	/**
	 * método para armazenar o nome do professor
	 * @param professor
	 */
	public void setProfessor(String professor) {
		if (professor.length() > 1 && professor.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.professor = professor;
		}

	}
	/**
	 * método para retornar frequência do aluno
	 * @return frequencia
	 */
	public double getFrequencia() {
		return frequencia;
	}
	/**
	 * método para armazenar frequência do aluno
	 * @param frequencia
	 */
	public void setFrequencia(double frequencia) {
		if (frequencia >= 0) {
			this.frequencia = frequencia;
		}

	}
}
