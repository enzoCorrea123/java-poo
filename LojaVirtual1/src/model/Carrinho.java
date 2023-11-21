package model;

import java.util.ArrayList;

/**
 * Classe do carrinho de compras
 * 
 * @author Enzo_Correa
 *
 */
public class Carrinho {
	/**
	 * lista de produtos do carrinho
	 */
	private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	/**
	 * atributo para calcular valor total do carrinho
	 */
	private double valorTotal;
	/**
	 * atributo para associar cliente ao carrinho
	 */
	private Cliente cliente;

	/**
	 * Método construtor para carrinho
	 * 
	 * @param listaDeProdutos
	 * @param quantidadeProdutos
	 * @param valorTotal
	 */
	public Carrinho(ArrayList<Produto> listaDeProdutos, ArrayList<Integer> quantidadeProdutos, double valorTotal) {
		super();
		this.listaDeProdutos = listaDeProdutos;
		this.valorTotal = valorTotal;
	}

	/**
	 * método construtor vazio para criar objetos
	 */
	public Carrinho() {
		this.cliente = cliente;
	}

	/**
	 * método para armazenar produtos e quantidade
	 * 
	 * @param produto
	 * @param quantidade
	 */
	public void adicionarProduto(Produto produto, int quantidade) {
		listaDeProdutos.add(produto);

	}

	/**
	 * método para remover produto da lista
	 * 
	 * @param index
	 */
	public void removerProduto(int index) {
		listaDeProdutos.remove(index);
	}

	/**
	 * método para retornar valor total do carrinho
	 * 
	 * @return
	 */
	public double getValorTotal() {
		valorTotal = 0;
		for(Produto produto : listaDeProdutos) {
			valorTotal += produto.calculaTotal();
		}
		return valorTotal;
	}

	/**
	 * método para calcular valor total do carrinho
	 * 
	 * @param produto
	 * @param quantidade
	 */
	

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(Produto produto) {
		listaDeProdutos.add(produto);
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
