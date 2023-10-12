/**
 * Classe que representa um inversor de frequência da empresa Weg, uma subclasse de ProdutoWeg.
 * Um inversor de frequência possui características adicionais de capacidade de frequência e número de fases.
 */
public class InversorFrequencia extends ProdutoWeg {
	/**
	 * atributo para ser a capacidade de frequência do inversor
	 */
	private double capacidadeFrequencia;
	/**
	 * quantidade de fases que o inversor possui
	 */
	private String numeroFases;
	/**
     * Realiza a manutenção do inversor de frequência com um serviço específico.
     * Imprime informações sobre o serviço e chama o método de manutenção da classe pai.
     *
     * @param servico O serviço de manutenção a ser realizado.
     */
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Serviço realizado nos inversores:\n"+servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padrão da classe InversorFrequencia.
     */
	public InversorFrequencia() {

	}
	/**
     * Construtor com parâmetros da classe InversorFrequencia.
     *
     * @param capacidadeFrequencia A capacidade de frequência do inversor.
     * @param numeroFases          O número de fases do inversor.
     */
	public InversorFrequencia(double capacidadeFrequencia, String numeroFases) {
		super();
		this.capacidadeFrequencia = capacidadeFrequencia;
		this.numeroFases = numeroFases;
	}
	 /**
     * Construtor com parâmetros da classe InversorFrequencia, incluindo os atributos da classe pai.
     *
     * @param codigo              O código do inversor.
     * @param tipo                O tipo do inversor.
     * @param potencia            A potência do inversor.
     * @param tensao              A tensão do inversor.
     * @param capacidade          A capacidade do inversor.
     * @param preco               O preço do inversor.
     * @param capacidadeFrequencia A capacidade de frequência do inversor.
     * @param numeroFases         O número de fases do inversor.
     */
	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			double capacidadeFrequencia, String numeroFases) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCapacidade(capacidadeFrequencia);
		setNumeroFases(numeroFases);
	}
	 /**
     * Obtém a capacidade de frequência do inversor de frequência.
     *
     * @return A capacidade de frequência do inversor de frequência.
     */
	public double getCapacidadeFrequencia() {
		return capacidadeFrequencia;
	}
	/**
     * Define a capacidade de frequência do inversor de frequência.
     *
     * @param capacidadeFrequencia A nova capacidade de frequência do inversor de frequência.
     */
	public void setCapacidadeFrequencia(double capacidadeFrequencia) {
		this.capacidadeFrequencia = capacidadeFrequencia;
	}
	/**
     * Obtém o número de fases do inversor de frequência.
     *
     * @return O número de fases do inversor de frequência.
     */
	public String getNumeroFases() {
		return numeroFases;
	}
	/**
     * Define o número de fases do inversor de frequência.
     *
     * @param numeroFases O novo número de fases do inversor de frequência.
     */
	public void setNumeroFases(String numeroFases) {
		this.numeroFases = numeroFases;
	}

	@Override
	public String toString() {
		return "Inverso de frequência\nTipo\t|\tPreço\t|\tPotência\t|\tTensão\t|\tCapacidade\t|\tCapacidade Freq\t|\tFases  |\n"
				+ getTipo() + "  |\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getCapacidadeFrequencia() + "\t\t|\t" + getNumeroFases()+"|\n";
	}
	
	

}
