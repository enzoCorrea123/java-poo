package model;

import java.util.ArrayList;

/**
 * Classe para modelar produtos da loja
 * 
 * @author Aluno
 *
 */
public class Produto {
	/**
	 * Atributo para armazenar nome do produto
	 */
	private String nome;
	/**
	 * Atributo para armazenar preço do produto
	 */
	private double preco;
	/**
	 * Atributo para armazenar categoria do produto
	 */
	private String categoria;
	/**
	 * Atributo para armazenar avaliacao do cliente no produto
	 */
	private String avaliacao;
	/**
	 * Atributo para armazenar modelo do produto
	 */
	private String modelo;
	/**
	 * Atributo para armazenar marca do produto
	 */
	private String marca;
	/**
	 * Atributo para armazenar cor do produto
	 */
	private String cor;
	/**
	 * Atributo para armazenar quantidade em estoque do produto
	 */
	private int estoque;
	/**
	 * Atributo para armazenar descrição do produto
	 */
	private String descricao;
	/**
	 * Atributo para armazenar foto do produto
	 */
	private String foto;
	/**
	 * Atributo para armazenar limite de compra do cliente no produto
	 */
	private int limiteDeCompra;
	/**
	 * atributo para quantidade de produto comprada
	 */
	private int quantidadeProduto;
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}


	/**
	 * Construtor da classe produto
	 * 
	 * @param nome
	 * @param preco
	 * @param categoria
	 * @param avaliacao
	 * @param modelo
	 * @param marca
	 * @param cor
	 * @param estoque
	 * @param descricao
	 * @param foto
	 * @param limiteDeCompra
	 */
	public Produto(String nome, double preco, String categoria, String avaliacao, String modelo, String marca,
			String cor, int estoque, String descricao,  int limiteDeCompra) {
		super();
		setNome(nome);
		setPreco(preco);
		setCategoria(categoria);
		setAvaliacao(avaliacao);
		setModelo(modelo);
		setMarca(marca);
		setCor(cor);
		setEstoque(estoque);
		setDescricao(descricao);
		setLimiteDeCompra(limiteDeCompra);
	}

	/**
	 * Construtor vazio para criar o objeto de produto
	 */
	public Produto() {

	}

	public double calculaTotal() {
		return preco * quantidadeProduto;
	}
	/**
	 * método para retornar nome do produto
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * método para armazenar nome do produto
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if (nome.length() > 1 && nome.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.nome = nome;
		}
	}

	/**
	 * método para retornar preço do produto
	 * 
	 * @return
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * método para armazenar preço do produto
	 * 
	 * @param preco
	 */
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}

	}

	/**
	 * método para retornar categoria do produto
	 * 
	 * @return
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * método para armazenar categoria do produto
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		if (categoria.length() > 1 && categoria.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.categoria = categoria;
		}

	}

	/**
	 * método para retornar avaliação do produto
	 * 
	 * @return
	 */
	public String getAvaliacao() {
		return avaliacao;
	}

	/**
	 * método para armazenar avaliação do produto
	 * 
	 * @param avaliacao
	 */
	public void setAvaliacao(String avaliacao) {
		if (avaliacao.length() > 1 && avaliacao.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.avaliacao = avaliacao;
		}

	}

	/**
	 * método para retornar modelo do produto
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * método para armazenar modelo do produto
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		if (modelo.length() > 1 && modelo.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.modelo = modelo;
		}

	}

	/**
	 * método para retornar marca do produto
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * método para armazenar marca do produto
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		if (marca.length() > 1 && marca.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.marca = marca;
		}

	}

	/**
	 * método para retornar cor do produto
	 * 
	 * @return
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * método para armazenar cor do produto
	 * 
	 * @param cor
	 */
	public void setCor(String cor) {
		if (cor.length() > 1 && cor.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.cor = cor;
		}

	}

	/**
	 * método para retornar quantidade em estoque do produto
	 * 
	 * @return
	 */
	public int getEstoque() {
		return estoque;
	}

	/**
	 * método para armazenar quantidade em estoque do produto
	 * 
	 * @param estoque
	 */
	public void setEstoque(int estoque) {
		if (estoque > 0) {
			this.estoque = estoque;
		}

	}

	/**
	 * método para retornar descrição do produto
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * método para armazenar decrição do produto
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		if (descricao.length() > 1 && descricao.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.descricao = descricao;
		}

	}

	/**
	 * método para retornar o número do limite de compra do produto
	 * 
	 * @return
	 */
	public int getLimiteDeCompra() {
		return limiteDeCompra;
	}

	/**
	 * método para armazenar o número do limite de compra do produto
	 * 
	 * @param limiteDeCompra
	 */
	public void setLimiteDeCompra(int limiteDeCompra) {
		if (limiteDeCompra > 3) {
			this.limiteDeCompra = limiteDeCompra;
		}

	}

	/**
	 * método para atualizar a quantidade em estoque com a compra do produto
	 * 
	 * @param quantidade
	 */
	public void atualizarEstoque(int quantidade) {

		this.estoque -= quantidade;
	}

	public double valorQuantidadeTotal() {
		return this.preco * quantidadeProduto;
	}

	/**
	 * método para verificar se há estoque ao desejar comprar o produto
	 * 
	 * @param quantidade
	 * @return
	 */
	public boolean verificarEstoque(int quantidade) {
		if (quantidade <= estoque) {
			return true;
		}
		return false;

	}

	/**
	 * método para avaliar o produto
	 */
	public void avaliar() {

	}

	/**
	 * método para remover categoria do produto
	 */
	public void removerCategoria() {
		this.categoria = "";
	}

	/**
	 * método para remover a foto do produto
	 */
	public void removerFoto() {
		this.foto = "";
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + ", modelo=" + modelo
				+ ", marca=" + marca + ", cor=" + cor + ", descricao=" + descricao+", Estoque: "+estoque;
	}

	
}
