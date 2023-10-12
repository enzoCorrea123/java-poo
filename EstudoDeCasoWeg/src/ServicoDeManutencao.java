/**
 * Classe que representa um serviço de manutenção para os produtos da empresa Weg.
 * Um serviço de manutenção possui uma descrição e um custo associado.
 */
public class ServicoDeManutencao {
	/**
	 * descrição do tipo de serviço pro produto
	 */
    private String descricao;
    /**
	 * valor da prestação do serviço
	 */
    private double custo;

    /**
     * Construtor padrão da classe ServicoDeManutencao.
     */
    public ServicoDeManutencao() {

    }

    /**
     * Construtor com parâmetros da classe ServicoDeManutencao.
     *
     * @param descricao A descrição do serviço de manutenção.
     * @param custo     O custo do serviço de manutenção.
     */
    public ServicoDeManutencao(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    /**
     * Obtém a descrição do serviço de manutenção.
     *
     * @return A descrição do serviço de manutenção.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do serviço de manutenção.
     *
     * @param descricao A nova descrição do serviço de manutenção.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço de manutenção.
     *
     * @return O custo do serviço de manutenção.
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Define o custo do serviço de manutenção.
     *
     * @param custo O novo custo do serviço de manutenção.
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * Representação em string dos detalhes do serviço de manutenção.
     *
     * @return Uma representação em string dos detalhes do serviço de manutenção.
     */
    @Override
    public String toString() {
        return "ServicoDeManutencao{" +
                "descricao='" + descricao + '\'' +
                ", custo=" + custo +
                '}';
    }
}