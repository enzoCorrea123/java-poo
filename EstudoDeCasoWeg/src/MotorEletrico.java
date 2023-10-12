/**
 * Classe que representa um motor el�trico da empresa Weg, uma subclasse de ProdutoWeg.
 * Um motor el�trico possui caracter�sticas adicionais de tipo de enrolamento e efici�ncia.
 */
public class MotorEletrico extends ProdutoWeg {
	/**
	 * atributo para armazenar o tipo de rolamento do motor
	 */
	private String tipoEnrolamento;
	/**
	 * atributo para ser a efici�ncia do motor
	 */
	private double eficiencia;
	/**
     * Realiza a manuten��o do motor el�trico com um servi�o espec�fico.
     * Imprime informa��es sobre o servi�o e chama o m�todo de manuten��o da classe pai.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     */
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Servi�o realizado nos motores:\n"+servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padr�o da classe MotorEletrico.
     */
	public MotorEletrico() {

	}
	 /**
     * Construtor com par�metros da classe MotorEletrico.
     *
     * @param tipoEnrolamento O tipo de enrolamento do motor el�trico.
     * @param eficiencia      A efici�ncia do motor el�trico.
     */
	public MotorEletrico(String tipoEnrolamento, double eficiencia) {
		super();
		this.tipoEnrolamento = tipoEnrolamento;
		this.eficiencia = eficiencia;
	}
	 /**
     * Construtor com par�metros da classe MotorEletrico, incluindo os atributos da classe pai.
     *
     * @param codigo          O c�digo do motor el�trico.
     * @param tipo            O tipo do motor el�trico.
     * @param potencia        A pot�ncia do motor el�trico.
     * @param tensao          A tens�o do motor el�trico.
     * @param capacidade      A capacidade do motor el�trico.
     * @param preco           O pre�o do motor el�trico.
     * @param tipoEnrolamento O tipo de enrolamento do motor el�trico.
     * @param eficiencia      A efici�ncia do motor el�trico.
     */	
	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoEnrolamento, double eficiencia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setTipoEnrolamento(tipoEnrolamento);
		setEficiencia(eficiencia);
	}
	/**
     * Obt�m o tipo de enrolamento do motor el�trico.
     *
     * @return O tipo de enrolamento do motor el�trico.
     */
	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}
	/**
     * Define o tipo de enrolamento do motor el�trico.
     *
     * @param tipoEnrolamento O novo tipo de enrolamento do motor el�trico.
     */
	public void setTipoEnrolamento(String tipoEnrolamento) {
		this.tipoEnrolamento = tipoEnrolamento;
	}
	/**
     * Obt�m a efici�ncia do motor el�trico.
     *
     * @return A efici�ncia do motor el�trico.
     */
	public double getEficiencia() {
		return eficiencia;
	}
	/**
     * Define a efici�ncia do motor el�trico.
     *
     * @param eficiencia A nova efici�ncia do motor el�trico.
     */
	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}
	 /**
     * Representa��o em string dos detalhes do motor el�trico.
     *
     * @return Uma representa��o em string dos detalhes do motor el�trico.
     */
	@Override
	public String toString() {
		return "Motor el�trico\nTipo\t|\tPre�o\t|\tPot�ncia\t|\tTens�o\t|\tCapacidade\t|\tEnrolamento\t|\tEfici�ncia|\n"
				+ getTipo() + "\t|\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getTipoEnrolamento() + "\t|\t" + getEficiencia()+"\t|\n";
	}
	
	

}
