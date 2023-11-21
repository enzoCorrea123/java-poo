import java.util.ArrayList;

public class Produto {
	private String nome;
	private float preco;
	private String marca;
	private String descricao;
	private String tipo;
	private int estoque;
	private int idProduto;
	private int contador = 0;
	private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	
	public Produto(String nome, float preco, String marca, String descricao, String tipo, int estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.tipo = tipo;
		this.estoque = estoque;
		idProduto = contador;
		contador++;
	}
	
	public void adicionarProduto(Produto produto) {
		listaDeProdutos.add(produto);
	}
	public void editarCliente(int id, Produto mainProduct) {
		for(Produto produto : listaDeProdutos) {
			if(id == produto.idProduto) {
				produto.setNome(mainProduct.nome);
				produto.setPreco(mainProduct.preco);
				produto.setMarca(mainProduct.marca);
				produto.setDescricao(mainProduct.descricao);
				produto.setTipo(mainProduct.tipo);
				produto.setEstoque(mainProduct.estoque);
			}
		}
	}
	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
