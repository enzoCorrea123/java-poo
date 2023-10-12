package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * Classe para representar cliente
 * 
 * @author enzo_correa
 *
 */
public class Cliente {
	/**
	 * atributo para armazenar nome do cliente
	 */
	private String nome;
	/**
	 * atributo para armazenar cpf do cliente
	 */
	private String cpf;
	/**
	 * atributo para armazenar a data de nascimento do cliente
	 */
	private Date dataNascimento;
	/**
	 * atributo para armazenar o endereço do cliente
	 */
	private Endereco endereco;
	/**
	 * atributo para armazenar email do cliente
	 */
	private String email;
	/**
	 * atributo para armazenar login de usuário do cliente
	 */
	private String usuario;
	/**
	 * atributo para armazenar senha do cliente
	 */
	private String senha;
	/**
	 * atributo para armazenar telefone do cliente
	 */
	private String telefone;
	/**
	 * atributo para armazenar saldo do cliente
	 */
	private double saldo = 0;
	
	Carrinho carrinhoCliente;
	/**
	 * método para cadastrar Cliente
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param endereco
	 * @param email
	 * @param login
	 * @param senha
	 * @param telefone
	 * @param saldo
	 */
	public Cliente(String nome, String cpf, Date dataNascimento, Endereco endereco, String email, String usuario,
			String senha, String telefone, Carrinho carrinho) {
		setNome(nome);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setEmail(email);
		setUsuario(usuario);
		setSenha(senha);
		setTelefone(telefone);
		setSaldo(0);
		setCarrinhoCliente(carrinho);
		
	}

	public Carrinho getCarrinhoCliente() {
		return carrinhoCliente;
	}

	public void setCarrinhoCliente(Carrinho carrinhoCliente) {
		this.carrinhoCliente = carrinhoCliente;
	}

	public Cliente(String nome, String cpf, Date dataNascimento, String email, String usuario, String senha,
			String telefone) {
		setNome(nome);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setEmail(email);
		setUsuario(usuario);
		setSenha(senha);
		setTelefone(telefone);
		setSaldo(0);

	}

	/**
	 * método construtor para sobrecarga
	 */
	public Cliente() {

	}

	/**
	 * Método para realizar o login do cliente
	 * 
	 * @param login
	 * @param senha
	 * @return
	 */
	public boolean login(String usuario, String senha) {
		if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
			return true;
		}
		return false;
	}

	/**
	 * método para atualizar saldo do cliente ao realizar compra
	 * 
	 * @param valor
	 */
	public void comprar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
	}

	/**
	 * método para retornar nome do cliente
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * método para armazenar nome do cliente
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if (nome.length() > 1 && nome.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.nome = nome;
		}
	}

	/**
	 * método para retornar cpf do cliente
	 * 
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * método para armazenar cpf do cliente
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		if (cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		}
	}

	/**
	 * método para retornar data de nascimento do cliente
	 * 
	 * @return
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * método para armazenar data de nascmiento do cliente
	 * 
	 * @param dataNascimento
	 */
	public void setDataNascimento(Date dataNascimento) {

		this.dataNascimento = dataNascimento;
	}

	/**
	 * método para retornar endereço do cliente
	 * 
	 * @return
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * método para armazenar endereço do cliente
	 * 
	 * @param endereco
	 */
	public void setEndereco(Endereco endereco) {
//		if (endereco.length() > 3 && endereco.matches("[A-Za-z ãâõôçáóúíé]*")) {
//			this.endereco = endereco;
//		}
		this.endereco = endereco;
	}

	/**
	 * método para retornar email do cliente
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * método para armazenar email do cliente
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if (email.length() > 5 && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
			this.email = email;
		}
	}

	/**
	 * método para retornar nome de usuário do cliente
	 * 
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * método para armazenar nome de usuário do cliente
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		if (usuario.length() > 1 && usuario.matches("[A-Za-z ãâõôçáóúíé]*")) {
			this.usuario = usuario;
		}
	}

	/**
	 * método para retornar senha do cliente
	 * 
	 * @return
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * método para armazenar senha do cliente
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		if (senha.length() <= 8) {
			this.senha = senha;
		}

	}

	/**
	 * método para retornar telefone do cliente
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * método para armazenar telefone do cliente
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if (telefone.matches("[(]?[0-9]{2}[)]?[\\s]?[9]?[0-9]{4}[-][0-9]{4}")) {
			this.telefone = telefone;
		}
	}

	/**
	 * método para retornar saldo do cliente
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * método para armazenar saldo do cliente
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo += saldo;
		}

	}
	public void setNovoSaldo(double saldo) {
		this.saldo = saldo;

	}

	/**
	 * método para mostar dados do cliente
	 */
	@Override
	public String toString() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		calendar.setTime(dataNascimento);
		return "Cliente nome = " + nome + "\ncpf=" + cpf + "\ndataNascimento=" + formato.format(calendar.getTime())
				+ "\nendereco=" + endereco + "\nemail=" + email + "\ntelefone=" + telefone + "\nusuario=" + usuario
				+ "\nsenha=" + senha;
	}

}
