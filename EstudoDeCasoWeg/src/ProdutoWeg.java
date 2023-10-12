/**
 * Classe abstrata que representa um produto da empresa Weg.
 * Os produtos Weg possuem c�digo, tipo, pot�ncia, tens�o, capacidade e pre�o.
 * Essa classe tamb�m permite a realiza��o de manuten��o nos produtos.
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
	 * atributo para armazenar a pot�ncia que � esperada do produto
	 */
    private double potencia;
    /**
	 * atributo para armazenar a tens�o que o produto espera
	 */
    private double tensao;
    /**
	 * atributo para armazenar a capacidade do produto
	 */
    private double capacidade;
    /**
	 * atributo para armazenar o pre�o do produto
	 */
    private double preco;

    /**
     * Construtor padr�o da classe ProdutoWeg.
     */
    public ProdutoWeg() {

    }

    /**
     * Construtor com par�metros da classe ProdutoWeg.
     *
     * @param codigo     O c�digo do produto.
     * @param tipo       O tipo do produto.
     * @param potencia   A pot�ncia do produto.
     * @param tensao     A tens�o do produto.
     * @param capacidade A capacidade do produto.
     * 
     * @param preco      O pre�o do produto.
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
     * Obt�m o c�digo do produto.
     *
     * @return O c�digo do produto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o c�digo do produto.
     *
     * @param codigo O novo c�digo do produto.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obt�m o tipo do produto.
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
     * Obt�m a pot�ncia do produto.
     *
     * @return A pot�ncia do produto.
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Define a pot�ncia do produto.
     *
     * @param potencia A nova pot�ncia do produto.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obt�m a tens�o do produto.
     *
     * @return A tens�o do produto.
     */
    public double getTensao() {
        return tensao;
    }

    /**
     * Define a tens�o do produto.
     *
     * @param tensao A nova tens�o do produto.
     */
    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    /**
     * Obt�m a capacidade do produto.
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
     * Obt�m o pre�o do produto.
     *
     * @return O pre�o do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o pre�o do produto.
     *
     * @param preco O novo pre�o do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Realiza a manuten��o do produto com um servi�o espec�fico.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     */
    public void realizarManutencao(ServicoDeManutencao servico) {
        // Implementa��o da realiza��o de manuten��o
    }

    /**
     * M�todo que ser� implementado nas subclasses para executar a manuten��o espec�fica.
     */
    public void realizarManutencao() {;
    System.out.println("Servi�o Feito");
    }

    /**
     * Representa��o em string dos detalhes do produto.
     *
     * @return Uma representa��o em string dos detalhes do produto.
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