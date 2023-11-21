package model;

/**
 * Classe para modelar endereço do cliente
 * 
 * @author Aluno
 *
 */
public class Endereco {
	/**
	 * atributo para armazenar rua
	 */
	private String rua;
	/**
	 * atributo para armazenar bairro
	 */
	private String bairro;
	/**
	 * atributo para armazenar cidade
	 */
	private String cidade;
	/**
	 * atributo para armazenar estado
	 */
	private String uf;
	/**
	 * atributo para armazenar complemento
	 */
	private String complemento;
	/**
	 * atributo para armazenar numero
	 */
	private int numero;
	/**
	 * atributo para armazenar cep
	 */
	private String cep;


	/**
	 * Construtor para a classe endereço
	 * 
	 * @param rua
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param complemento
	 * @param numero
	 */
	public Endereco(String rua, String bairro, String cidade, String uf, String complemento, int numero, String cep) {
		super();
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setUf(uf);
		setComplemento(complemento);
		setNumero(numero);
		setCep(cep);
	}

	/**
	 * construtor modularizado na classe aluno
	 */
	public Endereco() {

	}

	/**
	 * método para retornar nome da rua
	 * 
	 * @return
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * método para armazenar nome da rua
	 * 
	 * @param rua
	 */
	public void setRua(String rua) {
		if (rua.length() > 1 && rua.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.rua = rua;
		}

	}

	/**
	 * método para retornar nome do bairro
	 * 
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * método para armazenar nome do bairro
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		if (bairro.length() > 1 && bairro.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.bairro = bairro;
		}

	}

	/**
	 * método para retornar nome da cidade
	 * 
	 * @return
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * método para armazenar nome da cidade
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		if (cidade.length() > 1 && cidade.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.cidade = cidade;
		}

	}

	/**
	 * método para retornar sigla do estado
	 * 
	 * @return
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * método para armazenar sigla do estado
	 */
	public void setUf(String uf) {
		if (uf.matches("[A-Z]{2}")) {
			this.uf = uf;
		}

	}

	/**
	 * método para retornar complemento do endereço
	 * 
	 * @return
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * método para armazenar complemento do endereço
	 * 
	 * @param complemento
	 */

	public void setComplemento(String complemento) {
		if (complemento.length() > 1 && complemento.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.complemento = complemento;
		}

	}

	/**
	 * método para retornar numero da casa
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * método para armazenar número da casa
	 * 
	 * @param numero
	 */

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero +", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", CEP="
				+ cep + "]";
	}

}
