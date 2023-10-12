/**
 * Classe que representa um inversor de frequ�ncia da empresa Weg, uma subclasse de ProdutoWeg.
 * Um inversor de frequ�ncia possui caracter�sticas adicionais de capacidade de frequ�ncia e n�mero de fases.
 */
public class InversorFrequencia extends ProdutoWeg {
	/**
	 * atributo para ser a capacidade de frequ�ncia do inversor
	 */
	private double capacidadeFrequencia;
	/**
	 * quantidade de fases que o inversor possui
	 */
	private String numeroFases;
	/**
     * Realiza a manuten��o do inversor de frequ�ncia com um servi�o espec�fico.
     * Imprime informa��es sobre o servi�o e chama o m�todo de manuten��o da classe pai.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     */
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Servi�o realizado nos inversores:\n"+servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padr�o da classe InversorFrequencia.
     */
	public InversorFrequencia() {

	}
	/**
     * Construtor com par�metros da classe InversorFrequencia.
     *
     * @param capacidadeFrequencia A capacidade de frequ�ncia do inversor.
     * @param numeroFases          O n�mero de fases do inversor.
     */
	public InversorFrequencia(double capacidadeFrequencia, String numeroFases) {
		super();
		this.capacidadeFrequencia = capacidadeFrequencia;
		this.numeroFases = numeroFases;
	}
	 /**
     * Construtor com par�metros da classe InversorFrequencia, incluindo os atributos da classe pai.
     *
     * @param codigo              O c�digo do inversor.
     * @param tipo                O tipo do inversor.
     * @param potencia            A pot�ncia do inversor.
     * @param tensao              A tens�o do inversor.
     * @param capacidade          A capacidade do inversor.
     * @param preco               O pre�o do inversor.
     * @param capacidadeFrequencia A capacidade de frequ�ncia do inversor.
     * @param numeroFases         O n�mero de fases do inversor.
     */
	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			double capacidadeFrequencia, String numeroFases) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCapacidade(capacidadeFrequencia);
		setNumeroFases(numeroFases);
	}
	 /**
     * Obt�m a capacidade de frequ�ncia do inversor de frequ�ncia.
     *
     * @return A capacidade de frequ�ncia do inversor de frequ�ncia.
     */
	public double getCapacidadeFrequencia() {
		return capacidadeFrequencia;
	}
	/**
     * Define a capacidade de frequ�ncia do inversor de frequ�ncia.
     *
     * @param capacidadeFrequencia A nova capacidade de frequ�ncia do inversor de frequ�ncia.
     */
	public void setCapacidadeFrequencia(double capacidadeFrequencia) {
		this.capacidadeFrequencia = capacidadeFrequencia;
	}
	/**
     * Obt�m o n�mero de fases do inversor de frequ�ncia.
     *
     * @return O n�mero de fases do inversor de frequ�ncia.
     */
	public String getNumeroFases() {
		return numeroFases;
	}
	/**
     * Define o n�mero de fases do inversor de frequ�ncia.
     *
     * @param numeroFases O novo n�mero de fases do inversor de frequ�ncia.
     */
	public void setNumeroFases(String numeroFases) {
		this.numeroFases = numeroFases;
	}

	@Override
	public String toString() {
		return "Inverso de frequ�ncia\nTipo\t|\tPre�o\t|\tPot�ncia\t|\tTens�o\t|\tCapacidade\t|\tCapacidade Freq\t|\tFases  |\n"
				+ getTipo() + "  |\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getCapacidadeFrequencia() + "\t\t|\t" + getNumeroFases()+"|\n";
	}
	
	

}
