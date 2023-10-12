package secretaria;
/**
 * Classe para modelar avaliações no sistema de escola
 * @author Enzo Rufino Correa
 *
 */
public class Avaliacao {
	/**
	 * declarando atributos da classe Avaliação
	 */
	private int notas;
	/**
	 * método para retornar nota
	 * @return notas
	 */
	public int getNotas() {
		return notas;
	}
	/**
	 * método para armazenar nota
	 * @param notas
	 */
	public void setNotas(int notas) {
		if (notas >= 0) {
			this.notas = notas;
		}

	}
}
