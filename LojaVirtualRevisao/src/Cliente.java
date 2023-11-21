import java.util.ArrayList;

public class Cliente {
	private String nome;
	private int idade;
	private Pedido pedido;
	private String email;
	private int idCliente;
	private int contador = 0;
	private ArrayList<Cliente> listaDeCliente = new ArrayList<>();
	
	public Cliente(String nome, int idade, String email, Pedido pedido) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.pedido = pedido;
	}
	public Cliente(String nome, int idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		idCliente = contador;
		contador++;
	}
	
	public void adicionarCliente(Cliente cliente) {
		listaDeCliente.add(cliente);
	}
	public void editarCliente(int id, Cliente mainClient) {
		for(Cliente cliente : listaDeCliente) {
			if(id == cliente.idCliente) {
				cliente.setNome(mainClient.nome);
				cliente.setEmail(mainClient.email);
				cliente.setIdade(mainClient.idade);
			}
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
