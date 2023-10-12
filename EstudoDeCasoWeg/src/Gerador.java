/**
 * Classe que representa um gerador da empresa Weg, uma subclasse de ProdutoWeg.
 * Um gerador possui caracter�sticas adicionais de tipo de combust�vel e autonomia.
 */
public class Gerador extends ProdutoWeg {
	/**
	 * atributo para armazenar o tipo de combust�vel do gerador
	 */
	private String tipoCombustivel;
	/**
	 * atributo para armazenar a autonomia do gerador
	 */
	private double autonomia;
	/**
     * Realiza a manuten��o do gerador com um servi�o espec�fico.
     * Imprime informa��es sobre o servi�o e chama o m�todo de manuten��o da classe pai.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     */	
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Servi�o realizado nos geradores:\n" + servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padr�o da classe Gerador.
     */
	public Gerador() {

	}
	 /**
     * Construtor com par�metros da classe Gerador, incluindo os atributos da classe pai.
     *
     * @param codigo          O c�digo do gerador.
     * @param tipo            O tipo do gerador.
     * @param potencia        A pot�ncia do gerador.
     * @param tensao          A tens�o do gerador.
     * @param capacidade      A capacidade do gerador.
     * @param preco           O pre�o do gerador.
     * @param tipoCombustivel O tipo de combust�vel do gerador.
     * @param autonomia       A autonomia do gerador.
     */
	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoCombustivel, double autonomia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setAutonomia(autonomia);
		setTipoCombustivel(tipoCombustivel);
	}
	/**
     * Construtor com par�metros da classe Gerador.
     *
     * @param tipoCombustivel O tipo de combust�vel do gerador.
     * @param autonomia       A autonomia do gerador.
     */
	public Gerador(String tipoCombustivel, double autonomia) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.autonomia = autonomia;
	}
	 /**
     * Obt�m o tipo de combust�vel do gerador.
     *
     * @return O tipo de combust�vel do gerador.
     */
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	 /**
     * Define o tipo de combust�vel do gerador.
     *
     * @param tipoCombustivel O novo tipo de combust�vel do gerador.
     */
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	/**
     * Obt�m a autonomia do gerador.
     *
     * @return A autonomia do gerador.
     */
	public double getAutonomia() {
		return autonomia;
	}
	/**
     * Define a autonomia do gerador.
     *
     * @param autonomia A nova autonomia do gerador.
     */
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	/**
     * Representa��o em string dos detalhes do gerador.
     *
     * @return Uma representa��o em string dos detalhes do gerador.
     */
	@Override
	public String toString() {
		return "Gerador\nTipo\t|\tPre�o\t|\tPot�ncia\t|\tTens�o\t|\tCapacidade\t|\tTipo de Combust�vel\t|\tAutonomia|\n"
				+ getTipo() + "|\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getTipoCombustivel() + "\t\t|\t" + getAutonomia()+"\t|\n";
	}

}
