package secretaria;
/**
 * Classe para modelar cursos no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class Curso {
	/**
	 * declarando atributos String da classe Curso
	 */
	private String nome, unidadesCurriculares;
	/**
	 * declarando atributos inteiros da classe Curso
	 */
	private int cargaHoraria;

	/**
	 * método para retornar nome do curso
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * método para armazenar nome do curso
	 * @param nome
	 */
	public void setNome(String nome) {
		if (nome.length() > 3 && nome.matches("[A-Za-z ]*")) {
			this.nome = nome;
		}
	}
	/**
	 * método para retornar nome da unidade curricular
	 * @return unidadesCurriculares
	 */
	public String getUnidadesCurriculares() {
		return unidadesCurriculares;
	}
	/**
	 * método para armazenar nome da unidade curricular
	 * @param unidadesCurriculares
	 */
	public void setUnidadesCurriculares(String unidadesCurriculares) {
		if (unidadesCurriculares.length() > 4 && unidadesCurriculares.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.unidadesCurriculares = unidadesCurriculares;
		}

	}
	/**
	 * método para retornar carga horária
	 * @return cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	/**
	 * método para armazenar carga horária
	 * @param cargaHoraria
	 */
	public void setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria >= 0) {
			this.cargaHoraria = cargaHoraria;
		}

	}

}
