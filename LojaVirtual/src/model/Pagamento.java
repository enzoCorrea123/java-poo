package model;

/**
 * Classe para modelar o pagamento do produto
 * 
 * @author Aluno
 *
 */
public class Pagamento {
	/**
	 * atributo para armazenar a quantidade de parcelas da compra
	 */
	private int parcelamento;
	/**
	 * atributo para armazenar o desconto do valor do produto
	 */
	private double desconto;
	/**
	 * atributo para armazenar o total do valor da compra
	 */
	private double total;
	/**
	 * atributo para armazenar o valor do frete
	 */
	private double frete;
	/**
	 * atributo para método de pagamento
	 */
	private String metodoPagamento;
	/**
	 * Atributo para referenciar a venda do produto
	 */
	Venda venda;

	/**
	 * método para retornar a quantidade de parcelas
	 * 
	 * @return
	 */
	public int getParcelamento() {
		return parcelamento;
	}
	

	public Pagamento(int parcelamento, double desconto, double total, double frete) {
		super();
		setParcelamento(parcelamento);
		setDesconto(desconto);
		setTotal(total);
		setFrete(frete);
	}

	private void calculaTotal() {
//		total = venda * desconto + frete;
	}

	private void calculaFrete() {
		frete = frete * 1.15;
	}

	public double calculaParcela() {
//		return venda/parcelamento;
		return 0;
	}

	/**
	 * método para armazenar a quantidade de parcelas
	 * 
	 * @param parcelamento
	 */
	public void setParcelamento(int parcelamento) {
		if (parcelamento > 6) {
			this.parcelamento = parcelamento;
		}

	}

	/**
	 * método para retornar o desconto do produto
	 * 
	 * @return
	 */
	public double getDesconto() {
		return desconto;
	}

	/**
	 * método para armazenar o valor do desconto
	 * 
	 * @param desconto
	 */
	public void setDesconto(double desconto) {
		if (desconto > 0) {
			this.desconto = desconto;
		}

	}

	/**
	 * método para retornar o valor total da compra
	 * 
	 * @return
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * método para armazenar o valor total da compra
	 * 
	 * @param total
	 */
	public void setTotal(double total) {
		if (total > 0) {

		}
		this.total = total;
	}

	/**
	 * método para retornar o valor do frete
	 * 
	 * @return
	 */
	public double getFrete() {
		return frete;
	}

	/**
	 * método para armazenar o valor do frete
	 * 
	 * @param frete
	 */
	public void setFrete(double frete) {
		if (frete > 0) {
			this.frete = frete;
		}

	}

}
