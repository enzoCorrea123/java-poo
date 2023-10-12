/**
 * Classe abstrata que representa um produto da empresa Weg.
 * Os produtos Weg possuem código, tipo, potência, tensão, capacidade e preço.
 * Essa classe também permite a realização de manutenção nos produtos.
 */
public abstract class ProdutoWeg {
	/**
	 * atributo para ser o identificador do produto
	 */
    private int codigo;
    /**
	 * atributo para classificar como o nome do produto
	 */
    private String tipo;
    /**
	 * atributo para armazenar a potência que é esperada do produto
	 */
    private double potencia;
    /**
	 * atributo para armazenar a tensão que o produto espera
	 */
    private double tensao;
    /**
	 * atributo para armazenar a capacidade do produto
	 */
    private double capacidade;
    /**
	 * atributo para armazenar o preço do produto
	 */
    private double preco;

    /**
     * Construtor padrão da classe ProdutoWeg.
     */
    public ProdutoWeg() {

    }

    /**
     * Construtor com parâmetros da classe ProdutoWeg.
     *
     * @param codigo     O código do produto.
     * @param tipo       O tipo do produto.
     * @param potencia   A potência do produto.
     * @param tensao     A tensão do produto.
     * @param capacidade A capacidade do produto.
     * 
     * @param preco      O preço do produto.
     */
    public ProdutoWeg(int codigo, String tipo, double potencia, double tensao, double capacidade, double preco) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.tensao = tensao;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    /**
     * Obtém o código do produto.
     *
     * @return O código do produto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do produto.
     *
     * @param codigo O novo código do produto.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o tipo do produto.
     *
     * @return O tipo do produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do produto.
     *
     * @param tipo O novo tipo do produto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto.
     *
     * @return A potência do produto.
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Define a potência do produto.
     *
     * @param potencia A nova potência do produto.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão do produto.
     *
     * @return A tensão do produto.
     */
    public double getTensao() {
        return tensao;
    }

    /**
     * Define a tensão do produto.
     *
     * @param tensao A nova tensão do produto.
     */
    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto.
     *
     * @return A capacidade do produto.
     */
    public double getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do produto.
     *
     * @param capacidade A nova capacidade do produto.
     */
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O novo preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Realiza a manutenção do produto com um serviço específico.
     *
     * @param servico O serviço de manutenção a ser realizado.
     */
    public void realizarManutencao(ServicoDeManutencao servico) {
        // Implementação da realização de manutenção
    }

    /**
     * Método que será implementado nas subclasses para executar a manutenção específica.
     */
    public void realizarManutencao() {;
    System.out.println("Serviço Feito");
    }

    /**
     * Representação em string dos detalhes do produto.
     *
     * @return Uma representação em string dos detalhes do produto.
     */
    @Override
    public String toString() {
        return "ProdutoWeg{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                ", tensao=" + tensao +
                ", capacidade=" + capacidade +
                ", preco=" + preco +
                '}';
    }
}