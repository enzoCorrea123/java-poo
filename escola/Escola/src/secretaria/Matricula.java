package secretaria;
/**
 * Classe para modelar matrícula no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class Matricula {
	/**
	 * declarando atributos inteiros da classe Matricula
	 */
	private int numero;
	/**
	 * declarando atributos String da classe Matricula
	 */
	private String curso, turma;
	/**
	 * método para retornar número da matrícula
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * método para armazenar número da matrícula
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}

	}
	/**
	 * método para retornar nome do curso
	 * @return curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * método para armazenar nome do curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		if (curso.length() > 2 && curso.matches("[A-Za-z] ãâõôçáóúíé*")) {
			this.curso = curso;
		}

	}
	/**
	 * método para retornar nome da turma
	 * @return turma
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * método para armazenar nome da turma
	 * @param turma
	 */
	public void setTurma(String turma) {
		if (turma.length() > 3 && turma.matches("[A-Za-z] ãâõôçáóúíé*")) {
			this.turma = turma;
		}

	}

}
