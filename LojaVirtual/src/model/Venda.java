package model;

/**
 * Classe para modelar a venda do produto
 * 
 * @author Aluno
 *
 */
public class Venda {
	/**
	 * Atributo para referenciar o cliente que está fazendo a compra
	 */
	private Cliente cliente;
	/**
	 * Atributo para representar a empresa que está vendendo o produto
	 */
	private String empresa;
	/**
	 * Atributo para referenciar o produto que está sendo vendido
	 */
	private Produto produto;

	/**
	 * Método para retornar cliente
	 * 
	 * @return
	 */

	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Método construtor para modelar a classe
	 * 
	 * @param cliente
	 * @param empresa
	 * @param produto
	 */
	public Venda(Cliente cliente, String empresa, Produto produto) {
		super();
		this.cliente = cliente;
		this.empresa = empresa;
		this.produto = produto;
	}

	/**
	 * Método construtor para sobrecarga
	 */
	public Venda() {

	}

	/**
	 * Método para armazenar cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método para retornar empresa
	 * 
	 * @return
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Método para armazenar empresa
	 * 
	 * @param empresa
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * Método para retornar produto
	 * 
	 * @return
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * Método para armazenar produto
	 * 
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
