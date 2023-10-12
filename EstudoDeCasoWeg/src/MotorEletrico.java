/**
 * Classe que representa um motor elétrico da empresa Weg, uma subclasse de ProdutoWeg.
 * Um motor elétrico possui características adicionais de tipo de enrolamento e eficiência.
 */
public class MotorEletrico extends ProdutoWeg {
	/**
	 * atributo para armazenar o tipo de rolamento do motor
	 */
	private String tipoEnrolamento;
	/**
	 * atributo para ser a eficiência do motor
	 */
	private double eficiencia;
	/**
     * Realiza a manutenção do motor elétrico com um serviço específico.
     * Imprime informações sobre o serviço e chama o método de manutenção da classe pai.
     *
     * @param servico O serviço de manutenção a ser realizado.
     */
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Serviço realizado nos motores:\n"+servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padrão da classe MotorEletrico.
     */
	public MotorEletrico() {

	}
	 /**
     * Construtor com parâmetros da classe MotorEletrico.
     *
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @param eficiencia      A eficiência do motor elétrico.
     */
	public MotorEletrico(String tipoEnrolamento, double eficiencia) {
		super();
		this.tipoEnrolamento = tipoEnrolamento;
		this.eficiencia = eficiencia;
	}
	 /**
     * Construtor com parâmetros da classe MotorEletrico, incluindo os atributos da classe pai.
     *
     * @param codigo          O código do motor elétrico.
     * @param tipo            O tipo do motor elétrico.
     * @param potencia        A potência do motor elétrico.
     * @param tensao          A tensão do motor elétrico.
     * @param capacidade      A capacidade do motor elétrico.
     * @param preco           O preço do motor elétrico.
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @param eficiencia      A eficiência do motor elétrico.
     */	
	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoEnrolamento, double eficiencia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setTipoEnrolamento(tipoEnrolamento);
		setEficiencia(eficiencia);
	}
	/**
     * Obtém o tipo de enrolamento do motor elétrico.
     *
     * @return O tipo de enrolamento do motor elétrico.
     */
	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}
	/**
     * Define o tipo de enrolamento do motor elétrico.
     *
     * @param tipoEnrolamento O novo tipo de enrolamento do motor elétrico.
     */
	public void setTipoEnrolamento(String tipoEnrolamento) {
		this.tipoEnrolamento = tipoEnrolamento;
	}
	/**
     * Obtém a eficiência do motor elétrico.
     *
     * @return A eficiência do motor elétrico.
     */
	public double getEficiencia() {
		return eficiencia;
	}
	/**
     * Define a eficiência do motor elétrico.
     *
     * @param eficiencia A nova eficiência do motor elétrico.
     */
	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}
	 /**
     * Representação em string dos detalhes do motor elétrico.
     *
     * @return Uma representação em string dos detalhes do motor elétrico.
     */
	@Override
	public String toString() {
		return "Motor elétrico\nTipo\t|\tPreço\t|\tPotência\t|\tTensão\t|\tCapacidade\t|\tEnrolamento\t|\tEficiência|\n"
				+ getTipo() + "\t|\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getTipoEnrolamento() + "\t|\t" + getEficiencia()+"\t|\n";
	}
	
	

}
