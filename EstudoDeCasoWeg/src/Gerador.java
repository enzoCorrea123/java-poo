/**
 * Classe que representa um gerador da empresa Weg, uma subclasse de ProdutoWeg.
 * Um gerador possui características adicionais de tipo de combustível e autonomia.
 */
public class Gerador extends ProdutoWeg {
	/**
	 * atributo para armazenar o tipo de combustível do gerador
	 */
	private String tipoCombustivel;
	/**
	 * atributo para armazenar a autonomia do gerador
	 */
	private double autonomia;
	/**
     * Realiza a manutenção do gerador com um serviço específico.
     * Imprime informações sobre o serviço e chama o método de manutenção da classe pai.
     *
     * @param servico O serviço de manutenção a ser realizado.
     */	
	@Override
	public void realizarManutencao(ServicoDeManutencao servico) {
		System.out.println("Serviço realizado nos geradores:\n" + servico);
		super.realizarManutencao();
	}
	/**
     * Construtor padrão da classe Gerador.
     */
	public Gerador() {

	}
	 /**
     * Construtor com parâmetros da classe Gerador, incluindo os atributos da classe pai.
     *
     * @param codigo          O código do gerador.
     * @param tipo            O tipo do gerador.
     * @param potencia        A potência do gerador.
     * @param tensao          A tensão do gerador.
     * @param capacidade      A capacidade do gerador.
     * @param preco           O preço do gerador.
     * @param tipoCombustivel O tipo de combustível do gerador.
     * @param autonomia       A autonomia do gerador.
     */
	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoCombustivel, double autonomia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setAutonomia(autonomia);
		setTipoCombustivel(tipoCombustivel);
	}
	/**
     * Construtor com parâmetros da classe Gerador.
     *
     * @param tipoCombustivel O tipo de combustível do gerador.
     * @param autonomia       A autonomia do gerador.
     */
	public Gerador(String tipoCombustivel, double autonomia) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.autonomia = autonomia;
	}
	 /**
     * Obtém o tipo de combustível do gerador.
     *
     * @return O tipo de combustível do gerador.
     */
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	 /**
     * Define o tipo de combustível do gerador.
     *
     * @param tipoCombustivel O novo tipo de combustível do gerador.
     */
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	/**
     * Obtém a autonomia do gerador.
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
     * Representação em string dos detalhes do gerador.
     *
     * @return Uma representação em string dos detalhes do gerador.
     */
	@Override
	public String toString() {
		return "Gerador\nTipo\t|\tPreço\t|\tPotência\t|\tTensão\t|\tCapacidade\t|\tTipo de Combustível\t|\tAutonomia|\n"
				+ getTipo() + "|\t" + getPreco() + "\t|\t\t" + getPotencia() + "\t|\t" + getTensao() + "\t|\t"
				+ getCapacidade() + "\t\t|\t" + getTipoCombustivel() + "\t\t|\t" + getAutonomia()+"\t|\n";
	}

}
