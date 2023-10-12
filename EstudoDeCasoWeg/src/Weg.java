import java.util.ArrayList;

/**
 * Classe que representa a empresa Weg e gerencia a listagem de produtos e
 * servi�os. A empresa Weg possui uma lista de produtos e uma lista de servi�os
 * de manuten��o.
 */
public class Weg {
	/**
	 * armazenar v�rios produtos em uma lista
	 */
	private ArrayList<ProdutoWeg> listaDeProdutos = new ArrayList<>();
	/**
	 * armazenar v�rios servi�os em uma lista
	 */
	private ArrayList<ServicoDeManutencao> listaDeServicos = new ArrayList<>();

	/**
	 * Adiciona um produto � lista de produtos da empresa Weg.
	 *
	 * @param produto O produto a ser adicionado.
	 */
	public void adicionarProduto(ProdutoWeg produto) {
		listaDeProdutos.add(produto);
	}

	/**
	 * Adiciona um servi�o de manuten��o � lista de servi�os da empresa Weg.
	 *
	 * @param servico O servi�o de manuten��o a ser adicionado.
	 */
	public void adicionarServico(ServicoDeManutencao servico) {
		listaDeServicos.add(servico);
	}

	/**
	 * Lista todos os produtos da empresa Weg.
	 *
	 * @return Uma lista contendo todos os produtos da empresa Weg.
	 */
	public ArrayList<ProdutoWeg> listarProduto() {
		return listaDeProdutos;
	}

	/**
	 * Lista todos os servi�os de manuten��o da empresa Weg.
	 *
	 * @return Uma lista contendo todos os servi�os de manuten��o da empresa Weg.
	 */
	public ArrayList<ServicoDeManutencao> listarServico() {
		return listaDeServicos;
	}

	/**
	 * Obt�m um produto da lista de produtos da empresa Weg pelo �ndice.
	 *
	 * @param index O �ndice do produto na lista.
	 * @return O produto correspondente ao �ndice.
	 */
	public ProdutoWeg listarProduto(int index) {
		return listaDeProdutos.get(index);
	}

	/**
	 * Obt�m um servi�o de manuten��o da lista de servi�os da empresa Weg pelo
	 * �ndice.
	 *
	 * @param index O �ndice do servi�o de manuten��o na lista.
	 * @return O servi�o de manuten��o correspondente ao �ndice.
	 */
	public ServicoDeManutencao listarServico(int index) {
		return listaDeServicos.get(index);
	}
	/**
	 * M�todo para remover um �nico produto
	 * @param index identificador do produto
	 */
	public void removerProduto(int index) {
		listaDeProdutos.remove(index);
	}
	/**
	 * M�todo para remover um �nico servi�o
	 * @param index identificador do servi�o
	 */
	public void removerServico(int index) {
		listaDeServicos.remove(index);
	}
	/**
	 * M�todo para remover todos os produtos da lista de produtos
	 */
	public void removerTodosProdutos() {
		listaDeProdutos.clear();
	}
	/**
	 * M�todo para remover todos os produtos da lista de servi�os
	 */
	public void removerTodosServicos() {
		listaDeServicos.clear();
	}

}
