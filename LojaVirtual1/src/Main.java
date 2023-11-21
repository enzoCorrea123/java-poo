import java.util.Scanner;

public class Main {
	public static String nome;
	public static int idade;
	public static String email;
	public static String nomeProduto;
	public static String marca;
	public static String descricao;
	public static String tipo;
	public static int estoque;
	public static float preco;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Cliente cliente;
		Produto produto;
		Pedido pedido;
		Pagamento pagamento;
		System.out.println("Bem vindo ao sistema de gestão da loja virtual do João! O que deseja fazer?"
				+ "\n1 - Área cliente"
				+ "\n2 - Área produto"
				+ "\n3 - Área pedido"
				+ "roduto");
		int opcao = sc.nextInt();
		int opcao2;
		
		switch(opcao) {
		case 1:
			System.out.println("Área do cliente"
					+ "\n1 - Cadastrar novo cliente"
					+ "\n2 - Editar cliente"
					+ "\n3 - Histórico de compras"
					+ "\n4 - Envio de email");
			opcao2 = sc.nextInt();
			
			switch(opcao2) {
			case 1:
				InformacoesCliente();
				
				cliente = new Cliente(nome, idade, email);
				cliente.adicionarCliente(cliente);
				break;
			case 2:
				System.out.println("Digite o id do cliente que deseja editar:");
				int id = sc.nextInt();
				InformacoesCliente();
				cliente = new Cliente(nome, idade, email);
				cliente.editarCliente(id, cliente);
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
			break;
		case 2:
			System.out.println("Área do produto"
					+ "\n1 - Cadastrar novo produto"
					+ "\n2 - Editar produto"
					+ "\n3 - Consultar alterações de preço"
					+ "\n4 - Consultar estoque");
			opcao2 = sc.nextInt();
			switch(opcao2) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			break;
		case 3:
			System.out.println("Área do pedido"
					+ "\n1 - Emitir nota fiscal"
					+ "\n2 - Enviar produto"
					+ "\n3 - Status do pedido");
			opcao2 = sc.nextInt();
			switch(opcao2) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			break;
		}
		

	}
	public static void InformacoesCliente() {
		System.out.println("Digite o nome do cliente:");
		nome = sc.nextLine();
		System.out.println("Digite a idade do cliente:");
		idade = sc.nextInt();
		System.out.println("Digite o email do cliente:");
		email = sc.next();
	}

}
