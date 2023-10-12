import java.util.ArrayList;

/**
 * Classe que representa a empresa Weg e gerencia a listagem de produtos e
 * serviços. A empresa Weg possui uma lista de produtos e uma lista de serviços
 * de manutenção.
 */
public class Weg {
	/**
	 * armazenar vários produtos em uma lista
	 */
	private ArrayList<ProdutoWeg> listaDeProdutos = new ArrayList<>();
	/**
	 * armazenar vários serviços em uma lista
	 */
	private ArrayList<ServicoDeManutencao> listaDeServicos = new ArrayList<>();

	/**
	 * Adiciona um produto à lista de produtos da empresa Weg.
	 *
	 * @param produto O produto a ser adicionado.
	 */
	public void adicionarProduto(ProdutoWeg produto) {
		listaDeProdutos.add(produto);
	}

	/**
	 * Adiciona um serviço de manutenção à lista de serviços da empresa Weg.
	 *
	 * @param servico O serviço de manutenção a ser adicionado.
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
	 * Lista todos os serviços de manutenção da empresa Weg.
	 *
	 * @return Uma lista contendo todos os serviços de manutenção da empresa Weg.
	 */
	public ArrayList<ServicoDeManutencao> listarServico() {
		return listaDeServicos;
	}

	/**
	 * Obtém um produto da lista de produtos da empresa Weg pelo índice.
	 *
	 * @param index O índice do produto na lista.
	 * @return O produto correspondente ao índice.
	 */
	public ProdutoWeg listarProduto(int index) {
		return listaDeProdutos.get(index);
	}

	/**
	 * Obtém um serviço de manutenção da lista de serviços da empresa Weg pelo
	 * índice.
	 *
	 * @param index O índice do serviço de manutenção na lista.
	 * @return O serviço de manutenção correspondente ao índice.
	 */
	public ServicoDeManutencao listarServico(int index) {
		return listaDeServicos.get(index);
	}
	/**
	 * Método para remover um único produto
	 * @param index identificador do produto
	 */
	public void removerProduto(int index) {
		listaDeProdutos.remove(index);
	}
	/**
	 * Método para remover um único serviço
	 * @param index identificador do serviço
	 */
	public void removerServico(int index) {
		listaDeServicos.remove(index);
	}
	/**
	 * Método para remover todos os produtos da lista de produtos
	 */
	public void removerTodosProdutos() {
		listaDeProdutos.clear();
	}
	/**
	 * Método para remover todos os produtos da lista de serviços
	 */
	public void removerTodosServicos() {
		listaDeServicos.clear();
	}

}
