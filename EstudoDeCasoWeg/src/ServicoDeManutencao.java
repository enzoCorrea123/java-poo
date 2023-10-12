/**
 * Classe que representa um servi�o de manuten��o para os produtos da empresa Weg.
 * Um servi�o de manuten��o possui uma descri��o e um custo associado.
 */
public class ServicoDeManutencao {
	/**
	 * descri��o do tipo de servi�o pro produto
	 */
    private String descricao;
    /**
	 * valor da presta��o do servi�o
	 */
    private double custo;

    /**
     * Construtor padr�o da classe ServicoDeManutencao.
     */
    public ServicoDeManutencao() {

    }

    /**
     * Construtor com par�metros da classe ServicoDeManutencao.
     *
     * @param descricao A descri��o do servi�o de manuten��o.
     * @param custo     O custo do servi�o de manuten��o.
     */
    public ServicoDeManutencao(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    /**
     * Obt�m a descri��o do servi�o de manuten��o.
     *
     * @return A descri��o do servi�o de manuten��o.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descri��o do servi�o de manuten��o.
     *
     * @param descricao A nova descri��o do servi�o de manuten��o.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obt�m o custo do servi�o de manuten��o.
     *
     * @return O custo do servi�o de manuten��o.
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Define o custo do servi�o de manuten��o.
     *
     * @param custo O novo custo do servi�o de manuten��o.
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * Representa��o em string dos detalhes do servi�o de manuten��o.
     *
     * @return Uma representa��o em string dos detalhes do servi�o de manuten��o.
     */
    @Override
    public String toString() {
        return "ServicoDeManutencao{" +
                "descricao='" + descricao + '\'' +
                ", custo=" + custo +
                '}';
    }
}